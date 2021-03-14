package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class OfferForwardPoints2Field(override val value: Float) extends SfFieldFloat(643, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(643)OfferForwardPoints2=(").append(value).append(")")
}

object OfferForwardPoints2Field {
  val TagId = 643  
  def apply(value: String) = try {
    new OfferForwardPoints2Field(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OfferForwardPoints2("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OfferForwardPoints2Field] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OfferForwardPoints2Field]
  }

  def decode(a: Any) : Option[OfferForwardPoints2Field] = a match {
    case v: String => Some(OfferForwardPoints2Field(v))
    case v: Float => Some(OfferForwardPoints2Field(v))
    case v: Double => Some(OfferForwardPoints2Field(v.toFloat))
    case v: Int => Some(OfferForwardPoints2Field(v.toFloat))
    case v: OfferForwardPoints2Field => Some(v)
    case _ => scala.Option.empty[OfferForwardPoints2Field]
  } 
}
