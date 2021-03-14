package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class MinOfferSizeField(override val value: Float) extends SfFieldFloat(648, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(648)MinOfferSize=(").append(value).append(")")
}

object MinOfferSizeField {
  val TagId = 648  
  def apply(value: String) = try {
    new MinOfferSizeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MinOfferSize("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MinOfferSizeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MinOfferSizeField]
  }

  def decode(a: Any) : Option[MinOfferSizeField] = a match {
    case v: String => Some(MinOfferSizeField(v))
    case v: Float => Some(MinOfferSizeField(v))
    case v: Double => Some(MinOfferSizeField(v.toFloat))
    case v: Int => Some(MinOfferSizeField(v.toFloat))
    case v: MinOfferSizeField => Some(v)
    case _ => scala.Option.empty[MinOfferSizeField]
  } 
}
