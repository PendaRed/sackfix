package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegPriceUnitOfMeasureField(override val value: String) extends SfFieldString(1421, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1421)LegPriceUnitOfMeasure=(").append(value).append(")")
}

object LegPriceUnitOfMeasureField {
  val TagId = 1421  
  def decode(a: Option[Any]) : Option[LegPriceUnitOfMeasureField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegPriceUnitOfMeasureField]
  }

  def decode(a: Any) : Option[LegPriceUnitOfMeasureField] = a match {
    case v: String => Some(LegPriceUnitOfMeasureField(v))
    case v: LegPriceUnitOfMeasureField => Some(v)
    case _ => scala.Option.empty[LegPriceUnitOfMeasureField]
  } 
}
