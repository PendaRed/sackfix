package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeSecurityIDField(override val value: String) extends SfFieldString(1216, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1216)DerivativeSecurityID=(").append(value).append(")")
}

object DerivativeSecurityIDField {
  val TagId = 1216  
  def decode(a: Option[Any]) : Option[DerivativeSecurityIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityIDField]
  }

  def decode(a: Any) : Option[DerivativeSecurityIDField] = a match {
    case v: String => Some(DerivativeSecurityIDField(v))
    case v: DerivativeSecurityIDField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityIDField]
  } 
}
