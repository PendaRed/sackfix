package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class CollInquiryStatusField(override val value: Int) extends SfFieldInt(945, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(945)CollInquiryStatus=(").append(value).append(")").append(CollInquiryStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object CollInquiryStatusField {
  val TagId = 945 
  val Accepted=0
  val AcceptedWithWarnings=1
  val Completed=2
  val CompletedWithWarnings=3
  val Rejected=4
  lazy val fixDescriptionByValue = Map(0->"ACCEPTED",1->"ACCEPTED_WITH_WARNINGS",
    2->"COMPLETED",3->"COMPLETED_WITH_WARNINGS",4->"REJECTED")
 
  def apply(value: String) = try {
    new CollInquiryStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CollInquiryStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CollInquiryStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollInquiryStatusField]
  }

  def decode(a: Any) : Option[CollInquiryStatusField] = a match {
    case v: String => Some(CollInquiryStatusField(v))
    case v: Int => Some(CollInquiryStatusField(v))
    case v: CollInquiryStatusField => Some(v)
    case _ => scala.Option.empty[CollInquiryStatusField]
  } 
}
