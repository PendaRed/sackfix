package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170521
  */
case class AgreementDateField(override val value: LocalDate) extends SfFieldLocalMktDate(915, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(915)AgreementDate=(").append(value).append(")")
}

object AgreementDateField {
  val TagId = 915  
  def apply(value: String) = try {
    new AgreementDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AgreementDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AgreementDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AgreementDateField]
  }

  def decode(a: Any) : Option[AgreementDateField] = a match {
    case v: String => Some(AgreementDateField(v))
    case v: LocalDate => Some(AgreementDateField(v))
    case v: AgreementDateField => Some(v)
    case _ => scala.Option.empty[AgreementDateField]
  } 
}
