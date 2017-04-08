package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingNotionalPercentageOutstandingField(override val value: Float) extends SfFieldFloat(1455, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1455)UnderlyingNotionalPercentageOutstanding=(").append(value).append(")")
}

object UnderlyingNotionalPercentageOutstandingField {
  val TagId = 1455  
  def apply(value: String) = try {
    new UnderlyingNotionalPercentageOutstandingField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingNotionalPercentageOutstanding("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingNotionalPercentageOutstandingField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingNotionalPercentageOutstandingField]
  }

  def decode(a: Any) : Option[UnderlyingNotionalPercentageOutstandingField] = a match {
    case v: String => Some(UnderlyingNotionalPercentageOutstandingField(v))
    case v: Float => Some(UnderlyingNotionalPercentageOutstandingField(v))
    case v: Double => Some(UnderlyingNotionalPercentageOutstandingField(v.toFloat))
    case v: Int => Some(UnderlyingNotionalPercentageOutstandingField(v.toFloat))
    case v: UnderlyingNotionalPercentageOutstandingField => Some(v)
    case _ => scala.Option.empty[UnderlyingNotionalPercentageOutstandingField]
  } 
}
