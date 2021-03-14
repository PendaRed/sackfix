package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class LegBidForwardPointsField(override val value: Float) extends SfFieldFloat(1067, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1067)LegBidForwardPoints=(").append(value).append(")")
}

object LegBidForwardPointsField {
  val TagId = 1067  
  def apply(value: String) = try {
    new LegBidForwardPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegBidForwardPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegBidForwardPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegBidForwardPointsField]
  }

  def decode(a: Any) : Option[LegBidForwardPointsField] = a match {
    case v: String => Some(LegBidForwardPointsField(v))
    case v: Float => Some(LegBidForwardPointsField(v))
    case v: Double => Some(LegBidForwardPointsField(v.toFloat))
    case v: Int => Some(LegBidForwardPointsField(v.toFloat))
    case v: LegBidForwardPointsField => Some(v)
    case _ => scala.Option.empty[LegBidForwardPointsField]
  } 
}
