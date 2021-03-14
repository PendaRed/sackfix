package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class TriggerSecurityDescField(override val value: String) extends SfFieldString(1106, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1106)TriggerSecurityDesc=(").append(value).append(")")
}

object TriggerSecurityDescField {
  val TagId = 1106  
  def decode(a: Option[Any]) : Option[TriggerSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerSecurityDescField]
  }

  def decode(a: Any) : Option[TriggerSecurityDescField] = a match {
    case v: String => Some(TriggerSecurityDescField(v))
    case v: TriggerSecurityDescField => Some(v)
    case _ => scala.Option.empty[TriggerSecurityDescField]
  } 
}
