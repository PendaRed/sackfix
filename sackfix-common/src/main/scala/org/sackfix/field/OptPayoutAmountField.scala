package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class OptPayoutAmountField(override val value: Float) extends SfFieldFloat(1195, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1195)OptPayoutAmount=(").append(value).append(")")
}

object OptPayoutAmountField {
  val TagId = 1195  
  def apply(value: String) = try {
    new OptPayoutAmountField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OptPayoutAmount("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OptPayoutAmountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OptPayoutAmountField]
  }

  def decode(a: Any) : Option[OptPayoutAmountField] = a match {
    case v: String => Some(OptPayoutAmountField(v))
    case v: Float => Some(OptPayoutAmountField(v))
    case v: Double => Some(OptPayoutAmountField(v.toFloat))
    case v: Int => Some(OptPayoutAmountField(v.toFloat))
    case v: OptPayoutAmountField => Some(v)
    case _ => scala.Option.empty[OptPayoutAmountField]
  } 
}
