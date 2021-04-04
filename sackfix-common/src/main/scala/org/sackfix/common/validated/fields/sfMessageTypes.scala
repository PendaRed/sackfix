package org.sackfix.common.validated.fields

import org.sackfix.common.message.{SfDuplicateTagIdException, SfMissingFieldsException}
import org.sackfix.field.SfFieldFactory
//import org.sackfix.field.SfFieldFactory

import scala.annotation.tailrec
import scala.collection.immutable.HashSet

/**
  * Created by Jonathan during 2016.
  */
trait SfFixFieldsToAscii {
  def formatForFix(b:StringBuilder,f: SfFixRenderable) : Unit = {
    f.appendFixStr(b)
  }
  def formatForToString(b:StringBuilder,f: SfFixRenderable) : Unit = {
    f.appendStringBuilder(b)
    if (b.last!=',') b.append(",")
  }
}


abstract class SfFixMessageBody(val msgType:String) {
  lazy val fixStr: String = ""
}

abstract class SfFixGroup {
  lazy val fixStr: String = ""
}

abstract class SfFixComponent {
  lazy val fixStr: String = ""
}

abstract class SfFixDecoder {
  val MandatoryFields: HashSet[Int]
  val OptionalFields: HashSet[Int]
  val RepeatingGroupsTags: HashSet[Int]

  def isMandatoryField(tagId: Int): Boolean

  def isOptionalField(tagId: Int): Boolean

  def isRepeatingGroupField(tagId: Int): Boolean = {
    RepeatingGroupsTags.contains(tagId)
  }

  def isFieldOf(tagId: Int): Boolean

  /**
    * Checks if the field is directly part of me, ignoring any children that I may have
    *
    * @param tagId The tag ot check
    */
  def isFieldOfMine(tagId: Int): Boolean = MandatoryFields.contains(tagId) || OptionalFields.contains(tagId)

  /**
    * Messages and components are not terminated by a 'first field' delimeter, but groups are
    */
  def isFirstField(tagId: Int) = false


  /**
    * Group parsing needs to handle the first field to detect the end of the group, so that explains
    * the API for this function - see SfGroupDecoder.
    */
  def extractMyFieldsAndPopulatePositions(checkFirstField: Boolean, flds: Seq[Tuple2[Int, Any]], startPos: Int):
  Tuple3[Int, scala.collection.mutable.ListMap[Int, Any], scala.collection.mutable.Map[Int, Int]] = {
    val myFields = scala.collection.mutable.ListMap.empty[Int, Any]
    val nextTagPosLookup = scala.collection.mutable.Map.empty[Int, Int]

    @tailrec
    def stepThruFields(pos:Int): Unit = {
      if (pos>=flds.size) ()
      else {
        if (isFieldOfMine(flds(pos)._1)) {
          val tagId = flds(pos)._1
          if (myFields.contains(tagId)) throw SfDuplicateTagIdException(tagId)
          myFields(tagId) = flds(pos)._2
          // Record the start pos of the repeating groups
          if (isRepeatingGroupField(flds(pos)._1)) nextTagPosLookup(flds(pos)._1) = pos + 1
        }
        stepThruFields(pos + 1)
      }
    }

    stepThruFields(startPos)
    (flds.size, myFields, nextTagPosLookup)
  }


  def validateMandatoryFieldsPresent(myFields: scala.collection.mutable.ListMap[Int, Any]) = {
    val missingFields = MandatoryFields.filter(myFields.get(_).isEmpty)
    if (missingFields.nonEmpty) {
      val descriptive = missingFields.map((tagId: Int) => SfFieldFactory.NameLookup.getOrElse(tagId, "") + "(" + tagId + ")")
      throw new SfMissingFieldsException(s"Mandatory fields missing",
        descriptive.toList)
    }
  }
}

/**
  * Groups must be able to decode fields up to the next 'first field'.
  */
abstract class SfGroupDecoder extends SfFixDecoder {
  /**
    * Prior to calling me ensure that the field at the startPos is the first field of the group....
    * Groups are delimited by either the first field of the next group, or by a field not in the group.
    */
  override def extractMyFieldsAndPopulatePositions(checkFirstField: Boolean, flds: Seq[Tuple2[Int, Any]], startPos: Int):
  Tuple3[Int, scala.collection.mutable.ListMap[Int, Any], scala.collection.mutable.Map[Int, Int]] = {
    var posBeyondMe = startPos
    val myFields = scala.collection.mutable.ListMap.empty[Int, Any]
    val nextTagPosLookup = scala.collection.mutable.Map.empty[Int, Int]

    if (startPos < flds.size) {
      val firstTagId = flds(startPos)._1
      if (isFieldOfMine(firstTagId)) {
        if (myFields.contains(firstTagId)) throw SfDuplicateTagIdException(firstTagId)
        myFields(firstTagId) = flds(startPos)._2
        posBeyondMe = startPos + 1
      }

      var pos = startPos + 1
      // Scan all the fields, because numpties have fields out of order and so on.
      // The only rule is that repeating groups are terminated by the first field of the next group
      while (pos < flds.size && (!checkFirstField || !isFirstField(flds(pos)._1))) {
        if (isFieldOfMine(flds(pos)._1)) {
          val tagId = flds(pos)._1
          if (myFields.contains(tagId)) throw SfDuplicateTagIdException(tagId)
          myFields(tagId) = flds(pos)._2
          posBeyondMe = pos + 1
          // Record the start pos of the repeating groups
          if (isRepeatingGroupField(flds(pos)._1)) nextTagPosLookup(flds(pos)._1) = posBeyondMe
        }
        pos = pos + 1
      }
    }
    (posBeyondMe, myFields, nextTagPosLookup)
  }
}

abstract class SfFixMessageDecoder extends SfFixDecoder {
  def decode(flds: Seq[Tuple2[Int, Any]], startPos: Int = 0): Option[SfFixMessageBody]
}
