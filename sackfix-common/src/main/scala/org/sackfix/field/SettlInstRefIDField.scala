package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlInstRefIDField(override val value: String) extends SfFieldString(214, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(214)SettlInstRefID=(").append(value).append(")")
}

object SettlInstRefIDField {
  val TagId = 214  
  def decode(a: Option[Any]) : Option[SettlInstRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlInstRefIDField]
  }

  def decode(a: Any) : Option[SettlInstRefIDField] = a match {
    case v: String => Some(SettlInstRefIDField(v))
    case v: SettlInstRefIDField => Some(v)
    case _ => scala.Option.empty[SettlInstRefIDField]
  } 
}
