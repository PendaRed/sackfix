package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class EncodedSecurityDescField(override val value: String) extends SfFieldString(351, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(351)EncodedSecurityDesc=(").append(value).append(")")
}

object EncodedSecurityDescField {
  val TagId = 351  
  def decode(a: Option[Any]) : Option[EncodedSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedSecurityDescField]
  }

  def decode(a: Any) : Option[EncodedSecurityDescField] = a match {
    case v: String => Some(EncodedSecurityDescField(v))
    case v: EncodedSecurityDescField => Some(v)
    case _ => scala.Option.empty[EncodedSecurityDescField]
  } 
}
