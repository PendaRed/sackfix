package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class QuoteSetValidUntilTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(367, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(367)QuoteSetValidUntilTime=(").append(value).append(")")
}

object QuoteSetValidUntilTimeField {
  val TagId = 367  
  def apply(value: String) = try {
    new QuoteSetValidUntilTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuoteSetValidUntilTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuoteSetValidUntilTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteSetValidUntilTimeField]
  }

  def decode(a: Any) : Option[QuoteSetValidUntilTimeField] = a match {
    case v: String => Some(QuoteSetValidUntilTimeField(v))
    case v: LocalDateTime => Some(QuoteSetValidUntilTimeField(v))
    case v: QuoteSetValidUntilTimeField => Some(v)
    case _ => scala.Option.empty[QuoteSetValidUntilTimeField]
  } 
}
