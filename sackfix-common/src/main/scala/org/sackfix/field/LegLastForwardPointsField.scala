package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegLastForwardPointsField(override val value: Float) extends SfFieldFloat(1073, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1073)LegLastForwardPoints=(").append(value).append(")")
}

object LegLastForwardPointsField {
  val TagId = 1073  
  def apply(value: String) = try {
    new LegLastForwardPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegLastForwardPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegLastForwardPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegLastForwardPointsField]
  }

  def decode(a: Any) : Option[LegLastForwardPointsField] = a match {
    case v: String => Some(LegLastForwardPointsField(v))
    case v: Float => Some(LegLastForwardPointsField(v))
    case v: Double => Some(LegLastForwardPointsField(v.toFloat))
    case v: Int => Some(LegLastForwardPointsField(v.toFloat))
    case v: LegLastForwardPointsField => Some(v)
    case _ => scala.Option.empty[LegLastForwardPointsField]
  } 
}
