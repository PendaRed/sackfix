package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegCurrencyField(override val value: String) extends SfFieldString(556, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(556)LegCurrency=(").append(value).append(")")
}

object LegCurrencyField {
  val TagId = 556  
  def decode(a: Option[Any]) : Option[LegCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegCurrencyField]
  }

  def decode(a: Any) : Option[LegCurrencyField] = a match {
    case v: String => Some(LegCurrencyField(v))
    case v: LegCurrencyField => Some(v)
    case _ => scala.Option.empty[LegCurrencyField]
  } 
}
