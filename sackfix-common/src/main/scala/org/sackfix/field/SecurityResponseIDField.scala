package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SecurityResponseIDField(override val value: String) extends SfFieldString(322, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(322)SecurityResponseID=(").append(value).append(")")
}

object SecurityResponseIDField {
  val TagId = 322  
  def decode(a: Option[Any]) : Option[SecurityResponseIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityResponseIDField]
  }

  def decode(a: Any) : Option[SecurityResponseIDField] = a match {
    case v: String => Some(SecurityResponseIDField(v))
    case v: SecurityResponseIDField => Some(v)
    case _ => scala.Option.empty[SecurityResponseIDField]
  } 
}
