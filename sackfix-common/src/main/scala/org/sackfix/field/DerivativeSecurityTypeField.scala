package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class DerivativeSecurityTypeField(override val value: String) extends SfFieldString(1249, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1249)DerivativeSecurityType=(").append(value).append(")")
}

object DerivativeSecurityTypeField {
  val TagId = 1249  
  def decode(a: Option[Any]) : Option[DerivativeSecurityTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityTypeField]
  }

  def decode(a: Any) : Option[DerivativeSecurityTypeField] = a match {
    case v: String => Some(DerivativeSecurityTypeField(v))
    case v: DerivativeSecurityTypeField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityTypeField]
  } 
}
