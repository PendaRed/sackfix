package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class BrokerOfCreditField(override val value: String) extends SfFieldString(92, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(92)BrokerOfCredit=(").append(value).append(")")
}

object BrokerOfCreditField {
  val TagId = 92  
  def decode(a: Option[Any]) : Option[BrokerOfCreditField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BrokerOfCreditField]
  }

  def decode(a: Any) : Option[BrokerOfCreditField] = a match {
    case v: String => Some(BrokerOfCreditField(v))
    case v: BrokerOfCreditField => Some(v)
    case _ => scala.Option.empty[BrokerOfCreditField]
  } 
}
