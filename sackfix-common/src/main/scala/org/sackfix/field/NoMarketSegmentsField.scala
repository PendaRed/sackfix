package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoMarketSegmentsField(override val value: Int) extends SfNumInGroup(1310, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1310)NoMarketSegments=(").append(value).append(")")
}

object NoMarketSegmentsField {
  val TagId = 1310  
  def apply(value: String) = try {
    new NoMarketSegmentsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoMarketSegments("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoMarketSegmentsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoMarketSegmentsField]
  }

  def decode(a: Any) : Option[NoMarketSegmentsField] = a match {
    case v: String => Some(NoMarketSegmentsField(v))
    case v: Int => Some(NoMarketSegmentsField(v))
    case v: NoMarketSegmentsField => Some(v)
    case _ => scala.Option.empty[NoMarketSegmentsField]
  } 
}
