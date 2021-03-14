package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class MarketSegmentIDField(override val value: String) extends SfFieldString(1300, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1300)MarketSegmentID=(").append(value).append(")")
}

object MarketSegmentIDField {
  val TagId = 1300  
  def decode(a: Option[Any]) : Option[MarketSegmentIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarketSegmentIDField]
  }

  def decode(a: Any) : Option[MarketSegmentIDField] = a match {
    case v: String => Some(MarketSegmentIDField(v))
    case v: MarketSegmentIDField => Some(v)
    case _ => scala.Option.empty[MarketSegmentIDField]
  } 
}
