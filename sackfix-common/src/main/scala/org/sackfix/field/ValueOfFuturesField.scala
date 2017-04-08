package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class ValueOfFuturesField(override val value: Float) extends SfFieldFloat(408, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(408)ValueOfFutures=(").append(value).append(")")
}

object ValueOfFuturesField {
  val TagId = 408  
  def apply(value: String) = try {
    new ValueOfFuturesField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ValueOfFutures("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ValueOfFuturesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ValueOfFuturesField]
  }

  def decode(a: Any) : Option[ValueOfFuturesField] = a match {
    case v: String => Some(ValueOfFuturesField(v))
    case v: Float => Some(ValueOfFuturesField(v))
    case v: Double => Some(ValueOfFuturesField(v.toFloat))
    case v: Int => Some(ValueOfFuturesField(v.toFloat))
    case v: ValueOfFuturesField => Some(v)
    case _ => scala.Option.empty[ValueOfFuturesField]
  } 
}
