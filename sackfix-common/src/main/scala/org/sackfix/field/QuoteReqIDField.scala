package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class QuoteReqIDField(override val value: String) extends SfFieldString(131, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(131)QuoteReqID=(").append(value).append(")")
}

object QuoteReqIDField {
  val TagId = 131  
  def decode(a: Option[Any]) : Option[QuoteReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteReqIDField]
  }

  def decode(a: Any) : Option[QuoteReqIDField] = a match {
    case v: String => Some(QuoteReqIDField(v))
    case v: QuoteReqIDField => Some(v)
    case _ => scala.Option.empty[QuoteReqIDField]
  } 
}
