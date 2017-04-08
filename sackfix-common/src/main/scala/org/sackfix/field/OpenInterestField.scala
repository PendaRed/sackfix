package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class OpenInterestField(override val value: Float) extends SfFieldFloat(746, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(746)OpenInterest=(").append(value).append(")")
}

object OpenInterestField {
  val TagId = 746  
  def apply(value: String) = try {
    new OpenInterestField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OpenInterest("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OpenInterestField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OpenInterestField]
  }

  def decode(a: Any) : Option[OpenInterestField] = a match {
    case v: String => Some(OpenInterestField(v))
    case v: Float => Some(OpenInterestField(v))
    case v: Double => Some(OpenInterestField(v.toFloat))
    case v: Int => Some(OpenInterestField(v.toFloat))
    case v: OpenInterestField => Some(v)
    case _ => scala.Option.empty[OpenInterestField]
  } 
}
