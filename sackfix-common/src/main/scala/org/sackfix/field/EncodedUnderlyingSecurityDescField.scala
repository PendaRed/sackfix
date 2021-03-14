package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class EncodedUnderlyingSecurityDescField(override val value: String) extends SfFieldString(365, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(365)EncodedUnderlyingSecurityDesc=(").append(value).append(")")
}

object EncodedUnderlyingSecurityDescField {
  val TagId = 365  
  def decode(a: Option[Any]) : Option[EncodedUnderlyingSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedUnderlyingSecurityDescField]
  }

  def decode(a: Any) : Option[EncodedUnderlyingSecurityDescField] = a match {
    case v: String => Some(EncodedUnderlyingSecurityDescField(v))
    case v: EncodedUnderlyingSecurityDescField => Some(v)
    case _ => scala.Option.empty[EncodedUnderlyingSecurityDescField]
  } 
}
