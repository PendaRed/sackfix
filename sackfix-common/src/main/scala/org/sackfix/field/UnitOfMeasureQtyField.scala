package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnitOfMeasureQtyField(override val value: Float) extends SfFieldFloat(1147, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1147)UnitOfMeasureQty=(").append(value).append(")")
}

object UnitOfMeasureQtyField {
  val TagId = 1147  
  def apply(value: String) = try {
    new UnitOfMeasureQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnitOfMeasureQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnitOfMeasureQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnitOfMeasureQtyField]
  }

  def decode(a: Any) : Option[UnitOfMeasureQtyField] = a match {
    case v: String => Some(UnitOfMeasureQtyField(v))
    case v: Float => Some(UnitOfMeasureQtyField(v))
    case v: Double => Some(UnitOfMeasureQtyField(v.toFloat))
    case v: Int => Some(UnitOfMeasureQtyField(v.toFloat))
    case v: UnitOfMeasureQtyField => Some(v)
    case _ => scala.Option.empty[UnitOfMeasureQtyField]
  } 
}
