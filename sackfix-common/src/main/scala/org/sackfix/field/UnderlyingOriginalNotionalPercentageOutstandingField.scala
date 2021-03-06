package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class UnderlyingOriginalNotionalPercentageOutstandingField(override val value: Float) extends SfFieldFloat(1456, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1456)UnderlyingOriginalNotionalPercentageOutstanding=(").append(value).append(")")
}

object UnderlyingOriginalNotionalPercentageOutstandingField {
  val TagId = 1456  
  def apply(value: String) = try {
    new UnderlyingOriginalNotionalPercentageOutstandingField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingOriginalNotionalPercentageOutstanding("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingOriginalNotionalPercentageOutstandingField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingOriginalNotionalPercentageOutstandingField]
  }

  def decode(a: Any) : Option[UnderlyingOriginalNotionalPercentageOutstandingField] = a match {
    case v: String => Some(UnderlyingOriginalNotionalPercentageOutstandingField(v))
    case v: Float => Some(UnderlyingOriginalNotionalPercentageOutstandingField(v))
    case v: Double => Some(UnderlyingOriginalNotionalPercentageOutstandingField(v.toFloat))
    case v: Int => Some(UnderlyingOriginalNotionalPercentageOutstandingField(v.toFloat))
    case v: UnderlyingOriginalNotionalPercentageOutstandingField => Some(v)
    case _ => scala.Option.empty[UnderlyingOriginalNotionalPercentageOutstandingField]
  } 
}
