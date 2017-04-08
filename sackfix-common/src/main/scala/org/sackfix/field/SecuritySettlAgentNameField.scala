package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SecuritySettlAgentNameField(override val value: String) extends SfFieldString(176, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(176)SecuritySettlAgentName=(").append(value).append(")")
}

object SecuritySettlAgentNameField {
  val TagId = 176  
  def decode(a: Option[Any]) : Option[SecuritySettlAgentNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecuritySettlAgentNameField]
  }

  def decode(a: Any) : Option[SecuritySettlAgentNameField] = a match {
    case v: String => Some(SecuritySettlAgentNameField(v))
    case v: SecuritySettlAgentNameField => Some(v)
    case _ => scala.Option.empty[SecuritySettlAgentNameField]
  } 
}
