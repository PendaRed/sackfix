package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20170521
  */
case class SpotValueDateForNDFField(override val value: LocalDate) extends SfFieldLocalMktDate(9995, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(9995)SpotValueDateForNDF=(").append(value).append(")")
}

object SpotValueDateForNDFField {
  val TagId = 9995  
  def apply(value: String) = try {
    new SpotValueDateForNDFField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SpotValueDateForNDF("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SpotValueDateForNDFField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SpotValueDateForNDFField]
  }

  def decode(a: Any) : Option[SpotValueDateForNDFField] = a match {
    case v: String => Some(SpotValueDateForNDFField(v))
    case v: LocalDate => Some(SpotValueDateForNDFField(v))
    case v: SpotValueDateForNDFField => Some(v)
    case _ => scala.Option.empty[SpotValueDateForNDFField]
  } 
}
