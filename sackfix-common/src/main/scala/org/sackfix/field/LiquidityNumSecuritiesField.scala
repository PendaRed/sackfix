package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class LiquidityNumSecuritiesField(override val value: Int) extends SfFieldInt(441, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(441)LiquidityNumSecurities=(").append(value).append(")")
}

object LiquidityNumSecuritiesField {
  val TagId = 441  
  def apply(value: String) = try {
    new LiquidityNumSecuritiesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LiquidityNumSecurities("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LiquidityNumSecuritiesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LiquidityNumSecuritiesField]
  }

  def decode(a: Any) : Option[LiquidityNumSecuritiesField] = a match {
    case v: String => Some(LiquidityNumSecuritiesField(v))
    case v: Int => Some(LiquidityNumSecuritiesField(v))
    case v: LiquidityNumSecuritiesField => Some(v)
    case _ => scala.Option.empty[LiquidityNumSecuritiesField]
  } 
}
