package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class DerivativeTimeUnitField(override val value: String) extends SfFieldString(1271, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1271)DerivativeTimeUnit=(").append(value).append(")")
}

object DerivativeTimeUnitField {
  val TagId = 1271  
  def decode(a: Option[Any]) : Option[DerivativeTimeUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeTimeUnitField]
  }

  def decode(a: Any) : Option[DerivativeTimeUnitField] = a match {
    case v: String => Some(DerivativeTimeUnitField(v))
    case v: DerivativeTimeUnitField => Some(v)
    case _ => scala.Option.empty[DerivativeTimeUnitField]
  } 
}
