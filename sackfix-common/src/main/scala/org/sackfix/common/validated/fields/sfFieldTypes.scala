package org.sackfix.common.validated.fields

import java.time._
import java.time.format.DateTimeFormatter
import java.time.temporal.TemporalAccessor

/**
  * Base classes for all of the field types which the code generator churns out.
  *
  * Java 8 DateTimeFormatter is threadsafe
  * Created by Jonathan during 2016.
  *
  * @see http://fixwiki.org/fixwiki/Category:Type
  */
object SfFixDateFormats {
  val localMktDate: DateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE
  val monthYear: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMM")
  val monthYearWw: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMM'w'W")
  val tzTimeOnly: DateTimeFormatter = DateTimeFormatter.ISO_OFFSET_TIME  //ofPattern("HH:mm:ss X") // HH:MM[:SS][Z[ +- hh[:mm]
  val tzTimeStamp: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyMMdd-HH:mm:ss[.SSS]X")  //YYYYMMDD-HH:MM:SS.sss*[Z[ + - hh[:mm]]]   ISO 8601
  val utcDateOnly: DateTimeFormatter = localMktDate
  val utcTimeOnly: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_TIME
  val utcTimeStamp: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm:ss[.SSS]")
}

object SfFixField {
  val SOH: Char = 1.toChar
  val SOH_STR = s"$SOH"
}

trait SfFixRenderable {
  def appendFixStr(b:StringBuilder) :StringBuilder
  def appendStringBuilder(b:StringBuilder) : StringBuilder
}

abstract class SfFixField[+T](val tagId: Int, val value: T) extends SfFixRenderable {
  lazy val fixStr: String = appendFixStr(new StringBuilder()).toString

  def appendFixStr(b:StringBuilder) :StringBuilder=
    b.append(tagId.toString).append("=")
    .append(value.toString)
    .append(SfFixField.SOH_STR)

  override def toString: String = appendStringBuilder().toString
  def appendStringBuilder(b:StringBuilder = new StringBuilder()): StringBuilder = b.append(s"$tagId=$value")

  def canEqual(other: Any): Boolean = other.isInstanceOf[SfFixField[T]]

  override def equals(other: Any): Boolean = other match {
    case that: SfFixField[T] =>
      (that canEqual this) &&
        tagId == that.tagId &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(tagId, value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}

class SfFieldBoolean(override val tagId: Int, override val value: Boolean) extends SfFixField(tagId, value) {
  override def appendFixStr(b:StringBuilder) : StringBuilder = b.append(tagId.toString).append("=")
      . append({
    if (value) "Y" else "N"
  }).append(SfFixField.SOH_STR)
}

class SfFieldChar(override val tagId: Int, override val value: Char) extends SfFixField(tagId, value)

class SfFieldString(override val tagId: Int, override val value: String) extends SfFixField(tagId, value)

class SfFieldFloat(override val tagId: Int, override val value: Float) extends SfFixField(tagId, value)

class SfFieldInt(override val tagId: Int, override val value: Int) extends SfFixField(tagId, value)

class SfNumInGroup(override val tagId: Int, override val value: Int) extends SfFieldInt(tagId, value)

object SfNumInGroup {
  def unapply(obj: SfNumInGroup): Tuple2[Int, Int] = {
    (obj.tagId, obj.value)
  }
}

case class SfFieldUnknown(override val tagId: Int, override val value: Any) extends SfFixField(tagId, value)

class SfDateField(override val tagId: Int,
                  override val value: TemporalAccessor) extends SfFixField(tagId, value)

class DateFormattedField(override val tagId: Int,
                         override val value: TemporalAccessor,
                         val formatter: DateTimeFormatter) extends SfDateField(tagId, value) {
  override def appendFixStr(b:StringBuilder) : StringBuilder = b.append(tagId.toString)
      .append("=").append(formatter.format(value)).append(SfFixField.SOH_STR)
}

/**
  * @param value YYYMMDD  where YYYY=0000-9999 MM=01-12 DD=01-31
  */
class SfFieldLocalMktDate(override val tagId: Int, override val value: LocalDate)
  extends DateFormattedField(tagId, value, SfFixDateFormats.localMktDate)

/**
  * Note that this implementation does NOT support DD or w1,w2,w3,w4 etc.  Only supports Month and Year
  * with other data being lost.
  *
  * @param value Valid forms are YYYMMM  YYYYMMDD YYYYMMWW where WW can be w1,w2,w3,w4,w5
  */
class SfFieldMonthYear(override val tagId: Int, override val value: LocalDate)
  extends DateFormattedField(tagId, value, SfFixDateFormats.monthYear) {

  //  // @TODO NOT HERE!   move to a factory
  //  def parseString(strVal:String) = strVal length match {
  //    case 4 => SfFixDateFormats.monthYear.parse(strVal)
  //    case 6 => if (strVal.charAt(6)=='w') SfFixDateFormats.localMktDate.parse(strVal)
  //    else SfFixDateFormats.monthYearWw.parse(strVal)
  //    case _ => throw new ParseException(s"Could not parse value [$strVal] to Fix Month Year format - Valid forms are YYYMMM  YYYYMMDD YYYYMMWW where WW can be w1,w2,w3,w4,w5",0)
  //  }
}

/**
  * @param value HH:MM[:SS][Z[ +- hh[:mm] ] ]     ISO 8601
  **/
class SfFieldTzTimeOnly(override val tagId: Int, override val value: OffsetTime)
  extends DateFormattedField(tagId, value, SfFixDateFormats.tzTimeOnly)

/**
  * @param value YYYYMMDD-HH:MMM:SS.sss*[Z[ + - hh[:mm] ] ]   ISO 8601
  **/
class SfFieldTzTimeStamp(override val tagId: Int, override val value: OffsetDateTime)
  extends DateFormattedField(tagId, value, SfFixDateFormats.tzTimeStamp)

/**
  * @param value YYYMMDD  where YYYY=0000-9999 MM=01-12 DD=01-31
  */
class SfFieldUtcDateOnly(override val tagId: Int, override val value: LocalDate)
  extends DateFormattedField(tagId, value, SfFixDateFormats.utcDateOnly)

/**
  * @param value HH:MM:SS or HH:MM:SS.sss    HH=0-24, MM=00-50, SS=00-60,sss
  */
class SfFieldUtcTimeOnly(override val tagId: Int, override val value: LocalTime)
  extends DateFormattedField(tagId, value, SfFixDateFormats.utcTimeOnly)

/**
  * @param value YYYYMMDD-HH:MM:SS or YYYYMMDD-HH:MM:SS.sss
  */
class SfFieldUtcTimeStamp(override val tagId: Int, override val value: LocalDateTime)
  extends DateFormattedField(tagId, value, SfFixDateFormats.utcTimeStamp)
