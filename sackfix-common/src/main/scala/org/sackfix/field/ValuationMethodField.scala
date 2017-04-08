package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ValuationMethodField(override val value: String) extends SfFieldString(1197, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1197)ValuationMethod=(").append(value).append(")").append(ValuationMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object ValuationMethodField {
  val TagId = 1197 
  val PremiumStyle="EQTY"
  val FuturesStyleMarkToMarket="FUT"
  val FuturesStyleWithAnAttachedCashAdjustment="FUTDA"
  val CdsStyleCollateralizationOfMarketToMarketAndCoupon="CDS"
  val CdsInDeliveryUseRecoveryRateToCalculateObligation="CDSD"
  lazy val fixDescriptionByValue = Map("EQTY"->"PREMIUM_STYLE","FUT"->"FUTURES_STYLE_MARK_TO_MARKET",
    "FUTDA"->"FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT","CDS"->"CDS_STYLE_COLLATERALIZATION_OF_MARKET_TO_MARKET_AND_COUPON","CDSD"->"CDS_IN_DELIVERY_USE_RECOVERY_RATE_TO_CALCULATE_OBLIGATION")
 
  def decode(a: Option[Any]) : Option[ValuationMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ValuationMethodField]
  }

  def decode(a: Any) : Option[ValuationMethodField] = a match {
    case v: String => Some(ValuationMethodField(v))
    case v: ValuationMethodField => Some(v)
    case _ => scala.Option.empty[ValuationMethodField]
  } 
}
