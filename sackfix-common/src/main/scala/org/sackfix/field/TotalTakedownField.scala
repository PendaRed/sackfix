package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class TotalTakedownField(override val value: Float) extends SfFieldFloat(237, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(237)TotalTakedown=(").append(value).append(")")
}

object TotalTakedownField {
  val TagId = 237  
  def apply(value: String) = try {
    new TotalTakedownField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotalTakedown("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotalTakedownField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotalTakedownField]
  }

  def decode(a: Any) : Option[TotalTakedownField] = a match {
    case v: String => Some(TotalTakedownField(v))
    case v: Float => Some(TotalTakedownField(v))
    case v: Double => Some(TotalTakedownField(v.toFloat))
    case v: Int => Some(TotalTakedownField(v.toFloat))
    case v: TotalTakedownField => Some(v)
    case _ => scala.Option.empty[TotalTakedownField]
  } 
}
