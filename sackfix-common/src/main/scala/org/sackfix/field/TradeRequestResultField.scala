package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class TradeRequestResultField(override val value: Int) extends SfFieldInt(749, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(749)TradeRequestResult=(").append(value).append(")").append(TradeRequestResultField.fixDescriptionByValue.getOrElse(value,""))
}

object TradeRequestResultField {
  val TagId = 749 
  val Successful=0
  val InvalidOrUnknownInstrument=1
  val InvalidTypeOfTradeRequested=2
  val InvalidParties=3
  val InvalidTransportTypeRequested=4
  val InvalidDestinationRequested=5
  val TraderequesttypeNotSupported=8
  val UnauthorizedForTradeCaptureReportRequest=9
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"SUCCESSFUL",1->"INVALID_OR_UNKNOWN_INSTRUMENT",
    2->"INVALID_TYPE_OF_TRADE_REQUESTED",3->"INVALID_PARTIES",4->"INVALID_TRANSPORT_TYPE_REQUESTED",
    5->"INVALID_DESTINATION_REQUESTED",8->"TRADEREQUESTTYPE_NOT_SUPPORTED",9->"UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST",
    99->"OTHER")
 
  def apply(value: String) = try {
    new TradeRequestResultField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradeRequestResult("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradeRequestResultField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeRequestResultField]
  }

  def decode(a: Any) : Option[TradeRequestResultField] = a match {
    case v: String => Some(TradeRequestResultField(v))
    case v: Int => Some(TradeRequestResultField(v))
    case v: TradeRequestResultField => Some(v)
    case _ => scala.Option.empty[TradeRequestResultField]
  } 
}
