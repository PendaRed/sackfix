package org.sackfix.common.message

import org.sackfix.common.validated.fields._
import org.sackfix.field.{BodyLengthField, LastMsgSeqNumProcessedField, NoHopsField, _}
import org.sackfix.common.validated.fields.{SfFixDecoder, SfFixFieldsToAscii}
import org.sackfix.field.{LastMsgSeqNumProcessedField, OnBehalfOfLocationIDField, SecureDataField, TargetCompIDField}

import scala.collection.immutable.HashSet

/**
  * Created by Jonathan during 2016.
  * The header is defined in places like this:
  * http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.5.0SP2/body_49485052.html
  *
  * Note that the body length has to be recalculated when you get the fixStr for outgoing messages
  * which is why it is marked as an Optional member, even though it is required.
  *
  * ie two use cases, for incoming messages it will be populated
  * for outgoing messages you can leave it as a None as it will be recalculated when you call fixStr(Body)
  *
  * For incoming messages you can access the original body length as
  * msg.bodyLengthField
  * and to determine that it is correct you can call
  * msg.calcBodyLength(body : SfFixMessageBody)
  *
  * Take a look at the test case to see it in action.  Look at the sackfixsession project
  * for how to create strongly typed full messages and read them.
  */
case class SfMessageHeader(beginStringField: BeginStringField,
                           bodyLengthField: Option[BodyLengthField] = None,
                           msgTypeField: MsgTypeField,
                           applVerIdField: Option[ApplVerIDField] = None,
                           applExtIDField: Option[ApplExtIDField] = None,
                           cstmApplVerIDField: Option[CstmApplVerIDField] = None,
                           senderCompIDField: SenderCompIDField,
                           targetCompIDField: TargetCompIDField,
                           onBehalfOfCompIDField: Option[OnBehalfOfCompIDField] = None,
                           deliverToCompIDField: Option[DeliverToCompIDField] = None,
                           secureDataLenField: Option[SecureDataLenField] = None,
                           secureDataField: Option[SecureDataField] = None,
                           msgSeqNumField: MsgSeqNumField,
                           senderSubIDField: Option[SenderSubIDField] = None,
                           senderLocationIDField: Option[SenderLocationIDField] = None,
                           targetSubIDField: Option[TargetSubIDField] = None,
                           targetLocationIDField: Option[TargetLocationIDField] = None,
                           onBehalfOfSubIDField: Option[OnBehalfOfSubIDField] = None,
                           onBehalfOfLocationIDField: Option[OnBehalfOfLocationIDField] = None,
                           deliverToSubIDField: Option[DeliverToSubIDField] = None,
                           deliverToLocationIDField: Option[DeliverToLocationIDField] = None,
                           possDupFlagField: Option[PossDupFlagField] = None,
                           possResendField: Option[PossResendField] = None,
                           sendingTimeField: SendingTimeField,
                           origSendingTimeField: Option[OrigSendingTimeField] = None,
                           xmlDataLenField: Option[XmlDataLenField] = None,
                           xmlDataField: Option[XmlDataField] = None,
                           messageEncodingField: Option[MessageEncodingField] = None,
                           lastMsgSeqNumProcessedField: Option[LastMsgSeqNumProcessedField] = None,
                           noHopsField: Option[NoHopsField] = None,
                           sfMessageHeaderHopsGroup: Option[List[HopsGroup]] = None) extends SfFixFieldsToAscii {

  var lastCalculatedBodyLength: BodyLengthField = bodyLengthField.getOrElse(BodyLengthField(0))

  def fixStr: String = new StringBuilder(beginStringField.fixStr).append(lastCalculatedBodyLength.fixStr)
      .append(fixStrOnce).toString()

  /**
    * Generate a fix string for the message boxy that is given, recalculating the body length
    *
    * @param fixBodyStr The body to use when calculating body length
    * @return
    */
  def fixStr(fixBodyStr:StringBuilder): StringBuilder =
    new StringBuilder(beginStringField.fixStr)
      .append(calcBodyLength(fixBodyStr).fixStr).append(fixStrOnce)

  def calcBodyLength(fixBodyStr : StringBuilder) = {
    lastCalculatedBodyLength = BodyLengthField(fixStrOnce.length + fixBodyStr.length)
    lastCalculatedBodyLength
  }

  // This part is immutable.
  private lazy val fixStrOnce: StringBuilder = {
    format(formatForFix)
  }

  /**
    * If this is outgoing message the body length will be missing from the toString until
    * it is rendered to fix(body) - le body len will be 0 as it wont be known.
    */
  override def toString: String = toStringBuilder.toString

  def toStringBuilder : StringBuilder = {
    val b = new StringBuilder(beginStringField.toString).append(",")
    b.append(lastCalculatedBodyLength.toString).append(",")
    b.append(format(formatForToString))
    b
  }

  private def format( fmt: ((StringBuilder,SfFixRenderable)=>Unit)): StringBuilder = {
    val b = new StringBuilder()
    fmt(b,msgTypeField)
    applVerIdField.foreach(fmt(b,_))
    applExtIDField.foreach(fmt(b,_))
    cstmApplVerIDField.foreach(fmt(b,_))
    fmt(b,senderCompIDField)
    fmt(b,targetCompIDField)
    onBehalfOfCompIDField.foreach(fmt(b,_))
    deliverToCompIDField.foreach(fmt(b,_))
    secureDataLenField.foreach(fmt(b,_))
    secureDataField.foreach(fmt(b,_))
    fmt(b,msgSeqNumField)
    senderSubIDField.foreach(fmt(b,_))
    senderLocationIDField.foreach(fmt(b,_))
    targetSubIDField.foreach(fmt(b,_))
    targetLocationIDField.foreach(fmt(b,_))
    onBehalfOfSubIDField.foreach(fmt(b,_))
    onBehalfOfLocationIDField.foreach(fmt(b,_))
    deliverToSubIDField.foreach(fmt(b,_))
    deliverToLocationIDField.foreach(fmt(b,_))
    possDupFlagField.foreach(fmt(b,_))
    possResendField.foreach(fmt(b,_))
    fmt(b,sendingTimeField)
    origSendingTimeField.foreach(fmt(b,_))
    xmlDataLenField.foreach(fmt(b,_))
    xmlDataField.foreach(fmt(b,_))
    messageEncodingField.foreach(fmt(b,_))
    lastMsgSeqNumProcessedField.foreach(fmt(b,_))
    noHopsField.foreach(fmt(b,_))
    sfMessageHeaderHopsGroup.getOrElse(List.empty).foreach(fmt(b,_))
    b
  }
}

object SfMessageHeader extends SfFixDecoder {
  override val MandatoryFields = HashSet[Int](BeginStringField.TagId,
    BodyLengthField.TagId, MsgTypeField.TagId,
    SenderCompIDField.TagId, TargetCompIDField.TagId,
    MsgSeqNumField.TagId, SendingTimeField.TagId
  )

  override val OptionalFields = HashSet[Int](ApplVerIDField.TagId,
    ApplExtIDField.TagId, CstmApplVerIDField.TagId, OnBehalfOfCompIDField.TagId,
    DeliverToCompIDField.TagId, SecureDataLenField.TagId, SecureDataField.TagId,
    SenderSubIDField.TagId, SenderLocationIDField.TagId, TargetSubIDField.TagId,
    TargetLocationIDField.TagId, OnBehalfOfSubIDField.TagId, OnBehalfOfLocationIDField.TagId,
    DeliverToSubIDField.TagId, DeliverToLocationIDField.TagId, PossDupFlagField.TagId,
    PossResendField.TagId, OrigSendingTimeField.TagId, XmlDataLenField.TagId,
    XmlDataField.TagId, MessageEncodingField.TagId, LastMsgSeqNumProcessedField.TagId,
    NoHopsField.TagId
  )

  override lazy val RepeatingGroupsTags = HashSet[Int](NoHopsField.TagId)

  def isMandatoryField(tagId: Int) = MandatoryFields.contains(tagId) || HopsGroup.isMandatoryField(tagId)

  def isOptionalField(tagId: Int) = OptionalFields.contains(tagId) || HopsGroup.isOptionalField(tagId)

  def isFieldOf(tagId: Int): Boolean =
    isMandatoryField(tagId) || isOptionalField(tagId) ||
      HopsGroup.isFieldOf(tagId)

  override def isFirstField(tagId: Int) = tagId == BeginStringField.TagId

  def decode(flds: Seq[(Int, Any)], startPos: Int = 0): Option[SfMessageHeader] = {
    val (_, myFields, nextTagPosLookup) = extractMyFieldsAndPopulatePositions(checkFirstField = false, flds, startPos)
    validateMandatoryFieldsPresent(myFields)

    if (myFields.nonEmpty) {
      Some(SfMessageHeader(
        BeginStringField.decode(myFields.get(BeginStringField.TagId)).get,
        BodyLengthField.decode(myFields.get(BodyLengthField.TagId)),
        MsgTypeField.decode(myFields.get(MsgTypeField.TagId)).get,
        ApplVerIDField.decode(myFields.get(ApplVerIDField.TagId)),
        ApplExtIDField.decode(myFields.get(ApplExtIDField.TagId)),
        CstmApplVerIDField.decode(myFields.get(CstmApplVerIDField.TagId)),
        SenderCompIDField.decode(myFields.get(SenderCompIDField.TagId)).get,
        TargetCompIDField.decode(myFields.get(TargetCompIDField.TagId)).get,
        OnBehalfOfCompIDField.decode(myFields.get(OnBehalfOfCompIDField.TagId)),
        DeliverToCompIDField.decode(myFields.get(DeliverToCompIDField.TagId)),
        SecureDataLenField.decode(myFields.get(SecureDataLenField.TagId)),
        SecureDataField.decode(myFields.get(SecureDataField.TagId)),
        MsgSeqNumField.decode(myFields.get(MsgSeqNumField.TagId)).get,
        SenderSubIDField.decode(myFields.get(SenderSubIDField.TagId)),
        SenderLocationIDField.decode(myFields.get(SenderLocationIDField.TagId)),
        TargetSubIDField.decode(myFields.get(TargetSubIDField.TagId)),
        TargetLocationIDField.decode(myFields.get(TargetLocationIDField.TagId)),
        OnBehalfOfSubIDField.decode(myFields.get(OnBehalfOfSubIDField.TagId)),
        OnBehalfOfLocationIDField.decode(myFields.get(OnBehalfOfLocationIDField.TagId)),
        DeliverToSubIDField.decode(myFields.get(DeliverToSubIDField.TagId)),
        DeliverToLocationIDField.decode(myFields.get(DeliverToLocationIDField.TagId)),
        PossDupFlagField.decode(myFields.get(PossDupFlagField.TagId)),
        PossResendField.decode(myFields.get(PossResendField.TagId)),
        SendingTimeField.decode(myFields.get(SendingTimeField.TagId)).get,
        OrigSendingTimeField.decode(myFields.get(OrigSendingTimeField.TagId)),
        XmlDataLenField.decode(myFields.get(XmlDataLenField.TagId)),
        XmlDataField.decode(myFields.get(XmlDataField.TagId)),
        MessageEncodingField.decode(myFields.get(MessageEncodingField.TagId)),
        LastMsgSeqNumProcessedField.decode(myFields.get(LastMsgSeqNumProcessedField.TagId)),
        NoHopsField.decode(myFields.get(NoHopsField.TagId)),
        if (nextTagPosLookup.contains(NoHopsField.TagId)) HopsGroup.decode(flds, nextTagPosLookup(NoHopsField.TagId)) else None))
    } else None
  }
}
