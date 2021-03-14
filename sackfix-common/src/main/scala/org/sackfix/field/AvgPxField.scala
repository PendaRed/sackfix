package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class AvgPxField(override val value: Float) extends SfFieldFloat(6, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(6)AvgPx=(").append(value).append(")")
}

object AvgPxField {
  val TagId = 6  
  def apply(value: String) = try {
    new AvgPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AvgPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AvgPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AvgPxField]
  }

  def decode(a: Any) : Option[AvgPxField] = a match {
    case v: String => Some(AvgPxField(v))
    case v: Float => Some(AvgPxField(v))
    case v: Double => Some(AvgPxField(v.toFloat))
    case v: Int => Some(AvgPxField(v.toFloat))
    case v: AvgPxField => Some(v)
    case _ => scala.Option.empty[AvgPxField]
  } 
}
