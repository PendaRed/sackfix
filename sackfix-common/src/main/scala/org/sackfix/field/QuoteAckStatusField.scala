package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class QuoteAckStatusField(override val value: Int) extends SfFieldInt(297, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(297)QuoteAckStatus=(").append(value).append(")")
}

object QuoteAckStatusField {
  val TagId = 297  
  def apply(value: String) = try {
    new QuoteAckStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuoteAckStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuoteAckStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteAckStatusField]
  }

  def decode(a: Any) : Option[QuoteAckStatusField] = a match {
    case v: String => Some(QuoteAckStatusField(v))
    case v: Int => Some(QuoteAckStatusField(v))
    case v: QuoteAckStatusField => Some(v)
    case _ => scala.Option.empty[QuoteAckStatusField]
  } 
}
