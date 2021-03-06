package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class MarketReqIDField(override val value: String) extends SfFieldString(1393, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1393)MarketReqID=(").append(value).append(")")
}

object MarketReqIDField {
  val TagId = 1393  
  def decode(a: Option[Any]) : Option[MarketReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarketReqIDField]
  }

  def decode(a: Any) : Option[MarketReqIDField] = a match {
    case v: String => Some(MarketReqIDField(v))
    case v: MarketReqIDField => Some(v)
    case _ => scala.Option.empty[MarketReqIDField]
  } 
}
