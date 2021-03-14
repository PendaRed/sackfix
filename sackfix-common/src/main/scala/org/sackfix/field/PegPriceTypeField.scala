package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class PegPriceTypeField(override val value: Int) extends SfFieldInt(1094, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1094)PegPriceType=(").append(value).append(")").append(PegPriceTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PegPriceTypeField {
  val TagId = 1094 
  val LastPeg=1
  val MidPricePeg=2
  val OpeningPeg=3
  val MarketPeg=4
  val PrimaryPeg=5
  val FixedPegToLocalBestBidOrOfferAtTimeOfOrder=6
  val PegToVwap=7
  val TrailingStopPeg=8
  val PegToLimitPrice=9
  lazy val fixDescriptionByValue = Map(1->"LAST_PEG",2->"MID_PRICE_PEG",
    3->"OPENING_PEG",4->"MARKET_PEG",5->"PRIMARY_PEG",
    6->"FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER",7->"PEG_TO_VWAP",8->"TRAILING_STOP_PEG",
    9->"PEG_TO_LIMIT_PRICE")
 
  def apply(value: String) = try {
    new PegPriceTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PegPriceType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PegPriceTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PegPriceTypeField]
  }

  def decode(a: Any) : Option[PegPriceTypeField] = a match {
    case v: String => Some(PegPriceTypeField(v))
    case v: Int => Some(PegPriceTypeField(v))
    case v: PegPriceTypeField => Some(v)
    case _ => scala.Option.empty[PegPriceTypeField]
  } 
}
