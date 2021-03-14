package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class CollInquiryIDField(override val value: String) extends SfFieldString(909, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(909)CollInquiryID=(").append(value).append(")")
}

object CollInquiryIDField {
  val TagId = 909  
  def decode(a: Option[Any]) : Option[CollInquiryIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollInquiryIDField]
  }

  def decode(a: Any) : Option[CollInquiryIDField] = a match {
    case v: String => Some(CollInquiryIDField(v))
    case v: CollInquiryIDField => Some(v)
    case _ => scala.Option.empty[CollInquiryIDField]
  } 
}
