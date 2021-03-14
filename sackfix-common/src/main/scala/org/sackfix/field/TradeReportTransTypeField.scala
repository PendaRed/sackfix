package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class TradeReportTransTypeField(override val value: Int) extends SfFieldInt(487, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(487)TradeReportTransType=(").append(value).append(")").append(TradeReportTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TradeReportTransTypeField {
  val TagId = 487 
  val New=0
  val Cancel=1
  val Replace=2
  val Release=3
  val Reverse=4
  val CancelDueToBackOutOfTrade=5
  lazy val fixDescriptionByValue = Map(0->"NEW",1->"CANCEL",
    2->"REPLACE",3->"RELEASE",4->"REVERSE",
    5->"CANCEL_DUE_TO_BACK_OUT_OF_TRADE")
 
  def apply(value: String) = try {
    new TradeReportTransTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradeReportTransType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradeReportTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeReportTransTypeField]
  }

  def decode(a: Any) : Option[TradeReportTransTypeField] = a match {
    case v: String => Some(TradeReportTransTypeField(v))
    case v: Int => Some(TradeReportTransTypeField(v))
    case v: TradeReportTransTypeField => Some(v)
    case _ => scala.Option.empty[TradeReportTransTypeField]
  } 
}
