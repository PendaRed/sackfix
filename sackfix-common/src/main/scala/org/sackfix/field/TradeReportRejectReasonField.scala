package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class TradeReportRejectReasonField(override val value: Int) extends SfFieldInt(751, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(751)TradeReportRejectReason=(").append(value).append(")").append(TradeReportRejectReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object TradeReportRejectReasonField {
  val TagId = 751 
  val Successful=0
  val InvalidPartyInformation=1
  val UnknownInstrument=2
  val UnauthorizedToReportTrades=3
  val InvalidTradeType=4
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"SUCCESSFUL",1->"INVALID_PARTY_INFORMATION",
    2->"UNKNOWN_INSTRUMENT",3->"UNAUTHORIZED_TO_REPORT_TRADES",4->"INVALID_TRADE_TYPE",
    99->"OTHER")
 
  def apply(value: String) = try {
    new TradeReportRejectReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradeReportRejectReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradeReportRejectReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeReportRejectReasonField]
  }

  def decode(a: Any) : Option[TradeReportRejectReasonField] = a match {
    case v: String => Some(TradeReportRejectReasonField(v))
    case v: Int => Some(TradeReportRejectReasonField(v))
    case v: TradeReportRejectReasonField => Some(v)
    case _ => scala.Option.empty[TradeReportRejectReasonField]
  } 
}
