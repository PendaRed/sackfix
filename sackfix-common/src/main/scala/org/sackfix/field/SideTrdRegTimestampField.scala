package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class SideTrdRegTimestampField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(1012, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1012)SideTrdRegTimestamp=(").append(value).append(")")
}

object SideTrdRegTimestampField {
  val TagId = 1012  
  def apply(value: String) = try {
    new SideTrdRegTimestampField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SideTrdRegTimestamp("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SideTrdRegTimestampField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideTrdRegTimestampField]
  }

  def decode(a: Any) : Option[SideTrdRegTimestampField] = a match {
    case v: String => Some(SideTrdRegTimestampField(v))
    case v: LocalDateTime => Some(SideTrdRegTimestampField(v))
    case v: SideTrdRegTimestampField => Some(v)
    case _ => scala.Option.empty[SideTrdRegTimestampField]
  } 
}
