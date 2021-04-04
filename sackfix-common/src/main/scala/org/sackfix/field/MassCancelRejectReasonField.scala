package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class MassCancelRejectReasonField(override val value: String) extends SfFieldString(532, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(532)MassCancelRejectReason=(").append(value).append(")").append(MassCancelRejectReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object MassCancelRejectReasonField {
  val TagId = 532 
  val MassCancelNotSupported="0"
  val InvalidOrUnknownSecurity="1"
  val InvalidOrUnknownUnderlying="2"
  val InvalidOrUnknownProduct="3"
  val InvalidOrUnknownCficode="4"
  val InvalidOrUnknownSecurityType="5"
  val InvalidOrUnknownTradingSession="6"
  lazy val fixDescriptionByValue = Map("0"->"MASS_CANCEL_NOT_SUPPORTED","1"->"INVALID_OR_UNKNOWN_SECURITY",
    "2"->"INVALID_OR_UNKNOWN_UNDERLYING","3"->"INVALID_OR_UNKNOWN_PRODUCT","4"->"INVALID_OR_UNKNOWN_CFICODE",
    "5"->"INVALID_OR_UNKNOWN_SECURITY_TYPE","6"->"INVALID_OR_UNKNOWN_TRADING_SESSION")
 
  def decode(a: Option[Any]) : Option[MassCancelRejectReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MassCancelRejectReasonField]
  }

  def decode(a: Any) : Option[MassCancelRejectReasonField] = a match {
    case v: String => Some(MassCancelRejectReasonField(v))
    case v: Char => Some(MassCancelRejectReasonField(v.toString))
    case v: MassCancelRejectReasonField => Some(v)
    case _ => scala.Option.empty[MassCancelRejectReasonField]
  } 
}
