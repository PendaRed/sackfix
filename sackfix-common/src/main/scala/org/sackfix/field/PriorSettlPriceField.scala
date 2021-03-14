package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class PriorSettlPriceField(override val value: Float) extends SfFieldFloat(734, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(734)PriorSettlPrice=(").append(value).append(")")
}

object PriorSettlPriceField {
  val TagId = 734  
  def apply(value: String) = try {
    new PriorSettlPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PriorSettlPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PriorSettlPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriorSettlPriceField]
  }

  def decode(a: Any) : Option[PriorSettlPriceField] = a match {
    case v: String => Some(PriorSettlPriceField(v))
    case v: Float => Some(PriorSettlPriceField(v))
    case v: Double => Some(PriorSettlPriceField(v.toFloat))
    case v: Int => Some(PriorSettlPriceField(v.toFloat))
    case v: PriorSettlPriceField => Some(v)
    case _ => scala.Option.empty[PriorSettlPriceField]
  } 
}
