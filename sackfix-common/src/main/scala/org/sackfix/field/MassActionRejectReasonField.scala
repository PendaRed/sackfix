package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class MassActionRejectReasonField(override val value: Int) extends SfFieldInt(1376, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1376)MassActionRejectReason=(").append(value).append(")").append(MassActionRejectReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object MassActionRejectReasonField {
  val TagId = 1376 
  val MassActionNotSupported=0
  val InvalidOrUnknownSecurity=1
  val InvalidOrUnknownUnderlyingSecurity=2
  val InvalidOrUnknownProduct=3
  val InvalidOrUnknownCficode=4
  val InvalidOrUnknownSecuritytype=5
  val InvalidOrUnknownTradingSession=6
  val InvalidOrUnknownMarket=7
  val InvalidOrUnknownMarketSegment=8
  val InvalidOrUnknownSecurityGroup=9
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"MASS_ACTION_NOT_SUPPORTED",1->"INVALID_OR_UNKNOWN_SECURITY",
    2->"INVALID_OR_UNKNOWN_UNDERLYING_SECURITY",3->"INVALID_OR_UNKNOWN_PRODUCT",4->"INVALID_OR_UNKNOWN_CFICODE",
    5->"INVALID_OR_UNKNOWN_SECURITYTYPE",6->"INVALID_OR_UNKNOWN_TRADING_SESSION",7->"INVALID_OR_UNKNOWN_MARKET",
    8->"INVALID_OR_UNKNOWN_MARKET_SEGMENT",9->"INVALID_OR_UNKNOWN_SECURITY_GROUP",99->"OTHER")
 
  def apply(value: String) = try {
    new MassActionRejectReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MassActionRejectReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MassActionRejectReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MassActionRejectReasonField]
  }

  def decode(a: Any) : Option[MassActionRejectReasonField] = a match {
    case v: String => Some(MassActionRejectReasonField(v))
    case v: Int => Some(MassActionRejectReasonField(v))
    case v: MassActionRejectReasonField => Some(v)
    case _ => scala.Option.empty[MassActionRejectReasonField]
  } 
}
