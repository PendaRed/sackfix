package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class DerivativeSecurityExchangeField(override val value: String) extends SfFieldString(1272, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1272)DerivativeSecurityExchange=(").append(value).append(")")
}

object DerivativeSecurityExchangeField {
  val TagId = 1272  
  def decode(a: Option[Any]) : Option[DerivativeSecurityExchangeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityExchangeField]
  }

  def decode(a: Any) : Option[DerivativeSecurityExchangeField] = a match {
    case v: String => Some(DerivativeSecurityExchangeField(v))
    case v: DerivativeSecurityExchangeField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityExchangeField]
  } 
}
