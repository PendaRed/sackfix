package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegCouponPaymentDateField(override val value: LocalDate) extends SfFieldLocalMktDate(248, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(248)LegCouponPaymentDate=(").append(value).append(")")
}

object LegCouponPaymentDateField {
  val TagId = 248  
  def apply(value: String) = try {
    new LegCouponPaymentDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegCouponPaymentDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegCouponPaymentDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegCouponPaymentDateField]
  }

  def decode(a: Any) : Option[LegCouponPaymentDateField] = a match {
    case v: String => Some(LegCouponPaymentDateField(v))
    case v: LocalDate => Some(LegCouponPaymentDateField(v))
    case v: LegCouponPaymentDateField => Some(v)
    case _ => scala.Option.empty[LegCouponPaymentDateField]
  } 
}
