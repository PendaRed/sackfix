package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegGrossTradeAmtField(override val value: Float) extends SfFieldFloat(1075, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1075)LegGrossTradeAmt=(").append(value).append(")")
}

object LegGrossTradeAmtField {
  val TagId = 1075  
  def apply(value: String) = try {
    new LegGrossTradeAmtField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegGrossTradeAmt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegGrossTradeAmtField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegGrossTradeAmtField]
  }

  def decode(a: Any) : Option[LegGrossTradeAmtField] = a match {
    case v: String => Some(LegGrossTradeAmtField(v))
    case v: Float => Some(LegGrossTradeAmtField(v))
    case v: Double => Some(LegGrossTradeAmtField(v.toFloat))
    case v: Int => Some(LegGrossTradeAmtField(v.toFloat))
    case v: LegGrossTradeAmtField => Some(v)
    case _ => scala.Option.empty[LegGrossTradeAmtField]
  } 
}
