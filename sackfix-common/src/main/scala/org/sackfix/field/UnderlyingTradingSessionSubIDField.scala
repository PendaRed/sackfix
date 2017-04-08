package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingTradingSessionSubIDField(override val value: String) extends SfFieldString(823, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(823)UnderlyingTradingSessionSubID=(").append(value).append(")")
}

object UnderlyingTradingSessionSubIDField {
  val TagId = 823  
  def decode(a: Option[Any]) : Option[UnderlyingTradingSessionSubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingTradingSessionSubIDField]
  }

  def decode(a: Any) : Option[UnderlyingTradingSessionSubIDField] = a match {
    case v: String => Some(UnderlyingTradingSessionSubIDField(v))
    case v: UnderlyingTradingSessionSubIDField => Some(v)
    case _ => scala.Option.empty[UnderlyingTradingSessionSubIDField]
  } 
}
