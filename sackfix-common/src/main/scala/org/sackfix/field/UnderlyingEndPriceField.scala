package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingEndPriceField(override val value: Float) extends SfFieldFloat(883, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(883)UnderlyingEndPrice=(").append(value).append(")")
}

object UnderlyingEndPriceField {
  val TagId = 883  
  def apply(value: String) = try {
    new UnderlyingEndPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingEndPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingEndPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingEndPriceField]
  }

  def decode(a: Any) : Option[UnderlyingEndPriceField] = a match {
    case v: String => Some(UnderlyingEndPriceField(v))
    case v: Float => Some(UnderlyingEndPriceField(v))
    case v: Double => Some(UnderlyingEndPriceField(v.toFloat))
    case v: Int => Some(UnderlyingEndPriceField(v.toFloat))
    case v: UnderlyingEndPriceField => Some(v)
    case _ => scala.Option.empty[UnderlyingEndPriceField]
  } 
}
