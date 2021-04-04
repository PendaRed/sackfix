package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class ApplQueueMaxField(override val value: Int) extends SfFieldInt(812, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(812)ApplQueueMax=(").append(value).append(")")
}

object ApplQueueMaxField {
  val TagId = 812  
  def apply(value: String) = try {
    new ApplQueueMaxField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplQueueMax("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplQueueMaxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplQueueMaxField]
  }

  def decode(a: Any) : Option[ApplQueueMaxField] = a match {
    case v: String => Some(ApplQueueMaxField(v))
    case v: Int => Some(ApplQueueMaxField(v))
    case v: ApplQueueMaxField => Some(v)
    case _ => scala.Option.empty[ApplQueueMaxField]
  } 
}
