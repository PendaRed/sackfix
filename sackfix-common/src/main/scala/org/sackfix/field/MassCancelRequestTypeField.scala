package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class MassCancelRequestTypeField(override val value: String) extends SfFieldString(530, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(530)MassCancelRequestType=(").append(value).append(")").append(MassCancelRequestTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object MassCancelRequestTypeField {
  val TagId = 530 
  val CancelOrdersForASecurity="1"
  val CancelOrdersForAnUnderlyingSecurity="2"
  val CancelOrdersForAProduct="3"
  val CancelOrdersForACficode="4"
  val CancelOrdersForASecuritytype="5"
  val CancelOrdersForATradingSession="6"
  val CancelAllOrders="7"
  lazy val fixDescriptionByValue = Map("1"->"CANCEL_ORDERS_FOR_A_SECURITY","2"->"CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY",
    "3"->"CANCEL_ORDERS_FOR_A_PRODUCT","4"->"CANCEL_ORDERS_FOR_A_CFICODE","5"->"CANCEL_ORDERS_FOR_A_SECURITYTYPE",
    "6"->"CANCEL_ORDERS_FOR_A_TRADING_SESSION","7"->"CANCEL_ALL_ORDERS")
 
  def decode(a: Option[Any]) : Option[MassCancelRequestTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MassCancelRequestTypeField]
  }

  def decode(a: Any) : Option[MassCancelRequestTypeField] = a match {
    case v: String => Some(MassCancelRequestTypeField(v))
    case v: Char => Some(MassCancelRequestTypeField(v.toString))
    case v: MassCancelRequestTypeField => Some(v)
    case _ => scala.Option.empty[MassCancelRequestTypeField]
  } 
}
