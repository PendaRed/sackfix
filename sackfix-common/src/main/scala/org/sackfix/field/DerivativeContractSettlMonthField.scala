package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldMonthYear
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class DerivativeContractSettlMonthField(override val value: LocalDate) extends SfFieldMonthYear(1285, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1285)DerivativeContractSettlMonth=(").append(value).append(")")
}

object DerivativeContractSettlMonthField {
  val TagId = 1285  
  def apply(value: String) = try {
    new DerivativeContractSettlMonthField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeContractSettlMonth("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeContractSettlMonthField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeContractSettlMonthField]
  }

  def decode(a: Any) : Option[DerivativeContractSettlMonthField] = a match {
    case v: String => Some(DerivativeContractSettlMonthField(v))
    case v: LocalDate => Some(DerivativeContractSettlMonthField(v))
    case v: DerivativeContractSettlMonthField => Some(v)
    case _ => scala.Option.empty[DerivativeContractSettlMonthField]
  } 
}
