package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class PositionCurrencyField(override val value: String) extends SfFieldString(1055, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1055)PositionCurrency=(").append(value).append(")")
}

object PositionCurrencyField {
  val TagId = 1055  
  def decode(a: Option[Any]) : Option[PositionCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PositionCurrencyField]
  }

  def decode(a: Any) : Option[PositionCurrencyField] = a match {
    case v: String => Some(PositionCurrencyField(v))
    case v: PositionCurrencyField => Some(v)
    case _ => scala.Option.empty[PositionCurrencyField]
  } 
}
