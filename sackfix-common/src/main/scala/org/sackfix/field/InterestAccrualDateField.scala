package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170521
  */
case class InterestAccrualDateField(override val value: LocalDate) extends SfFieldLocalMktDate(874, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(874)InterestAccrualDate=(").append(value).append(")")
}

object InterestAccrualDateField {
  val TagId = 874  
  def apply(value: String) = try {
    new InterestAccrualDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new InterestAccrualDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[InterestAccrualDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InterestAccrualDateField]
  }

  def decode(a: Any) : Option[InterestAccrualDateField] = a match {
    case v: String => Some(InterestAccrualDateField(v))
    case v: LocalDate => Some(InterestAccrualDateField(v))
    case v: InterestAccrualDateField => Some(v)
    case _ => scala.Option.empty[InterestAccrualDateField]
  } 
}
