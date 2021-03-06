package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class EffectiveTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(168, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(168)EffectiveTime=(").append(value).append(")")
}

object EffectiveTimeField {
  val TagId = 168  
  def apply(value: String) = try {
    new EffectiveTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EffectiveTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EffectiveTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EffectiveTimeField]
  }

  def decode(a: Any) : Option[EffectiveTimeField] = a match {
    case v: String => Some(EffectiveTimeField(v))
    case v: LocalDateTime => Some(EffectiveTimeField(v))
    case v: EffectiveTimeField => Some(v)
    case _ => scala.Option.empty[EffectiveTimeField]
  } 
}
