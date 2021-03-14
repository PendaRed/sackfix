package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class LongQtyField(override val value: Float) extends SfFieldFloat(704, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(704)LongQty=(").append(value).append(")")
}

object LongQtyField {
  val TagId = 704  
  def apply(value: String) = try {
    new LongQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LongQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LongQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LongQtyField]
  }

  def decode(a: Any) : Option[LongQtyField] = a match {
    case v: String => Some(LongQtyField(v))
    case v: Float => Some(LongQtyField(v))
    case v: Double => Some(LongQtyField(v.toFloat))
    case v: Int => Some(LongQtyField(v.toFloat))
    case v: LongQtyField => Some(v)
    case _ => scala.Option.empty[LongQtyField]
  } 
}
