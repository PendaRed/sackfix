package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class ClearingBusinessDateField(override val value: LocalDate) extends SfFieldLocalMktDate(715, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(715)ClearingBusinessDate=(").append(value).append(")")
}

object ClearingBusinessDateField {
  val TagId = 715  
  def apply(value: String) = try {
    new ClearingBusinessDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ClearingBusinessDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ClearingBusinessDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClearingBusinessDateField]
  }

  def decode(a: Any) : Option[ClearingBusinessDateField] = a match {
    case v: String => Some(ClearingBusinessDateField(v))
    case v: LocalDate => Some(ClearingBusinessDateField(v))
    case v: ClearingBusinessDateField => Some(v)
    case _ => scala.Option.empty[ClearingBusinessDateField]
  } 
}
