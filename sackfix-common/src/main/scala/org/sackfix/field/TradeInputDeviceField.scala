package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class TradeInputDeviceField(override val value: String) extends SfFieldString(579, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(579)TradeInputDevice=(").append(value).append(")")
}

object TradeInputDeviceField {
  val TagId = 579  
  def decode(a: Option[Any]) : Option[TradeInputDeviceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeInputDeviceField]
  }

  def decode(a: Any) : Option[TradeInputDeviceField] = a match {
    case v: String => Some(TradeInputDeviceField(v))
    case v: TradeInputDeviceField => Some(v)
    case _ => scala.Option.empty[TradeInputDeviceField]
  } 
}
