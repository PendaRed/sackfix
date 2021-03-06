package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class MDEntryPxField(override val value: Float) extends SfFieldFloat(270, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(270)MDEntryPx=(").append(value).append(")")
}

object MDEntryPxField {
  val TagId = 270  
  def apply(value: String) = try {
    new MDEntryPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDEntryPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDEntryPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDEntryPxField]
  }

  def decode(a: Any) : Option[MDEntryPxField] = a match {
    case v: String => Some(MDEntryPxField(v))
    case v: Float => Some(MDEntryPxField(v))
    case v: Double => Some(MDEntryPxField(v.toFloat))
    case v: Int => Some(MDEntryPxField(v.toFloat))
    case v: MDEntryPxField => Some(v)
    case _ => scala.Option.empty[MDEntryPxField]
  } 
}
