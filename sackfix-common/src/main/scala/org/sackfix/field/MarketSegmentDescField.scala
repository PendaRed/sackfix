package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class MarketSegmentDescField(override val value: String) extends SfFieldString(1396, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1396)MarketSegmentDesc=(").append(value).append(")")
}

object MarketSegmentDescField {
  val TagId = 1396  
  def decode(a: Option[Any]) : Option[MarketSegmentDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarketSegmentDescField]
  }

  def decode(a: Any) : Option[MarketSegmentDescField] = a match {
    case v: String => Some(MarketSegmentDescField(v))
    case v: MarketSegmentDescField => Some(v)
    case _ => scala.Option.empty[MarketSegmentDescField]
  } 
}
