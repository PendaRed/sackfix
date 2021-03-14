package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingCapValueField(override val value: Float) extends SfFieldFloat(1038, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1038)UnderlyingCapValue=(").append(value).append(")")
}

object UnderlyingCapValueField {
  val TagId = 1038  
  def apply(value: String) = try {
    new UnderlyingCapValueField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingCapValue("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingCapValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingCapValueField]
  }

  def decode(a: Any) : Option[UnderlyingCapValueField] = a match {
    case v: String => Some(UnderlyingCapValueField(v))
    case v: Float => Some(UnderlyingCapValueField(v))
    case v: Double => Some(UnderlyingCapValueField(v.toFloat))
    case v: Int => Some(UnderlyingCapValueField(v.toFloat))
    case v: UnderlyingCapValueField => Some(v)
    case _ => scala.Option.empty[UnderlyingCapValueField]
  } 
}
