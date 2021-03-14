package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class LeavesQtyField(override val value: Float) extends SfFieldFloat(151, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(151)LeavesQty=(").append(value).append(")")
}

object LeavesQtyField {
  val TagId = 151  
  def apply(value: String) = try {
    new LeavesQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LeavesQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LeavesQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LeavesQtyField]
  }

  def decode(a: Any) : Option[LeavesQtyField] = a match {
    case v: String => Some(LeavesQtyField(v))
    case v: Float => Some(LeavesQtyField(v))
    case v: Double => Some(LeavesQtyField(v.toFloat))
    case v: Int => Some(LeavesQtyField(v.toFloat))
    case v: LeavesQtyField => Some(v)
    case _ => scala.Option.empty[LeavesQtyField]
  } 
}
