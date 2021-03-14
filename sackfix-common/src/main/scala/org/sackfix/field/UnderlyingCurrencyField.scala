package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingCurrencyField(override val value: String) extends SfFieldString(318, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(318)UnderlyingCurrency=(").append(value).append(")")
}

object UnderlyingCurrencyField {
  val TagId = 318  
  def decode(a: Option[Any]) : Option[UnderlyingCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingCurrencyField]
  }

  def decode(a: Any) : Option[UnderlyingCurrencyField] = a match {
    case v: String => Some(UnderlyingCurrencyField(v))
    case v: UnderlyingCurrencyField => Some(v)
    case _ => scala.Option.empty[UnderlyingCurrencyField]
  } 
}
