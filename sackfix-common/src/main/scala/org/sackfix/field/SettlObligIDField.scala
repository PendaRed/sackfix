package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SettlObligIDField(override val value: String) extends SfFieldString(1161, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1161)SettlObligID=(").append(value).append(")")
}

object SettlObligIDField {
  val TagId = 1161  
  def decode(a: Option[Any]) : Option[SettlObligIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlObligIDField]
  }

  def decode(a: Any) : Option[SettlObligIDField] = a match {
    case v: String => Some(SettlObligIDField(v))
    case v: SettlObligIDField => Some(v)
    case _ => scala.Option.empty[SettlObligIDField]
  } 
}
