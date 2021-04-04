package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class TriggerSecurityIDSourceField(override val value: String) extends SfFieldString(1105, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1105)TriggerSecurityIDSource=(").append(value).append(")")
}

object TriggerSecurityIDSourceField {
  val TagId = 1105  
  def decode(a: Option[Any]) : Option[TriggerSecurityIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerSecurityIDSourceField]
  }

  def decode(a: Any) : Option[TriggerSecurityIDSourceField] = a match {
    case v: String => Some(TriggerSecurityIDSourceField(v))
    case v: TriggerSecurityIDSourceField => Some(v)
    case _ => scala.Option.empty[TriggerSecurityIDSourceField]
  } 
}
