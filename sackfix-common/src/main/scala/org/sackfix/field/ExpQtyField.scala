package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class ExpQtyField(override val value: Float) extends SfFieldFloat(983, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(983)ExpQty=(").append(value).append(")")
}

object ExpQtyField {
  val TagId = 983  
  def apply(value: String) = try {
    new ExpQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExpQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExpQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExpQtyField]
  }

  def decode(a: Any) : Option[ExpQtyField] = a match {
    case v: String => Some(ExpQtyField(v))
    case v: Float => Some(ExpQtyField(v))
    case v: Double => Some(ExpQtyField(v.toFloat))
    case v: Int => Some(ExpQtyField(v.toFloat))
    case v: ExpQtyField => Some(v)
    case _ => scala.Option.empty[ExpQtyField]
  } 
}
