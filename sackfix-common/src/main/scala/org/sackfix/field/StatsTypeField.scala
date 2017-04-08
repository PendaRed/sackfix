package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class StatsTypeField(override val value: Int) extends SfFieldInt(1176, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1176)StatsType=(").append(value).append(")").append(StatsTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object StatsTypeField {
  val TagId = 1176 
  val ExchangeLast=1
  val HighLowPrice=2
  val AveragePrice=3
  val Turnover=4
  lazy val fixDescriptionByValue = Map(1->"EXCHANGE_LAST",2->"HIGH_LOW_PRICE",
    3->"AVERAGE_PRICE",4->"TURNOVER")
 
  def apply(value: String) = try {
    new StatsTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StatsType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StatsTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StatsTypeField]
  }

  def decode(a: Any) : Option[StatsTypeField] = a match {
    case v: String => Some(StatsTypeField(v))
    case v: Int => Some(StatsTypeField(v))
    case v: StatsTypeField => Some(v)
    case _ => scala.Option.empty[StatsTypeField]
  } 
}
