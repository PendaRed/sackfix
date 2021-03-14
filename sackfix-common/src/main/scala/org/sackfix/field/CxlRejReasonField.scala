package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class CxlRejReasonField(override val value: Int) extends SfFieldInt(102, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(102)CxlRejReason=(").append(value).append(")").append(CxlRejReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object CxlRejReasonField {
  val TagId = 102 
  val TooLateToCancel=0
  val UnknownOrder=1
  val BrokerExchangeOption=2
  val OrderAlreadyInPendingCancelOrPendingReplaceStatus=3
  val UnableToProcessOrderMassCancelRequest=4
  val OrigordmodtimeDidNotMatchLastTransacttimeOfOrder=5
  val DuplicateClordidReceived=6
  val InvalidPriceIncrement=18
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"TOO_LATE_TO_CANCEL",1->"UNKNOWN_ORDER",
    2->"BROKER_EXCHANGE_OPTION",3->"ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS",4->"UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST",
    5->"ORIGORDMODTIME_DID_NOT_MATCH_LAST_TRANSACTTIME_OF_ORDER",6->"DUPLICATE_CLORDID_RECEIVED",18->"INVALID_PRICE_INCREMENT",
    99->"OTHER")
 
  def apply(value: String) = try {
    new CxlRejReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CxlRejReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CxlRejReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CxlRejReasonField]
  }

  def decode(a: Any) : Option[CxlRejReasonField] = a match {
    case v: String => Some(CxlRejReasonField(v))
    case v: Int => Some(CxlRejReasonField(v))
    case v: CxlRejReasonField => Some(v)
    case _ => scala.Option.empty[CxlRejReasonField]
  } 
}
