package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class EndTickPriceRangeField(override val value: Float) extends SfFieldFloat(1207, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1207)EndTickPriceRange=(").append(value).append(")")
}

object EndTickPriceRangeField {
  val TagId = 1207  
  def apply(value: String) = try {
    new EndTickPriceRangeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EndTickPriceRange("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EndTickPriceRangeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EndTickPriceRangeField]
  }

  def decode(a: Any) : Option[EndTickPriceRangeField] = a match {
    case v: String => Some(EndTickPriceRangeField(v))
    case v: Float => Some(EndTickPriceRangeField(v))
    case v: Double => Some(EndTickPriceRangeField(v.toFloat))
    case v: Int => Some(EndTickPriceRangeField(v.toFloat))
    case v: EndTickPriceRangeField => Some(v)
    case _ => scala.Option.empty[EndTickPriceRangeField]
  } 
}
