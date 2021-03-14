package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegStipulationValueField(override val value: String) extends SfFieldString(689, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(689)LegStipulationValue=(").append(value).append(")")
}

object LegStipulationValueField {
  val TagId = 689  
  def decode(a: Option[Any]) : Option[LegStipulationValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegStipulationValueField]
  }

  def decode(a: Any) : Option[LegStipulationValueField] = a match {
    case v: String => Some(LegStipulationValueField(v))
    case v: LegStipulationValueField => Some(v)
    case _ => scala.Option.empty[LegStipulationValueField]
  } 
}
