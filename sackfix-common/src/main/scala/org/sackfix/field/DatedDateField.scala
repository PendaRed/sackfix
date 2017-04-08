package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class DatedDateField(override val value: LocalDate) extends SfFieldLocalMktDate(873, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(873)DatedDate=(").append(value).append(")")
}

object DatedDateField {
  val TagId = 873  
  def apply(value: String) = try {
    new DatedDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DatedDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DatedDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DatedDateField]
  }

  def decode(a: Any) : Option[DatedDateField] = a match {
    case v: String => Some(DatedDateField(v))
    case v: LocalDate => Some(DatedDateField(v))
    case v: DatedDateField => Some(v)
    case _ => scala.Option.empty[DatedDateField]
  } 
}