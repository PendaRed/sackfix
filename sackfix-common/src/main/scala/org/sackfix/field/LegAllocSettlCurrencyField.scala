package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegAllocSettlCurrencyField(override val value: String) extends SfFieldString(1367, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1367)LegAllocSettlCurrency=(").append(value).append(")")
}

object LegAllocSettlCurrencyField {
  val TagId = 1367  
  def decode(a: Option[Any]) : Option[LegAllocSettlCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegAllocSettlCurrencyField]
  }

  def decode(a: Any) : Option[LegAllocSettlCurrencyField] = a match {
    case v: String => Some(LegAllocSettlCurrencyField(v))
    case v: LegAllocSettlCurrencyField => Some(v)
    case _ => scala.Option.empty[LegAllocSettlCurrencyField]
  } 
}
