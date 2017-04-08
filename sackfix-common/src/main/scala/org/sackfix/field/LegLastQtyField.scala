package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegLastQtyField(override val value: Float) extends SfFieldFloat(1418, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1418)LegLastQty=(").append(value).append(")")
}

object LegLastQtyField {
  val TagId = 1418  
  def apply(value: String) = try {
    new LegLastQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegLastQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegLastQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegLastQtyField]
  }

  def decode(a: Any) : Option[LegLastQtyField] = a match {
    case v: String => Some(LegLastQtyField(v))
    case v: Float => Some(LegLastQtyField(v))
    case v: Double => Some(LegLastQtyField(v.toFloat))
    case v: Int => Some(LegLastQtyField(v.toFloat))
    case v: LegLastQtyField => Some(v)
    case _ => scala.Option.empty[LegLastQtyField]
  } 
}
