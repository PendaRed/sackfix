package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class OrderQtyIntField(override val value: Int) extends SfFieldInt(38, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(38)OrderQtyInt=(").append(value).append(")")
}

object OrderQtyIntField {
  val TagId = 38  
  def apply(value: String) = try {
    new OrderQtyIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OrderQtyInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OrderQtyIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrderQtyIntField]
  }

  def decode(a: Any) : Option[OrderQtyIntField] = a match {
    case v: String => Some(OrderQtyIntField(v))
    case v: Int => Some(OrderQtyIntField(v))
    case v: OrderQtyIntField => Some(v)
    case _ => scala.Option.empty[OrderQtyIntField]
  } 
}
