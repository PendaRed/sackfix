package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SecurityExchangeField(override val value: String) extends SfFieldString(207, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(207)SecurityExchange=(").append(value).append(")")
}

object SecurityExchangeField {
  val TagId = 207  
  def decode(a: Option[Any]) : Option[SecurityExchangeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityExchangeField]
  }

  def decode(a: Any) : Option[SecurityExchangeField] = a match {
    case v: String => Some(SecurityExchangeField(v))
    case v: SecurityExchangeField => Some(v)
    case _ => scala.Option.empty[SecurityExchangeField]
  } 
}
