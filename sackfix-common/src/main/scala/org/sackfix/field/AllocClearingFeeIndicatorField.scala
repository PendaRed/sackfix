package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocClearingFeeIndicatorField(override val value: String) extends SfFieldString(1136, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1136)AllocClearingFeeIndicator=(").append(value).append(")")
}

object AllocClearingFeeIndicatorField {
  val TagId = 1136  
  def decode(a: Option[Any]) : Option[AllocClearingFeeIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocClearingFeeIndicatorField]
  }

  def decode(a: Any) : Option[AllocClearingFeeIndicatorField] = a match {
    case v: String => Some(AllocClearingFeeIndicatorField(v))
    case v: AllocClearingFeeIndicatorField => Some(v)
    case _ => scala.Option.empty[AllocClearingFeeIndicatorField]
  } 
}
