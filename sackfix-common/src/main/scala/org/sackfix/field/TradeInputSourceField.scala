package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TradeInputSourceField(override val value: String) extends SfFieldString(578, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(578)TradeInputSource=(").append(value).append(")")
}

object TradeInputSourceField {
  val TagId = 578  
  def decode(a: Option[Any]) : Option[TradeInputSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeInputSourceField]
  }

  def decode(a: Any) : Option[TradeInputSourceField] = a match {
    case v: String => Some(TradeInputSourceField(v))
    case v: TradeInputSourceField => Some(v)
    case _ => scala.Option.empty[TradeInputSourceField]
  } 
}
