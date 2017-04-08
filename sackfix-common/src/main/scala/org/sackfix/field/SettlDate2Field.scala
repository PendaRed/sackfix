package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170404
  */
case class SettlDate2Field(override val value: LocalDate) extends SfFieldLocalMktDate(193, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(193)SettlDate2=(").append(value).append(")")
}

object SettlDate2Field {
  val TagId = 193  
  def apply(value: String) = try {
    new SettlDate2Field(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlDate2("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlDate2Field] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlDate2Field]
  }

  def decode(a: Any) : Option[SettlDate2Field] = a match {
    case v: String => Some(SettlDate2Field(v))
    case v: LocalDate => Some(SettlDate2Field(v))
    case v: SettlDate2Field => Some(v)
    case _ => scala.Option.empty[SettlDate2Field]
  } 
}
