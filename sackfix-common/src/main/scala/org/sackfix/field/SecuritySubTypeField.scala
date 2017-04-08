package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SecuritySubTypeField(override val value: String) extends SfFieldString(762, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(762)SecuritySubType=(").append(value).append(")")
}

object SecuritySubTypeField {
  val TagId = 762  
  def decode(a: Option[Any]) : Option[SecuritySubTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecuritySubTypeField]
  }

  def decode(a: Any) : Option[SecuritySubTypeField] = a match {
    case v: String => Some(SecuritySubTypeField(v))
    case v: SecuritySubTypeField => Some(v)
    case _ => scala.Option.empty[SecuritySubTypeField]
  } 
}
