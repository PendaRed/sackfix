package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class DerivativePriceUnitOfMeasureField(override val value: String) extends SfFieldString(1315, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1315)DerivativePriceUnitOfMeasure=(").append(value).append(")")
}

object DerivativePriceUnitOfMeasureField {
  val TagId = 1315  
  def decode(a: Option[Any]) : Option[DerivativePriceUnitOfMeasureField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativePriceUnitOfMeasureField]
  }

  def decode(a: Any) : Option[DerivativePriceUnitOfMeasureField] = a match {
    case v: String => Some(DerivativePriceUnitOfMeasureField(v))
    case v: DerivativePriceUnitOfMeasureField => Some(v)
    case _ => scala.Option.empty[DerivativePriceUnitOfMeasureField]
  } 
}
