package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class ParticipationRateField(override val value: Float) extends SfFieldFloat(849, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(849)ParticipationRate=(").append(value).append(")")
}

object ParticipationRateField {
  val TagId = 849  
  def apply(value: String) = try {
    new ParticipationRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ParticipationRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ParticipationRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ParticipationRateField]
  }

  def decode(a: Any) : Option[ParticipationRateField] = a match {
    case v: String => Some(ParticipationRateField(v))
    case v: Float => Some(ParticipationRateField(v))
    case v: Double => Some(ParticipationRateField(v.toFloat))
    case v: Int => Some(ParticipationRateField(v.toFloat))
    case v: ParticipationRateField => Some(v)
    case _ => scala.Option.empty[ParticipationRateField]
  } 
}
