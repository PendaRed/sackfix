package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class TriggerPriceField(override val value: Float) extends SfFieldFloat(1102, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1102)TriggerPrice=(").append(value).append(")")
}

object TriggerPriceField {
  val TagId = 1102  
  def apply(value: String) = try {
    new TriggerPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TriggerPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TriggerPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerPriceField]
  }

  def decode(a: Any) : Option[TriggerPriceField] = a match {
    case v: String => Some(TriggerPriceField(v))
    case v: Float => Some(TriggerPriceField(v))
    case v: Double => Some(TriggerPriceField(v.toFloat))
    case v: Int => Some(TriggerPriceField(v.toFloat))
    case v: TriggerPriceField => Some(v)
    case _ => scala.Option.empty[TriggerPriceField]
  } 
}
