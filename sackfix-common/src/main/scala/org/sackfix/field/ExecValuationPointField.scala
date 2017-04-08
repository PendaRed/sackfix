package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExecValuationPointField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(515, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(515)ExecValuationPoint=(").append(value).append(")")
}

object ExecValuationPointField {
  val TagId = 515  
  def apply(value: String) = try {
    new ExecValuationPointField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExecValuationPoint("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExecValuationPointField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExecValuationPointField]
  }

  def decode(a: Any) : Option[ExecValuationPointField] = a match {
    case v: String => Some(ExecValuationPointField(v))
    case v: LocalDateTime => Some(ExecValuationPointField(v))
    case v: ExecValuationPointField => Some(v)
    case _ => scala.Option.empty[ExecValuationPointField]
  } 
}