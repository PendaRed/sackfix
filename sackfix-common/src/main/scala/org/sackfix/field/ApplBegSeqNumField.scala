package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class ApplBegSeqNumField(override val value: Int) extends SfFieldInt(1182, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1182)ApplBegSeqNum=(").append(value).append(")")
}

object ApplBegSeqNumField {
  val TagId = 1182  
  def apply(value: String) = try {
    new ApplBegSeqNumField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplBegSeqNum("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplBegSeqNumField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplBegSeqNumField]
  }

  def decode(a: Any) : Option[ApplBegSeqNumField] = a match {
    case v: String => Some(ApplBegSeqNumField(v))
    case v: Int => Some(ApplBegSeqNumField(v))
    case v: ApplBegSeqNumField => Some(v)
    case _ => scala.Option.empty[ApplBegSeqNumField]
  } 
}
