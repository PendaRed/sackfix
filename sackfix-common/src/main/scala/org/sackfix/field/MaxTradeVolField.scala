package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class MaxTradeVolField(override val value: Float) extends SfFieldFloat(1140, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1140)MaxTradeVol=(").append(value).append(")")
}

object MaxTradeVolField {
  val TagId = 1140  
  def apply(value: String) = try {
    new MaxTradeVolField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaxTradeVol("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaxTradeVolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaxTradeVolField]
  }

  def decode(a: Any) : Option[MaxTradeVolField] = a match {
    case v: String => Some(MaxTradeVolField(v))
    case v: Float => Some(MaxTradeVolField(v))
    case v: Double => Some(MaxTradeVolField(v.toFloat))
    case v: Int => Some(MaxTradeVolField(v.toFloat))
    case v: MaxTradeVolField => Some(v)
    case _ => scala.Option.empty[MaxTradeVolField]
  } 
}
