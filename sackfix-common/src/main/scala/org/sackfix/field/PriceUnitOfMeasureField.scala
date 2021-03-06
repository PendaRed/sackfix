package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class PriceUnitOfMeasureField(override val value: String) extends SfFieldString(1191, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1191)PriceUnitOfMeasure=(").append(value).append(")")
}

object PriceUnitOfMeasureField {
  val TagId = 1191  
  def decode(a: Option[Any]) : Option[PriceUnitOfMeasureField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriceUnitOfMeasureField]
  }

  def decode(a: Any) : Option[PriceUnitOfMeasureField] = a match {
    case v: String => Some(PriceUnitOfMeasureField(v))
    case v: PriceUnitOfMeasureField => Some(v)
    case _ => scala.Option.empty[PriceUnitOfMeasureField]
  } 
}
