package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class AttachmentPointField(override val value: Float) extends SfFieldFloat(1457, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1457)AttachmentPoint=(").append(value).append(")")
}

object AttachmentPointField {
  val TagId = 1457  
  def apply(value: String) = try {
    new AttachmentPointField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AttachmentPoint("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AttachmentPointField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AttachmentPointField]
  }

  def decode(a: Any) : Option[AttachmentPointField] = a match {
    case v: String => Some(AttachmentPointField(v))
    case v: Float => Some(AttachmentPointField(v))
    case v: Double => Some(AttachmentPointField(v.toFloat))
    case v: Int => Some(AttachmentPointField(v.toFloat))
    case v: AttachmentPointField => Some(v)
    case _ => scala.Option.empty[AttachmentPointField]
  } 
}
