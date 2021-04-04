package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoCollInquiryQualifierField(override val value: Int) extends SfNumInGroup(938, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(938)NoCollInquiryQualifier=(").append(value).append(")")
}

object NoCollInquiryQualifierField {
  val TagId = 938  
  def apply(value: String) = try {
    new NoCollInquiryQualifierField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoCollInquiryQualifier("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoCollInquiryQualifierField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoCollInquiryQualifierField]
  }

  def decode(a: Any) : Option[NoCollInquiryQualifierField] = a match {
    case v: String => Some(NoCollInquiryQualifierField(v))
    case v: Int => Some(NoCollInquiryQualifierField(v))
    case v: NoCollInquiryQualifierField => Some(v)
    case _ => scala.Option.empty[NoCollInquiryQualifierField]
  } 
}
