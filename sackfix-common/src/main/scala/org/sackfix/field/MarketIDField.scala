package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class MarketIDField(override val value: String) extends SfFieldString(1301, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1301)MarketID=(").append(value).append(")")
}

object MarketIDField {
  val TagId = 1301  
  def decode(a: Option[Any]) : Option[MarketIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarketIDField]
  }

  def decode(a: Any) : Option[MarketIDField] = a match {
    case v: String => Some(MarketIDField(v))
    case v: MarketIDField => Some(v)
    case _ => scala.Option.empty[MarketIDField]
  } 
}
