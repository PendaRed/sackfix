package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class LegPriceUnitOfMeasureQtyField(override val value: Float) extends SfFieldFloat(1422, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1422)LegPriceUnitOfMeasureQty=(").append(value).append(")")
}

object LegPriceUnitOfMeasureQtyField {
  val TagId = 1422  
  def apply(value: String) = try {
    new LegPriceUnitOfMeasureQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegPriceUnitOfMeasureQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegPriceUnitOfMeasureQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegPriceUnitOfMeasureQtyField]
  }

  def decode(a: Any) : Option[LegPriceUnitOfMeasureQtyField] = a match {
    case v: String => Some(LegPriceUnitOfMeasureQtyField(v))
    case v: Float => Some(LegPriceUnitOfMeasureQtyField(v))
    case v: Double => Some(LegPriceUnitOfMeasureQtyField(v.toFloat))
    case v: Int => Some(LegPriceUnitOfMeasureQtyField(v.toFloat))
    case v: LegPriceUnitOfMeasureQtyField => Some(v)
    case _ => scala.Option.empty[LegPriceUnitOfMeasureQtyField]
  } 
}
