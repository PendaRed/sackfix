package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlInstReqIDField(override val value: String) extends SfFieldString(791, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(791)SettlInstReqID=(").append(value).append(")")
}

object SettlInstReqIDField {
  val TagId = 791  
  def decode(a: Option[Any]) : Option[SettlInstReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlInstReqIDField]
  }

  def decode(a: Any) : Option[SettlInstReqIDField] = a match {
    case v: String => Some(SettlInstReqIDField(v))
    case v: SettlInstReqIDField => Some(v)
    case _ => scala.Option.empty[SettlInstReqIDField]
  } 
}
