package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class AllocQtyField(override val value: Float) extends SfFieldFloat(80, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(80)AllocQty=(").append(value).append(")")
}

object AllocQtyField {
  val TagId = 80  
  def apply(value: String) = try {
    new AllocQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocQtyField]
  }

  def decode(a: Any) : Option[AllocQtyField] = a match {
    case v: String => Some(AllocQtyField(v))
    case v: Float => Some(AllocQtyField(v))
    case v: Double => Some(AllocQtyField(v.toFloat))
    case v: Int => Some(AllocQtyField(v.toFloat))
    case v: AllocQtyField => Some(v)
    case _ => scala.Option.empty[AllocQtyField]
  } 
}
