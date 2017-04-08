package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class BidSizeField(override val value: Float) extends SfFieldFloat(134, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(134)BidSize=(").append(value).append(")")
}

object BidSizeField {
  val TagId = 134  
  def apply(value: String) = try {
    new BidSizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BidSize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BidSizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidSizeField]
  }

  def decode(a: Any) : Option[BidSizeField] = a match {
    case v: String => Some(BidSizeField(v))
    case v: Float => Some(BidSizeField(v))
    case v: Double => Some(BidSizeField(v.toFloat))
    case v: Int => Some(BidSizeField(v.toFloat))
    case v: BidSizeField => Some(v)
    case _ => scala.Option.empty[BidSizeField]
  } 
}
