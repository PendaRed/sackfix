package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SecurityGroupField(override val value: String) extends SfFieldString(1151, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1151)SecurityGroup=(").append(value).append(")")
}

object SecurityGroupField {
  val TagId = 1151  
  def decode(a: Option[Any]) : Option[SecurityGroupField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityGroupField]
  }

  def decode(a: Any) : Option[SecurityGroupField] = a match {
    case v: String => Some(SecurityGroupField(v))
    case v: SecurityGroupField => Some(v)
    case _ => scala.Option.empty[SecurityGroupField]
  } 
}
