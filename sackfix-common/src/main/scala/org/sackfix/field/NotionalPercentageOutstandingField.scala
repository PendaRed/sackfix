package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class NotionalPercentageOutstandingField(override val value: Float) extends SfFieldFloat(1451, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1451)NotionalPercentageOutstanding=(").append(value).append(")")
}

object NotionalPercentageOutstandingField {
  val TagId = 1451  
  def apply(value: String) = try {
    new NotionalPercentageOutstandingField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NotionalPercentageOutstanding("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NotionalPercentageOutstandingField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NotionalPercentageOutstandingField]
  }

  def decode(a: Any) : Option[NotionalPercentageOutstandingField] = a match {
    case v: String => Some(NotionalPercentageOutstandingField(v))
    case v: Float => Some(NotionalPercentageOutstandingField(v))
    case v: Double => Some(NotionalPercentageOutstandingField(v.toFloat))
    case v: Int => Some(NotionalPercentageOutstandingField(v.toFloat))
    case v: NotionalPercentageOutstandingField => Some(v)
    case _ => scala.Option.empty[NotionalPercentageOutstandingField]
  } 
}
