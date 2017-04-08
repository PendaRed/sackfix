package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegFutSettDateField(override val value: LocalDate) extends SfFieldLocalMktDate(588, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(588)LegFutSettDate=(").append(value).append(")")
}

object LegFutSettDateField {
  val TagId = 588  
  def apply(value: String) = try {
    new LegFutSettDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegFutSettDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegFutSettDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegFutSettDateField]
  }

  def decode(a: Any) : Option[LegFutSettDateField] = a match {
    case v: String => Some(LegFutSettDateField(v))
    case v: LocalDate => Some(LegFutSettDateField(v))
    case v: LegFutSettDateField => Some(v)
    case _ => scala.Option.empty[LegFutSettDateField]
  } 
}
