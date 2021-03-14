package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class FuturesValuationMethodField(override val value: String) extends SfFieldString(1197, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1197)FuturesValuationMethod=(").append(value).append(")").append(FuturesValuationMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object FuturesValuationMethodField {
  val TagId = 1197 
  val PremiumStyle="EQTY"
  val FuturesStyleMarkToMarket="FUT"
  val FuturesStyleWithAnAttachedCashAdjustment="FUTDA"
  lazy val fixDescriptionByValue = Map("EQTY"->"PREMIUM_STYLE","FUT"->"FUTURES_STYLE_MARK_TO_MARKET",
    "FUTDA"->"FUTURES_STYLE_WITH_AN_ATTACHED_CASH_ADJUSTMENT")
 
  def decode(a: Option[Any]) : Option[FuturesValuationMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FuturesValuationMethodField]
  }

  def decode(a: Any) : Option[FuturesValuationMethodField] = a match {
    case v: String => Some(FuturesValuationMethodField(v))
    case v: FuturesValuationMethodField => Some(v)
    case _ => scala.Option.empty[FuturesValuationMethodField]
  } 
}
