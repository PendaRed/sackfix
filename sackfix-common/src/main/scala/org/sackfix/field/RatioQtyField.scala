package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class RatioQtyField(override val value: Float) extends SfFieldFloat(319, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(319)RatioQty=(").append(value).append(")")
}

object RatioQtyField {
  val TagId = 319  
  def apply(value: String) = try {
    new RatioQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RatioQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RatioQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RatioQtyField]
  }

  def decode(a: Any) : Option[RatioQtyField] = a match {
    case v: String => Some(RatioQtyField(v))
    case v: Float => Some(RatioQtyField(v))
    case v: Double => Some(RatioQtyField(v.toFloat))
    case v: Int => Some(RatioQtyField(v.toFloat))
    case v: RatioQtyField => Some(v)
    case _ => scala.Option.empty[RatioQtyField]
  } 
}
