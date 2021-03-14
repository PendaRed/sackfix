package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingIssueDateField(override val value: LocalDate) extends SfFieldLocalMktDate(242, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(242)UnderlyingIssueDate=(").append(value).append(")")
}

object UnderlyingIssueDateField {
  val TagId = 242  
  def apply(value: String) = try {
    new UnderlyingIssueDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingIssueDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingIssueDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingIssueDateField]
  }

  def decode(a: Any) : Option[UnderlyingIssueDateField] = a match {
    case v: String => Some(UnderlyingIssueDateField(v))
    case v: LocalDate => Some(UnderlyingIssueDateField(v))
    case v: UnderlyingIssueDateField => Some(v)
    case _ => scala.Option.empty[UnderlyingIssueDateField]
  } 
}
