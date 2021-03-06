package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class CouponPaymentDateField(override val value: LocalDate) extends SfFieldLocalMktDate(224, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(224)CouponPaymentDate=(").append(value).append(")")
}

object CouponPaymentDateField {
  val TagId = 224  
  def apply(value: String) = try {
    new CouponPaymentDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CouponPaymentDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CouponPaymentDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CouponPaymentDateField]
  }

  def decode(a: Any) : Option[CouponPaymentDateField] = a match {
    case v: String => Some(CouponPaymentDateField(v))
    case v: LocalDate => Some(CouponPaymentDateField(v))
    case v: CouponPaymentDateField => Some(v)
    case _ => scala.Option.empty[CouponPaymentDateField]
  } 
}
