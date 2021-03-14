package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class MDEntrySizeField(override val value: Float) extends SfFieldFloat(271, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(271)MDEntrySize=(").append(value).append(")")
}

object MDEntrySizeField {
  val TagId = 271  
  def apply(value: String) = try {
    new MDEntrySizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDEntrySize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDEntrySizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDEntrySizeField]
  }

  def decode(a: Any) : Option[MDEntrySizeField] = a match {
    case v: String => Some(MDEntrySizeField(v))
    case v: Float => Some(MDEntrySizeField(v))
    case v: Double => Some(MDEntrySizeField(v.toFloat))
    case v: Int => Some(MDEntrySizeField(v.toFloat))
    case v: MDEntrySizeField => Some(v)
    case _ => scala.Option.empty[MDEntrySizeField]
  } 
}
