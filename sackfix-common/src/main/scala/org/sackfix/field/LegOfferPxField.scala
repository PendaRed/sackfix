package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class LegOfferPxField(override val value: Float) extends SfFieldFloat(684, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(684)LegOfferPx=(").append(value).append(")")
}

object LegOfferPxField {
  val TagId = 684  
  def apply(value: String) = try {
    new LegOfferPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegOfferPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegOfferPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegOfferPxField]
  }

  def decode(a: Any) : Option[LegOfferPxField] = a match {
    case v: String => Some(LegOfferPxField(v))
    case v: Float => Some(LegOfferPxField(v))
    case v: Double => Some(LegOfferPxField(v.toFloat))
    case v: Int => Some(LegOfferPxField(v.toFloat))
    case v: LegOfferPxField => Some(v)
    case _ => scala.Option.empty[LegOfferPxField]
  } 
}
