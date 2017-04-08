package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldMonthYear
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeMaturityMonthYearField(override val value: LocalDate) extends SfFieldMonthYear(1251, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1251)DerivativeMaturityMonthYear=(").append(value).append(")")
}

object DerivativeMaturityMonthYearField {
  val TagId = 1251  
  def apply(value: String) = try {
    new DerivativeMaturityMonthYearField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeMaturityMonthYear("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeMaturityMonthYearField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeMaturityMonthYearField]
  }

  def decode(a: Any) : Option[DerivativeMaturityMonthYearField] = a match {
    case v: String => Some(DerivativeMaturityMonthYearField(v))
    case v: LocalDate => Some(DerivativeMaturityMonthYearField(v))
    case v: DerivativeMaturityMonthYearField => Some(v)
    case _ => scala.Option.empty[DerivativeMaturityMonthYearField]
  } 
}
