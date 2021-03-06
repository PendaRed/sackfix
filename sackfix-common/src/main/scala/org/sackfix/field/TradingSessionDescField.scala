package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class TradingSessionDescField(override val value: String) extends SfFieldString(1326, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1326)TradingSessionDesc=(").append(value).append(")")
}

object TradingSessionDescField {
  val TagId = 1326  
  def decode(a: Option[Any]) : Option[TradingSessionDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradingSessionDescField]
  }

  def decode(a: Any) : Option[TradingSessionDescField] = a match {
    case v: String => Some(TradingSessionDescField(v))
    case v: TradingSessionDescField => Some(v)
    case _ => scala.Option.empty[TradingSessionDescField]
  } 
}
