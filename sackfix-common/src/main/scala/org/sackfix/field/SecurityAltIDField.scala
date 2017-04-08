package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SecurityAltIDField(override val value: String) extends SfFieldString(455, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(455)SecurityAltID=(").append(value).append(")")
}

object SecurityAltIDField {
  val TagId = 455  
  def decode(a: Option[Any]) : Option[SecurityAltIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityAltIDField]
  }

  def decode(a: Any) : Option[SecurityAltIDField] = a match {
    case v: String => Some(SecurityAltIDField(v))
    case v: SecurityAltIDField => Some(v)
    case _ => scala.Option.empty[SecurityAltIDField]
  } 
}
