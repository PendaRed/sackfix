package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingLastPxField(override val value: Float) extends SfFieldFloat(651, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(651)UnderlyingLastPx=(").append(value).append(")")
}

object UnderlyingLastPxField {
  val TagId = 651  
  def apply(value: String) = try {
    new UnderlyingLastPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingLastPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingLastPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLastPxField]
  }

  def decode(a: Any) : Option[UnderlyingLastPxField] = a match {
    case v: String => Some(UnderlyingLastPxField(v))
    case v: Float => Some(UnderlyingLastPxField(v))
    case v: Double => Some(UnderlyingLastPxField(v.toFloat))
    case v: Int => Some(UnderlyingLastPxField(v.toFloat))
    case v: UnderlyingLastPxField => Some(v)
    case _ => scala.Option.empty[UnderlyingLastPxField]
  } 
}
