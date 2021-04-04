package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class MinBidSizeField(override val value: Float) extends SfFieldFloat(647, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(647)MinBidSize=(").append(value).append(")")
}

object MinBidSizeField {
  val TagId = 647  
  def apply(value: String) = try {
    new MinBidSizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MinBidSize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MinBidSizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MinBidSizeField]
  }

  def decode(a: Any) : Option[MinBidSizeField] = a match {
    case v: String => Some(MinBidSizeField(v))
    case v: Float => Some(MinBidSizeField(v))
    case v: Double => Some(MinBidSizeField(v.toFloat))
    case v: Int => Some(MinBidSizeField(v.toFloat))
    case v: MinBidSizeField => Some(v)
    case _ => scala.Option.empty[MinBidSizeField]
  } 
}
