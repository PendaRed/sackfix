package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class LastSwapPointsField(override val value: Float) extends SfFieldFloat(1071, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1071)LastSwapPoints=(").append(value).append(")")
}

object LastSwapPointsField {
  val TagId = 1071  
  def apply(value: String) = try {
    new LastSwapPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastSwapPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastSwapPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastSwapPointsField]
  }

  def decode(a: Any) : Option[LastSwapPointsField] = a match {
    case v: String => Some(LastSwapPointsField(v))
    case v: Float => Some(LastSwapPointsField(v))
    case v: Double => Some(LastSwapPointsField(v.toFloat))
    case v: Int => Some(LastSwapPointsField(v.toFloat))
    case v: LastSwapPointsField => Some(v)
    case _ => scala.Option.empty[LastSwapPointsField]
  } 
}
