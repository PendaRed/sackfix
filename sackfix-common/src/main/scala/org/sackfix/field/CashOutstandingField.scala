package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class CashOutstandingField(override val value: Float) extends SfFieldFloat(901, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(901)CashOutstanding=(").append(value).append(")")
}

object CashOutstandingField {
  val TagId = 901  
  def apply(value: String) = try {
    new CashOutstandingField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CashOutstanding("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CashOutstandingField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashOutstandingField]
  }

  def decode(a: Any) : Option[CashOutstandingField] = a match {
    case v: String => Some(CashOutstandingField(v))
    case v: Float => Some(CashOutstandingField(v))
    case v: Double => Some(CashOutstandingField(v.toFloat))
    case v: Int => Some(CashOutstandingField(v.toFloat))
    case v: CashOutstandingField => Some(v)
    case _ => scala.Option.empty[CashOutstandingField]
  } 
}
