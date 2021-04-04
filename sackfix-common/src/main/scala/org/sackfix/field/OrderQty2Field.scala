package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class OrderQty2Field(override val value: Float) extends SfFieldFloat(192, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(192)OrderQty2=(").append(value).append(")")
}

object OrderQty2Field {
  val TagId = 192  
  def apply(value: String) = try {
    new OrderQty2Field(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OrderQty2("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OrderQty2Field] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrderQty2Field]
  }

  def decode(a: Any) : Option[OrderQty2Field] = a match {
    case v: String => Some(OrderQty2Field(v))
    case v: Float => Some(OrderQty2Field(v))
    case v: Double => Some(OrderQty2Field(v.toFloat))
    case v: Int => Some(OrderQty2Field(v.toFloat))
    case v: OrderQty2Field => Some(v)
    case _ => scala.Option.empty[OrderQty2Field]
  } 
}
