package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlBrkrCodeField(override val value: String) extends SfFieldString(174, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(174)SettlBrkrCode=(").append(value).append(")")
}

object SettlBrkrCodeField {
  val TagId = 174  
  def decode(a: Option[Any]) : Option[SettlBrkrCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlBrkrCodeField]
  }

  def decode(a: Any) : Option[SettlBrkrCodeField] = a match {
    case v: String => Some(SettlBrkrCodeField(v))
    case v: SettlBrkrCodeField => Some(v)
    case _ => scala.Option.empty[SettlBrkrCodeField]
  } 
}
