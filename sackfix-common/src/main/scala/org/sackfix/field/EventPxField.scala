package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class EventPxField(override val value: Float) extends SfFieldFloat(867, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(867)EventPx=(").append(value).append(")")
}

object EventPxField {
  val TagId = 867  
  def apply(value: String) = try {
    new EventPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EventPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EventPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EventPxField]
  }

  def decode(a: Any) : Option[EventPxField] = a match {
    case v: String => Some(EventPxField(v))
    case v: Float => Some(EventPxField(v))
    case v: Double => Some(EventPxField(v.toFloat))
    case v: Int => Some(EventPxField(v.toFloat))
    case v: EventPxField => Some(v)
    case _ => scala.Option.empty[EventPxField]
  } 
}
