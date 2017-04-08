package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class BidSwapPointsField(override val value: Float) extends SfFieldFloat(1065, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1065)BidSwapPoints=(").append(value).append(")")
}

object BidSwapPointsField {
  val TagId = 1065  
  def apply(value: String) = try {
    new BidSwapPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BidSwapPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BidSwapPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BidSwapPointsField]
  }

  def decode(a: Any) : Option[BidSwapPointsField] = a match {
    case v: String => Some(BidSwapPointsField(v))
    case v: Float => Some(BidSwapPointsField(v))
    case v: Double => Some(BidSwapPointsField(v.toFloat))
    case v: Int => Some(BidSwapPointsField(v.toFloat))
    case v: BidSwapPointsField => Some(v)
    case _ => scala.Option.empty[BidSwapPointsField]
  } 
}
