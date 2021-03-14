package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class MinQtyField(override val value: Float) extends SfFieldFloat(110, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(110)MinQty=(").append(value).append(")")
}

object MinQtyField {
  val TagId = 110  
  def apply(value: String) = try {
    new MinQtyField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MinQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MinQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MinQtyField]
  }

  def decode(a: Any) : Option[MinQtyField] = a match {
    case v: String => Some(MinQtyField(v))
    case v: Float => Some(MinQtyField(v))
    case v: Double => Some(MinQtyField(v.toFloat))
    case v: Int => Some(MinQtyField(v.toFloat))
    case v: MinQtyField => Some(v)
    case _ => scala.Option.empty[MinQtyField]
  } 
}
