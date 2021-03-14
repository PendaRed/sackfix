package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class DerivativeSecurityStatusField(override val value: String) extends SfFieldString(1256, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1256)DerivativeSecurityStatus=(").append(value).append(")")
}

object DerivativeSecurityStatusField {
  val TagId = 1256  
  def decode(a: Option[Any]) : Option[DerivativeSecurityStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityStatusField]
  }

  def decode(a: Any) : Option[DerivativeSecurityStatusField] = a match {
    case v: String => Some(DerivativeSecurityStatusField(v))
    case v: DerivativeSecurityStatusField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityStatusField]
  } 
}
