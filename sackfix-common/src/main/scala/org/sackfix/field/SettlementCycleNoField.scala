package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlementCycleNoField(override val value: Int) extends SfFieldInt(1153, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1153)SettlementCycleNo=(").append(value).append(")")
}

object SettlementCycleNoField {
  val TagId = 1153  
  def apply(value: String) = try {
    new SettlementCycleNoField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlementCycleNo("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlementCycleNoField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlementCycleNoField]
  }

  def decode(a: Any) : Option[SettlementCycleNoField] = a match {
    case v: String => Some(SettlementCycleNoField(v))
    case v: Int => Some(SettlementCycleNoField(v))
    case v: SettlementCycleNoField => Some(v)
    case _ => scala.Option.empty[SettlementCycleNoField]
  } 
}
