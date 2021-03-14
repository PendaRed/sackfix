package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class AgreementCurrencyField(override val value: String) extends SfFieldString(918, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(918)AgreementCurrency=(").append(value).append(")")
}

object AgreementCurrencyField {
  val TagId = 918  
  def decode(a: Option[Any]) : Option[AgreementCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AgreementCurrencyField]
  }

  def decode(a: Any) : Option[AgreementCurrencyField] = a match {
    case v: String => Some(AgreementCurrencyField(v))
    case v: AgreementCurrencyField => Some(v)
    case _ => scala.Option.empty[AgreementCurrencyField]
  } 
}
