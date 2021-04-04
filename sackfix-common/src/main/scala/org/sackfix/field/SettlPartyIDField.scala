package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlPartyIDField(override val value: String) extends SfFieldString(782, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(782)SettlPartyID=(").append(value).append(")")
}

object SettlPartyIDField {
  val TagId = 782  
  def decode(a: Option[Any]) : Option[SettlPartyIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlPartyIDField]
  }

  def decode(a: Any) : Option[SettlPartyIDField] = a match {
    case v: String => Some(SettlPartyIDField(v))
    case v: SettlPartyIDField => Some(v)
    case _ => scala.Option.empty[SettlPartyIDField]
  } 
}
