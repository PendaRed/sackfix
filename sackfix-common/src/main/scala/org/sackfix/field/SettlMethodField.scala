package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SettlMethodField(override val value: String) extends SfFieldString(1193, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1193)SettlMethod=(").append(value).append(")").append(SettlMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlMethodField {
  val TagId = 1193 
  val CashSettlementRequired="C"
  val PhysicalSettlementRequired="P"
  lazy val fixDescriptionByValue = Map("C"->"CASH_SETTLEMENT_REQUIRED","P"->"PHYSICAL_SETTLEMENT_REQUIRED")
 
  def decode(a: Option[Any]) : Option[SettlMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlMethodField]
  }

  def decode(a: Any) : Option[SettlMethodField] = a match {
    case v: String => Some(SettlMethodField(v))
    case v: Char => Some(SettlMethodField(v.toString))
    case v: SettlMethodField => Some(v)
    case _ => scala.Option.empty[SettlMethodField]
  } 
}
