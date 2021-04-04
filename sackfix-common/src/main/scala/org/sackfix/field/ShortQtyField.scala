package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class ShortQtyField(override val value: Float) extends SfFieldFloat(705, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(705)ShortQty=(").append(value).append(")")
}

object ShortQtyField {
  val TagId = 705  
  def apply(value: String) = try {
    new ShortQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ShortQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ShortQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ShortQtyField]
  }

  def decode(a: Any) : Option[ShortQtyField] = a match {
    case v: String => Some(ShortQtyField(v))
    case v: Float => Some(ShortQtyField(v))
    case v: Double => Some(ShortQtyField(v.toFloat))
    case v: Int => Some(ShortQtyField(v.toFloat))
    case v: ShortQtyField => Some(v)
    case _ => scala.Option.empty[ShortQtyField]
  } 
}
