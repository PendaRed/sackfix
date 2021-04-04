package org.sackfix.common.message

import org.sackfix.common.validated.fields.{SfFixDecoder, SfFixFieldsToAscii, SfFixGroup, _}
import org.sackfix.field.{HopCompIDField, HopRefIDField, HopSendingTimeField}

import scala.annotation.tailrec
import scala.collection.immutable.HashSet
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Generated by SackFix code generator on 20160715
  * Source specification was read from:
  *   /quickfixj1.6.0/FIX50SP2.modified.xml
  */
case class HopsGroup(hopCompIDField:Option[HopCompIDField]=None,
                     hopSendingTimeField:Option[HopSendingTimeField]=None,
                     hopRefIDField:Option[HopRefIDField]=None) extends SfFixGroup with SfFixRenderable with SfFixFieldsToAscii {
  override lazy val fixStr : String = appendFixStr().toString

  override def appendFixStr(b:mutable.StringBuilder = new mutable.StringBuilder): mutable.StringBuilder = {
    format(formatForFix, b)
  }

  override def toString:String = appendStringBuilder().toString()

  def appendStringBuilder(b:mutable.StringBuilder = new mutable.StringBuilder) : mutable.StringBuilder = {
    format(formatForToString, b)
  }
  private def format( fmt: (mutable.StringBuilder,SfFixRenderable)=>Unit, b:mutable.StringBuilder = new mutable.StringBuilder()): mutable.StringBuilder = {
    hopCompIDField.foreach(fmt(b,_))
    hopSendingTimeField.foreach(fmt(b,_))
    hopRefIDField.foreach(fmt(b,_))
    b
  }
}

object HopsGroup extends SfFixDecoder {
  override lazy val MandatoryFields: HashSet[Int] = HashSet[Int]()

  override def isMandatoryField(tagId:Int): Boolean = {
    MandatoryFields.contains(tagId)
  }

  override lazy val OptionalFields: HashSet[Int] = HashSet[Int](
    HopCompIDField.TagId, HopSendingTimeField.TagId, HopRefIDField.TagId)

  override def isOptionalField(tagId:Int): Boolean = {
    OptionalFields.contains(tagId)
  }

  override def isFieldOf(tagId:Int) : Boolean = isMandatoryField(tagId) || isOptionalField(tagId)

  override lazy val RepeatingGroupsTags: HashSet[Int] = HashSet[Int]()


  override def isFirstField(tagId:Int): Boolean = tagId==HopCompIDField.TagId

  // Group version, startPos is the index to the first element of the first repeating group
  @tailrec
  def decode(flds: Seq[Tuple2[Int, Any]], startPos:Int = 0, groups:ArrayBuffer[HopsGroup]=ArrayBuffer.empty[HopsGroup]):Option[List[HopsGroup]] = {
    decodeSingle(flds, startPos) match {
      case (pos: Int, None) => if (groups.nonEmpty) Some(groups.toList) else None
      case (pos: Int, grp: Some[HopsGroup]) => decode(flds, pos, groups += grp.get)
    }
  }

  /**
    * @param flds For groups in Fix ordering is VITAL.
    * @param startPos This index into the ordered fields. It HAS to contain the first field of the group
    * @return A Tuple2 holding the next position to read from the fields, and the newly created group
    */
  def decodeSingle(flds: Seq[Tuple2[Int, Any]], startPos:Int):Tuple2[Int,Option[HopsGroup]] = {
    if (!isFirstField(flds(startPos)._1)) (startPos, None)
    else {
      val (pos, myFields, nextTagPosLookup) = extractMyFieldsAndPopulatePositions(checkFirstField = true, flds, startPos)
      validateMandatoryFieldsPresent(myFields)

      if (myFields.nonEmpty) {
        (pos,Some(HopsGroup(HopCompIDField.decode(myFields.get(HopCompIDField.TagId)),
          HopSendingTimeField.decode(myFields.get(HopSendingTimeField.TagId)),
          HopRefIDField.decode(myFields.get(HopRefIDField.TagId)))))
      } else (startPos, None)
    }
  }

}
