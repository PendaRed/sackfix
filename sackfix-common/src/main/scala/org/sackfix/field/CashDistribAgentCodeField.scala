package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class CashDistribAgentCodeField(override val value: String) extends SfFieldString(499, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(499)CashDistribAgentCode=(").append(value).append(")")
}

object CashDistribAgentCodeField {
  val TagId = 499  
  def decode(a: Option[Any]) : Option[CashDistribAgentCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashDistribAgentCodeField]
  }

  def decode(a: Any) : Option[CashDistribAgentCodeField] = a match {
    case v: String => Some(CashDistribAgentCodeField(v))
    case v: CashDistribAgentCodeField => Some(v)
    case _ => scala.Option.empty[CashDistribAgentCodeField]
  } 
}
