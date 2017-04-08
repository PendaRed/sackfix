package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeCFICodeField(override val value: String) extends SfFieldString(1248, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1248)DerivativeCFICode=(").append(value).append(")")
}

object DerivativeCFICodeField {
  val TagId = 1248  
  def decode(a: Option[Any]) : Option[DerivativeCFICodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeCFICodeField]
  }

  def decode(a: Any) : Option[DerivativeCFICodeField] = a match {
    case v: String => Some(DerivativeCFICodeField(v))
    case v: DerivativeCFICodeField => Some(v)
    case _ => scala.Option.empty[DerivativeCFICodeField]
  } 
}