package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class CardStartDateField(override val value: LocalDate) extends SfFieldLocalMktDate(503, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(503)CardStartDate=(").append(value).append(")")
}

object CardStartDateField {
  val TagId = 503  
  def apply(value: String) = try {
    new CardStartDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CardStartDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CardStartDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CardStartDateField]
  }

  def decode(a: Any) : Option[CardStartDateField] = a match {
    case v: String => Some(CardStartDateField(v))
    case v: LocalDate => Some(CardStartDateField(v))
    case v: CardStartDateField => Some(v)
    case _ => scala.Option.empty[CardStartDateField]
  } 
}
