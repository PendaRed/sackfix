package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20210314
  */
case class YieldRedemptionDateField(override val value: LocalDate) extends SfFieldLocalMktDate(696, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(696)YieldRedemptionDate=(").append(value).append(")")
}

object YieldRedemptionDateField {
  val TagId = 696  
  def apply(value: String) = try {
    new YieldRedemptionDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new YieldRedemptionDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[YieldRedemptionDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[YieldRedemptionDateField]
  }

  def decode(a: Any) : Option[YieldRedemptionDateField] = a match {
    case v: String => Some(YieldRedemptionDateField(v))
    case v: LocalDate => Some(YieldRedemptionDateField(v))
    case v: YieldRedemptionDateField => Some(v)
    case _ => scala.Option.empty[YieldRedemptionDateField]
  } 
}
