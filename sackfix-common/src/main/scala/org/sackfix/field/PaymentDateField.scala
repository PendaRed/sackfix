package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170521
  */
case class PaymentDateField(override val value: LocalDate) extends SfFieldLocalMktDate(504, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(504)PaymentDate=(").append(value).append(")")
}

object PaymentDateField {
  val TagId = 504  
  def apply(value: String) = try {
    new PaymentDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PaymentDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PaymentDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PaymentDateField]
  }

  def decode(a: Any) : Option[PaymentDateField] = a match {
    case v: String => Some(PaymentDateField(v))
    case v: LocalDate => Some(PaymentDateField(v))
    case v: PaymentDateField => Some(v)
    case _ => scala.Option.empty[PaymentDateField]
  } 
}
