package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class CardIssNoField(override val value: String) extends SfFieldString(491, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(491)CardIssNo=(").append(value).append(")")
}

object CardIssNoField {
  val TagId = 491  
  def decode(a: Option[Any]) : Option[CardIssNoField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CardIssNoField]
  }

  def decode(a: Any) : Option[CardIssNoField] = a match {
    case v: String => Some(CardIssNoField(v))
    case v: CardIssNoField => Some(v)
    case _ => scala.Option.empty[CardIssNoField]
  } 
}
