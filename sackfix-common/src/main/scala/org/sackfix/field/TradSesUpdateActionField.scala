package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class TradSesUpdateActionField(override val value: String) extends SfFieldString(1327, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1327)TradSesUpdateAction=(").append(value).append(")")
}

object TradSesUpdateActionField {
  val TagId = 1327  
  def decode(a: Option[Any]) : Option[TradSesUpdateActionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradSesUpdateActionField]
  }

  def decode(a: Any) : Option[TradSesUpdateActionField] = a match {
    case v: String => Some(TradSesUpdateActionField(v))
    case v: Char => Some(TradSesUpdateActionField(v.toString))
    case v: TradSesUpdateActionField => Some(v)
    case _ => scala.Option.empty[TradSesUpdateActionField]
  } 
}
