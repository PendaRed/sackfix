package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ContraTraderField(override val value: String) extends SfFieldString(337, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(337)ContraTrader=(").append(value).append(")")
}

object ContraTraderField {
  val TagId = 337  
  def decode(a: Option[Any]) : Option[ContraTraderField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContraTraderField]
  }

  def decode(a: Any) : Option[ContraTraderField] = a match {
    case v: String => Some(ContraTraderField(v))
    case v: ContraTraderField => Some(v)
    case _ => scala.Option.empty[ContraTraderField]
  } 
}
