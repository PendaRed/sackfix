package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class WtAverageLiquidityField(override val value: Float) extends SfFieldFloat(410, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(410)WtAverageLiquidity=(").append(value).append(")")
}

object WtAverageLiquidityField {
  val TagId = 410  
  def apply(value: String) = try {
    new WtAverageLiquidityField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new WtAverageLiquidity("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[WtAverageLiquidityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[WtAverageLiquidityField]
  }

  def decode(a: Any) : Option[WtAverageLiquidityField] = a match {
    case v: String => Some(WtAverageLiquidityField(v))
    case v: Float => Some(WtAverageLiquidityField(v))
    case v: Double => Some(WtAverageLiquidityField(v.toFloat))
    case v: Int => Some(WtAverageLiquidityField(v.toFloat))
    case v: WtAverageLiquidityField => Some(v)
    case _ => scala.Option.empty[WtAverageLiquidityField]
  } 
}
