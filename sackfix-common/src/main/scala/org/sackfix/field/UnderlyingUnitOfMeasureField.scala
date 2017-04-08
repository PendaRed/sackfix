package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingUnitOfMeasureField(override val value: String) extends SfFieldString(998, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(998)UnderlyingUnitOfMeasure=(").append(value).append(")")
}

object UnderlyingUnitOfMeasureField {
  val TagId = 998  
  def decode(a: Option[Any]) : Option[UnderlyingUnitOfMeasureField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingUnitOfMeasureField]
  }

  def decode(a: Any) : Option[UnderlyingUnitOfMeasureField] = a match {
    case v: String => Some(UnderlyingUnitOfMeasureField(v))
    case v: UnderlyingUnitOfMeasureField => Some(v)
    case _ => scala.Option.empty[UnderlyingUnitOfMeasureField]
  } 
}
