package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class PctAtRiskField(override val value: Float) extends SfFieldFloat(869, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(869)PctAtRisk=(").append(value).append(")")
}

object PctAtRiskField {
  val TagId = 869  
  def apply(value: String) = try {
    new PctAtRiskField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PctAtRisk("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PctAtRiskField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PctAtRiskField]
  }

  def decode(a: Any) : Option[PctAtRiskField] = a match {
    case v: String => Some(PctAtRiskField(v))
    case v: Float => Some(PctAtRiskField(v))
    case v: Double => Some(PctAtRiskField(v.toFloat))
    case v: Int => Some(PctAtRiskField(v.toFloat))
    case v: PctAtRiskField => Some(v)
    case _ => scala.Option.empty[PctAtRiskField]
  } 
}
