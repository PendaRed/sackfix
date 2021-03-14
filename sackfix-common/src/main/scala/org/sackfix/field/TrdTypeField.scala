package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class TrdTypeField(override val value: Int) extends SfFieldInt(828, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(828)TrdType=(").append(value).append(")").append(TrdTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TrdTypeField {
  val TagId = 828 
  val RegularTrade=0
  val BlockTrade=1
  val AfterHoursTrade=10
  val Efp=2
  val Transfer=3
  val LateTrade=4
  val TTrade=5
  val WeightedAveragePriceTrade=6
  val BunchedTrade=7
  val LateBunchedTrade=8
  val PriorReferencePriceTrade=9
  val ExchangeForRisk=11
  val ExchangeForSwap=12
  val ExchangeOfFuturesFor=13
  val ExchangeOfOptionsForOptions=14
  val TradingAtSettlement=15
  val AllOrNone=16
  val FuturesLargeOrderExecution=17
  val ExchangeOfFuturesForFutures=18
  val OptionInterimTrade=19
  val OptionCabinetTrade=20
  val PrivatelyNegotiatedTrades=22
  val SubstitutionOfFuturesForForwards=23
  val ErrorTrade=24
  val SpecialCumDividend=25
  val SpecialExDividend=26
  val SpecialCumCoupon=27
  val SpecialExCoupon=28
  val CashSettlement=29
  val SpecialPrice=30
  val GuaranteedDelivery=31
  val SpecialCumRights=32
  val SpecialExRights=33
  val SpecialCumCapitalRepayments=34
  val SpecialExCapitalRepayments=35
  val SpecialCumBonus=36
  val SpecialExBonus=37
  val BlockTrade2=38
  val WorkedPrincipalTrade=39
  val BlockTrades=40
  val NameChange=41
  val PortfolioTransfer=42
  val ProrogationBuy=43
  val ProrogationSell=44
  val OptionExercise=45
  val DeltaNeutralTransaction=46
  val FinancingTransaction=47
  lazy val fixDescriptionByValue = Map(0->"REGULAR_TRADE",1->"BLOCK_TRADE",
    10->"AFTER_HOURS_TRADE",2->"EFP",3->"TRANSFER",
    4->"LATE_TRADE",5->"T_TRADE",6->"WEIGHTED_AVERAGE_PRICE_TRADE",
    7->"BUNCHED_TRADE",8->"LATE_BUNCHED_TRADE",9->"PRIOR_REFERENCE_PRICE_TRADE",
    11->"EXCHANGE_FOR_RISK",12->"EXCHANGE_FOR_SWAP",13->"EXCHANGE_OF_FUTURES_FOR",
    14->"EXCHANGE_OF_OPTIONS_FOR_OPTIONS",15->"TRADING_AT_SETTLEMENT",16->"ALL_OR_NONE",
    17->"FUTURES_LARGE_ORDER_EXECUTION",18->"EXCHANGE_OF_FUTURES_FOR_FUTURES",19->"OPTION_INTERIM_TRADE",
    20->"OPTION_CABINET_TRADE",22->"PRIVATELY_NEGOTIATED_TRADES",23->"SUBSTITUTION_OF_FUTURES_FOR_FORWARDS",
    24->"ERROR_TRADE",25->"SPECIAL_CUM_DIVIDEND",26->"SPECIAL_EX_DIVIDEND",
    27->"SPECIAL_CUM_COUPON",28->"SPECIAL_EX_COUPON",29->"CASH_SETTLEMENT",
    30->"SPECIAL_PRICE",31->"GUARANTEED_DELIVERY",32->"SPECIAL_CUM_RIGHTS",
    33->"SPECIAL_EX_RIGHTS",34->"SPECIAL_CUM_CAPITAL_REPAYMENTS",35->"SPECIAL_EX_CAPITAL_REPAYMENTS",
    36->"SPECIAL_CUM_BONUS",37->"SPECIAL_EX_BONUS",38->"BLOCK_TRADE2",
    39->"WORKED_PRINCIPAL_TRADE",40->"BLOCK_TRADES",41->"NAME_CHANGE",
    42->"PORTFOLIO_TRANSFER",43->"PROROGATION_BUY",44->"PROROGATION_SELL",
    45->"OPTION_EXERCISE",46->"DELTA_NEUTRAL_TRANSACTION",47->"FINANCING_TRANSACTION")
 
  def apply(value: String) = try {
    new TrdTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TrdType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TrdTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TrdTypeField]
  }

  def decode(a: Any) : Option[TrdTypeField] = a match {
    case v: String => Some(TrdTypeField(v))
    case v: Int => Some(TrdTypeField(v))
    case v: TrdTypeField => Some(v)
    case _ => scala.Option.empty[TrdTypeField]
  } 
}
