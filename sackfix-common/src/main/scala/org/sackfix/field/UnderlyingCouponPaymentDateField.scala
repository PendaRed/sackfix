package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class UnderlyingCouponPaymentDateField(override val value: LocalDate) extends SfFieldLocalMktDate(241, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(241)UnderlyingCouponPaymentDate=(").append(value).append(")")
}

object UnderlyingCouponPaymentDateField {
  val TagId = 241  
  def apply(value: String) = try {
    new UnderlyingCouponPaymentDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingCouponPaymentDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingCouponPaymentDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingCouponPaymentDateField]
  }

  def decode(a: Any) : Option[UnderlyingCouponPaymentDateField] = a match {
    case v: String => Some(UnderlyingCouponPaymentDateField(v))
    case v: LocalDate => Some(UnderlyingCouponPaymentDateField(v))
    case v: UnderlyingCouponPaymentDateField => Some(v)
    case _ => scala.Option.empty[UnderlyingCouponPaymentDateField]
  } 
}
