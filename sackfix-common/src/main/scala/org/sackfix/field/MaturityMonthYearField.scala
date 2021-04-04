package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldMonthYear
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class MaturityMonthYearField(override val value: LocalDate) extends SfFieldMonthYear(200, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(200)MaturityMonthYear=(").append(value).append(")")
}

object MaturityMonthYearField {
  val TagId = 200  
  def apply(value: String) = try {
    new MaturityMonthYearField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaturityMonthYear("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaturityMonthYearField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaturityMonthYearField]
  }

  def decode(a: Any) : Option[MaturityMonthYearField] = a match {
    case v: String => Some(MaturityMonthYearField(v))
    case v: LocalDate => Some(MaturityMonthYearField(v))
    case v: MaturityMonthYearField => Some(v)
    case _ => scala.Option.empty[MaturityMonthYearField]
  } 
}
