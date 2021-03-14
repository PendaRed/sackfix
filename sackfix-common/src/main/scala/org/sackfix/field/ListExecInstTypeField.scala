package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ListExecInstTypeField(override val value: String) extends SfFieldString(433, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(433)ListExecInstType=(").append(value).append(")").append(ListExecInstTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ListExecInstTypeField {
  val TagId = 433 
  val Immediate="1"
  val WaitForExecuteInstruction="2"
  val ExchangeSwitchCivOrderSellDriven="3"
  val ExchangeSwitchCivOrderBuyDrivenCashTopUp="4"
  val ExchangeSwitchCivOrderBuyDrivenCashWithdraw="5"
  lazy val fixDescriptionByValue = Map("1"->"IMMEDIATE","2"->"WAIT_FOR_EXECUTE_INSTRUCTION",
    "3"->"EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN","4"->"EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP","5"->"EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW")
 
  def decode(a: Option[Any]) : Option[ListExecInstTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ListExecInstTypeField]
  }

  def decode(a: Any) : Option[ListExecInstTypeField] = a match {
    case v: String => Some(ListExecInstTypeField(v))
    case v: Char => Some(ListExecInstTypeField(v.toString))
    case v: ListExecInstTypeField => Some(v)
    case _ => scala.Option.empty[ListExecInstTypeField]
  } 
}
