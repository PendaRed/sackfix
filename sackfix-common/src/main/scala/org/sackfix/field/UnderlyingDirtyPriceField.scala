package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingDirtyPriceField(override val value: Float) extends SfFieldFloat(882, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(882)UnderlyingDirtyPrice=(").append(value).append(")")
}

object UnderlyingDirtyPriceField {
  val TagId = 882  
  def apply(value: String) = try {
    new UnderlyingDirtyPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingDirtyPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingDirtyPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingDirtyPriceField]
  }

  def decode(a: Any) : Option[UnderlyingDirtyPriceField] = a match {
    case v: String => Some(UnderlyingDirtyPriceField(v))
    case v: Float => Some(UnderlyingDirtyPriceField(v))
    case v: Double => Some(UnderlyingDirtyPriceField(v.toFloat))
    case v: Int => Some(UnderlyingDirtyPriceField(v.toFloat))
    case v: UnderlyingDirtyPriceField => Some(v)
    case _ => scala.Option.empty[UnderlyingDirtyPriceField]
  } 
}
