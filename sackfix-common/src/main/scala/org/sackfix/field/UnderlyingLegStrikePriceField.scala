package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class UnderlyingLegStrikePriceField(override val value: Float) extends SfFieldFloat(1340, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1340)UnderlyingLegStrikePrice=(").append(value).append(")")
}

object UnderlyingLegStrikePriceField {
  val TagId = 1340  
  def apply(value: String) = try {
    new UnderlyingLegStrikePriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingLegStrikePrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingLegStrikePriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegStrikePriceField]
  }

  def decode(a: Any) : Option[UnderlyingLegStrikePriceField] = a match {
    case v: String => Some(UnderlyingLegStrikePriceField(v))
    case v: Float => Some(UnderlyingLegStrikePriceField(v))
    case v: Double => Some(UnderlyingLegStrikePriceField(v.toFloat))
    case v: Int => Some(UnderlyingLegStrikePriceField(v.toFloat))
    case v: UnderlyingLegStrikePriceField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegStrikePriceField]
  } 
}
