package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class OfferSizeIntField(override val value: Int) extends SfFieldInt(135, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(135)OfferSizeInt=(").append(value).append(")")
}

object OfferSizeIntField {
  val TagId = 135  
  def apply(value: String) = try {
    new OfferSizeIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OfferSizeInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OfferSizeIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OfferSizeIntField]
  }

  def decode(a: Any) : Option[OfferSizeIntField] = a match {
    case v: String => Some(OfferSizeIntField(v))
    case v: Int => Some(OfferSizeIntField(v))
    case v: OfferSizeIntField => Some(v)
    case _ => scala.Option.empty[OfferSizeIntField]
  } 
}
