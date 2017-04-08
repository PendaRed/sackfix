package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class OrderDelayField(override val value: Int) extends SfFieldInt(1428, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1428)OrderDelay=(").append(value).append(")")
}

object OrderDelayField {
  val TagId = 1428  
  def apply(value: String) = try {
    new OrderDelayField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OrderDelay("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OrderDelayField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrderDelayField]
  }

  def decode(a: Any) : Option[OrderDelayField] = a match {
    case v: String => Some(OrderDelayField(v))
    case v: Int => Some(OrderDelayField(v))
    case v: OrderDelayField => Some(v)
    case _ => scala.Option.empty[OrderDelayField]
  } 
}
