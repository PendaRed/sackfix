package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class UnderlyingPriceUnitOfMeasureField(override val value: String) extends SfFieldString(1424, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1424)UnderlyingPriceUnitOfMeasure=(").append(value).append(")")
}

object UnderlyingPriceUnitOfMeasureField {
  val TagId = 1424  
  def decode(a: Option[Any]) : Option[UnderlyingPriceUnitOfMeasureField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingPriceUnitOfMeasureField]
  }

  def decode(a: Any) : Option[UnderlyingPriceUnitOfMeasureField] = a match {
    case v: String => Some(UnderlyingPriceUnitOfMeasureField(v))
    case v: UnderlyingPriceUnitOfMeasureField => Some(v)
    case _ => scala.Option.empty[UnderlyingPriceUnitOfMeasureField]
  } 
}
