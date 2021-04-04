package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class BookingTypeField(override val value: Int) extends SfFieldInt(775, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(775)BookingType=(").append(value).append(")").append(BookingTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object BookingTypeField {
  val TagId = 775 
  val RegularBooking=0
  val Cfd=1
  val TotalReturnSwap=2
  lazy val fixDescriptionByValue = Map(0->"REGULAR_BOOKING",1->"CFD",
    2->"TOTAL_RETURN_SWAP")
 
  def apply(value: String) = try {
    new BookingTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BookingType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BookingTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BookingTypeField]
  }

  def decode(a: Any) : Option[BookingTypeField] = a match {
    case v: String => Some(BookingTypeField(v))
    case v: Int => Some(BookingTypeField(v))
    case v: BookingTypeField => Some(v)
    case _ => scala.Option.empty[BookingTypeField]
  } 
}
