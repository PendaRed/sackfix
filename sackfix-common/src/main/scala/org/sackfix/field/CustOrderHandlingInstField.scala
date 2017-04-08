package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class CustOrderHandlingInstField(override val value: String) extends SfFieldString(1031, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1031)CustOrderHandlingInst=(").append(value).append(")").append(CustOrderHandlingInstField.fixDescriptionByValue.getOrElse(value,""))
}

object CustOrderHandlingInstField {
  val TagId = 1031 
  val AddOnOrder="ADD"
  val AllOrNone="AON"
  val CashNotHeld="CNH"
  val DirectedOrder="DIR"
  val ExchangeForPhysicalTransaction="E.W"
  val FillOrKill="FOK"
  val ImbalanceOnly="IO"
  val ImmediateOrCancel="IOC"
  val LimitOnOpen="LOO"
  val LimitOnClose="LOC"
  val MarketAtOpen="MAO"
  val MarketAtClose="MAC"
  val MarketOnOpen="MOO"
  val MarketOnClose="MOC"
  val MinimumQuantity="MQT"
  val NotHeld="NH"
  val OverTheDay="OVD"
  val Pegged="PEG"
  val ReserveSizeOrder="RSV"
  val StopStockTransaction="S.W"
  val Scale="SCL"
  val TimeOrder="TMO"
  val TrailingStop="TS"
  val Work="WRK"
  lazy val fixDescriptionByValue = Map("ADD"->"ADD_ON_ORDER","AON"->"ALL_OR_NONE",
    "CNH"->"CASH_NOT_HELD","DIR"->"DIRECTED_ORDER","E.W"->"EXCHANGE_FOR_PHYSICAL_TRANSACTION",
    "FOK"->"FILL_OR_KILL","IO"->"IMBALANCE_ONLY","IOC"->"IMMEDIATE_OR_CANCEL",
    "LOO"->"LIMIT_ON_OPEN","LOC"->"LIMIT_ON_CLOSE","MAO"->"MARKET_AT_OPEN",
    "MAC"->"MARKET_AT_CLOSE","MOO"->"MARKET_ON_OPEN","MOC"->"MARKET_ON_CLOSE",
    "MQT"->"MINIMUM_QUANTITY","NH"->"NOT_HELD","OVD"->"OVER_THE_DAY",
    "PEG"->"PEGGED","RSV"->"RESERVE_SIZE_ORDER","S.W"->"STOP_STOCK_TRANSACTION",
    "SCL"->"SCALE","TMO"->"TIME_ORDER","TS"->"TRAILING_STOP",
    "WRK"->"WORK")
 
  def decode(a: Option[Any]) : Option[CustOrderHandlingInstField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CustOrderHandlingInstField]
  }

  def decode(a: Any) : Option[CustOrderHandlingInstField] = a match {
    case v: String => Some(CustOrderHandlingInstField(v))
    case v: CustOrderHandlingInstField => Some(v)
    case _ => scala.Option.empty[CustOrderHandlingInstField]
  } 
}
