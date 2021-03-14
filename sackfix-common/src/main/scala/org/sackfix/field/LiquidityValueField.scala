package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class LiquidityValueField(override val value: Float) extends SfFieldFloat(404, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(404)LiquidityValue=(").append(value).append(")")
}

object LiquidityValueField {
  val TagId = 404  
  def apply(value: String) = try {
    new LiquidityValueField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LiquidityValue("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LiquidityValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LiquidityValueField]
  }

  def decode(a: Any) : Option[LiquidityValueField] = a match {
    case v: String => Some(LiquidityValueField(v))
    case v: Float => Some(LiquidityValueField(v))
    case v: Double => Some(LiquidityValueField(v.toFloat))
    case v: Int => Some(LiquidityValueField(v.toFloat))
    case v: LiquidityValueField => Some(v)
    case _ => scala.Option.empty[LiquidityValueField]
  } 
}
