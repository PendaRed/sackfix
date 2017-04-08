package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegPriceField(override val value: Float) extends SfFieldFloat(566, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(566)LegPrice=(").append(value).append(")")
}

object LegPriceField {
  val TagId = 566  
  def apply(value: String) = try {
    new LegPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegPriceField]
  }

  def decode(a: Any) : Option[LegPriceField] = a match {
    case v: String => Some(LegPriceField(v))
    case v: Float => Some(LegPriceField(v))
    case v: Double => Some(LegPriceField(v.toFloat))
    case v: Int => Some(LegPriceField(v.toFloat))
    case v: LegPriceField => Some(v)
    case _ => scala.Option.empty[LegPriceField]
  } 
}
