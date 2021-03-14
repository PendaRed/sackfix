package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class OrderDelayUnitField(override val value: Int) extends SfFieldInt(1429, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1429)OrderDelayUnit=(").append(value).append(")").append(OrderDelayUnitField.fixDescriptionByValue.getOrElse(value,""))
}

object OrderDelayUnitField {
  val TagId = 1429 
  val Seconds=0
  val TenthsOfASecond=1
  val HundredthsOfASecond=2
  val Milliseconds=3
  val Microseconds=4
  val Nanoseconds=5
  val Minutes=10
  val Hours=11
  val Days=12
  val Weeks=13
  val Months=14
  val Years=15
  lazy val fixDescriptionByValue = Map(0->"SECONDS",1->"TENTHS_OF_A_SECOND",
    2->"HUNDREDTHS_OF_A_SECOND",3->"MILLISECONDS",4->"MICROSECONDS",
    5->"NANOSECONDS",10->"MINUTES",11->"HOURS",
    12->"DAYS",13->"WEEKS",14->"MONTHS",
    15->"YEARS")
 
  def apply(value: String) = try {
    new OrderDelayUnitField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OrderDelayUnit("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OrderDelayUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrderDelayUnitField]
  }

  def decode(a: Any) : Option[OrderDelayUnitField] = a match {
    case v: String => Some(OrderDelayUnitField(v))
    case v: Int => Some(OrderDelayUnitField(v))
    case v: OrderDelayUnitField => Some(v)
    case _ => scala.Option.empty[OrderDelayUnitField]
  } 
}
