package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class DetachmentPointField(override val value: Float) extends SfFieldFloat(1458, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1458)DetachmentPoint=(").append(value).append(")")
}

object DetachmentPointField {
  val TagId = 1458  
  def apply(value: String) = try {
    new DetachmentPointField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DetachmentPoint("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DetachmentPointField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DetachmentPointField]
  }

  def decode(a: Any) : Option[DetachmentPointField] = a match {
    case v: String => Some(DetachmentPointField(v))
    case v: Float => Some(DetachmentPointField(v))
    case v: Double => Some(DetachmentPointField(v.toFloat))
    case v: Int => Some(DetachmentPointField(v.toFloat))
    case v: DetachmentPointField => Some(v)
    case _ => scala.Option.empty[DetachmentPointField]
  } 
}
