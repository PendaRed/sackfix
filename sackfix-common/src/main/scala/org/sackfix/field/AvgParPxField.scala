package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class AvgParPxField(override val value: Float) extends SfFieldFloat(860, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(860)AvgParPx=(").append(value).append(")")
}

object AvgParPxField {
  val TagId = 860  
  def apply(value: String) = try {
    new AvgParPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AvgParPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AvgParPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AvgParPxField]
  }

  def decode(a: Any) : Option[AvgParPxField] = a match {
    case v: String => Some(AvgParPxField(v))
    case v: Float => Some(AvgParPxField(v))
    case v: Double => Some(AvgParPxField(v.toFloat))
    case v: Int => Some(AvgParPxField(v.toFloat))
    case v: AvgParPxField => Some(v)
    case _ => scala.Option.empty[AvgParPxField]
  } 
}