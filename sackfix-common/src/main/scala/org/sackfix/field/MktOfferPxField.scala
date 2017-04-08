package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class MktOfferPxField(override val value: Float) extends SfFieldFloat(646, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(646)MktOfferPx=(").append(value).append(")")
}

object MktOfferPxField {
  val TagId = 646  
  def apply(value: String) = try {
    new MktOfferPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MktOfferPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MktOfferPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MktOfferPxField]
  }

  def decode(a: Any) : Option[MktOfferPxField] = a match {
    case v: String => Some(MktOfferPxField(v))
    case v: Float => Some(MktOfferPxField(v))
    case v: Double => Some(MktOfferPxField(v.toFloat))
    case v: Int => Some(MktOfferPxField(v.toFloat))
    case v: MktOfferPxField => Some(v)
    case _ => scala.Option.empty[MktOfferPxField]
  } 
}
