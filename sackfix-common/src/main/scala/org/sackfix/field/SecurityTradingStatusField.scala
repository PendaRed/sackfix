package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class SecurityTradingStatusField(override val value: Int) extends SfFieldInt(326, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(326)SecurityTradingStatus=(").append(value).append(")").append(SecurityTradingStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityTradingStatusField {
  val TagId = 326 
  val OpeningDelay=1
  val MarketOnCloseImbalanceSell=10
  val NotAssigned=11
  val NoMarketImbalance=12
  val NoMarketOnCloseImbalance=13
  val ItsPreOpening=14
  val NewPriceIndication=15
  val TradeDisseminationTime=16
  val ReadyToTradeStartOfSession=17
  val NotAvailableForTradingEndOfSession=18
  val NotTradedOnThisMarket=19
  val TradingHalt=2
  val UnknownOrInvalid=20
  val PreOpen=21
  val OpeningRotation=22
  val FastMarket=23
  val Resume=3
  val NoOpenNoResume=4
  val PriceIndication=5
  val TradingRangeIndication=6
  val MarketImbalanceBuy=7
  val MarketImbalanceSell=8
  val MarketOnCloseImbalanceBuy=9
  lazy val fixDescriptionByValue = Map(1->"OPENING_DELAY",10->"MARKET_ON_CLOSE_IMBALANCE_SELL",
    11->"NOT_ASSIGNED",12->"NO_MARKET_IMBALANCE",13->"NO_MARKET_ON_CLOSE_IMBALANCE",
    14->"ITS_PRE_OPENING",15->"NEW_PRICE_INDICATION",16->"TRADE_DISSEMINATION_TIME",
    17->"READY_TO_TRADE_START_OF_SESSION",18->"NOT_AVAILABLE_FOR_TRADING_END_OF_SESSION",19->"NOT_TRADED_ON_THIS_MARKET",
    2->"TRADING_HALT",20->"UNKNOWN_OR_INVALID",21->"PRE_OPEN",
    22->"OPENING_ROTATION",23->"FAST_MARKET",3->"RESUME",
    4->"NO_OPEN_NO_RESUME",5->"PRICE_INDICATION",6->"TRADING_RANGE_INDICATION",
    7->"MARKET_IMBALANCE_BUY",8->"MARKET_IMBALANCE_SELL",9->"MARKET_ON_CLOSE_IMBALANCE_BUY")
 
  def apply(value: String) = try {
    new SecurityTradingStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityTradingStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityTradingStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityTradingStatusField]
  }

  def decode(a: Any) : Option[SecurityTradingStatusField] = a match {
    case v: String => Some(SecurityTradingStatusField(v))
    case v: Int => Some(SecurityTradingStatusField(v))
    case v: SecurityTradingStatusField => Some(v)
    case _ => scala.Option.empty[SecurityTradingStatusField]
  } 
}