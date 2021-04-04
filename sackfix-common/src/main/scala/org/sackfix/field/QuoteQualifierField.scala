package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class QuoteQualifierField(override val value: String) extends SfFieldString(695, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(695)QuoteQualifier=(").append(value).append(")")
}

object QuoteQualifierField {
  val TagId = 695  
  def decode(a: Option[Any]) : Option[QuoteQualifierField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteQualifierField]
  }

  def decode(a: Any) : Option[QuoteQualifierField] = a match {
    case v: String => Some(QuoteQualifierField(v))
    case v: Char => Some(QuoteQualifierField(v.toString))
    case v: QuoteQualifierField => Some(v)
    case _ => scala.Option.empty[QuoteQualifierField]
  } 
}
