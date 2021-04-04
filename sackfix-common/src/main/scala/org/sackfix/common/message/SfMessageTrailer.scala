package org.sackfix.common.message

import org.sackfix.common.validated.fields.SfFixField
import org.sackfix.field._
import org.sackfix.common.validated.fields.SfFixDecoder
import org.sackfix.field.CheckSumField

import scala.collection.immutable.HashSet

/**
  * Created by Jonathan during 2016.
  *
  * The checksum field is NOT optional, but will be populated on incoming messages.
  * You can leave it as None on outgoing, as when you call fixStr(headerAndBody) the
  * checksum will be recalculated.
  */
case class SfMessageTrailer( signatureLengthField: Option[SignatureLengthField] = None,
                             signatureField: Option[SignatureField] = None,
                             checkSumField: Option[CheckSumField] = None) {

  var lastChecksumFld: CheckSumField = checkSumField.getOrElse(new CheckSumField("000"))

  def fixStr: String = {val b = new StringBuilder()
    if (signatureLengthField.isDefined) signatureLengthField.foreach(f=>b.append(f.fixStr))
    if (signatureField.isDefined) signatureField.foreach(f=>b.append(f.fixStr))
    b.append(lastChecksumFld.fixStr)
    b.toString()
  }

  def fixStr(headerAndBody: StringBuilder): String = {
    val interim = new StringBuilder()
    if (signatureLengthField.isDefined) signatureLengthField.foreach(f=>interim.append(f.fixStr))
    if (signatureField.isDefined) signatureField.foreach(f=>interim.append(f.fixStr))

    val checkSum = SfMessageTrailer.calcCheckSum(headerAndBody,interim)
    lastChecksumFld = SfMessageTrailer.createCheckSumField(checkSum)

    interim.append(SfMessageTrailer.checkSumFixStr(checkSum))
    interim.toString()
  }

  override def toString: String = {
    signatureLengthField.map(_.toString + ",").getOrElse("") +
      signatureField.map(_.toString + ",").getOrElse("") +
      lastChecksumFld.toString
  }
}

object SfMessageTrailer extends SfFixDecoder {
  lazy val MandatoryFields: HashSet[Int] = HashSet[Int](CheckSumField.TagId)

  lazy val OptionalFields: HashSet[Int] = HashSet[Int](SignatureLengthField.TagId, SignatureField.TagId)

  override lazy val RepeatingGroupsTags = HashSet.empty[Int]

  def isMandatoryField(tagId: Int): Boolean = MandatoryFields.contains(tagId)

  def isOptionalField(tagId: Int): Boolean = OptionalFields.contains(tagId)

  def isFieldOf(tagId: Int): Boolean =
    isMandatoryField(tagId) || isOptionalField(tagId)

  override def isFirstField(tagId: Int): Boolean = tagId == SignatureLengthField.TagId

  def decode(flds: Seq[(Int, Any)], startPos: Int = 0): Option[SfMessageTrailer] = {
    val (_, myFields, nextTagPosLookup) = extractMyFieldsAndPopulatePositions(checkFirstField = false, flds, startPos)
    validateMandatoryFieldsPresent(myFields)

    if (myFields.nonEmpty) Some(SfMessageTrailer(
      SignatureLengthField.decode(myFields.get(SignatureLengthField.TagId)),
      SignatureField.decode(myFields.get(SignatureField.TagId)),
      CheckSumField.decode(myFields.get(CheckSumField.TagId))))
    else None
  }

  def checkSumFixStr(checkSum: Int): String = {
    s"${CheckSumField.TagId}=${padCheckSum(checkSum)}${SfFixField.SOH_STR}"
  }

  def createCheckSumField(checkSum: Int): CheckSumField = {
    CheckSumField(padCheckSum(checkSum))
  }

  private[message] def padCheckSum(c: Int): String = {
    f"$c%03d"
  }

  /**
    * Add up all of the decimal values of the ascii characters in the message and then take mod 256
    *
    * @return The checksum
    */
  def calcCheckSum(msgPart: StringBuilder *): Int = {
    val totValue =  msgPart.foldLeft(0)((partValue:Int, part:StringBuilder)=> partValue + part.chars().sum() )
    totValue % 256
  }
}