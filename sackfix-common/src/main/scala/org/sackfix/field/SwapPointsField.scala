package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class SwapPointsField(override val value: Float) extends SfFieldFloat(1069, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1069)SwapPoints=(").append(value).append(")")
}

object SwapPointsField {
  val TagId = 1069  
  def apply(value: String) = try {
    new SwapPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SwapPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SwapPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SwapPointsField]
  }

  def decode(a: Any) : Option[SwapPointsField] = a match {
    case v: String => Some(SwapPointsField(v))
    case v: Float => Some(SwapPointsField(v))
    case v: Double => Some(SwapPointsField(v.toFloat))
    case v: Int => Some(SwapPointsField(v.toFloat))
    case v: SwapPointsField => Some(v)
    case _ => scala.Option.empty[SwapPointsField]
  } 
}
