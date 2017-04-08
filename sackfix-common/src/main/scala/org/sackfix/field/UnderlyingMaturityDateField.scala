package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingMaturityDateField(override val value: LocalDate) extends SfFieldLocalMktDate(542, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(542)UnderlyingMaturityDate=(").append(value).append(")")
}

object UnderlyingMaturityDateField {
  val TagId = 542  
  def apply(value: String) = try {
    new UnderlyingMaturityDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingMaturityDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingMaturityDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingMaturityDateField]
  }

  def decode(a: Any) : Option[UnderlyingMaturityDateField] = a match {
    case v: String => Some(UnderlyingMaturityDateField(v))
    case v: LocalDate => Some(UnderlyingMaturityDateField(v))
    case v: UnderlyingMaturityDateField => Some(v)
    case _ => scala.Option.empty[UnderlyingMaturityDateField]
  } 
}
