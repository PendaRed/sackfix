package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedLegSecurityDescField(override val value: String) extends SfFieldString(622, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(622)EncodedLegSecurityDesc=(").append(value).append(")")
}

object EncodedLegSecurityDescField {
  val TagId = 622  
  def decode(a: Option[Any]) : Option[EncodedLegSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedLegSecurityDescField]
  }

  def decode(a: Any) : Option[EncodedLegSecurityDescField] = a match {
    case v: String => Some(EncodedLegSecurityDescField(v))
    case v: EncodedLegSecurityDescField => Some(v)
    case _ => scala.Option.empty[EncodedLegSecurityDescField]
  } 
}
