package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class MaxFloorField(override val value: Float) extends SfFieldFloat(111, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(111)MaxFloor=(").append(value).append(")")
}

object MaxFloorField {
  val TagId = 111  
  def apply(value: String) = try {
    new MaxFloorField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaxFloor("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaxFloorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaxFloorField]
  }

  def decode(a: Any) : Option[MaxFloorField] = a match {
    case v: String => Some(MaxFloorField(v))
    case v: Float => Some(MaxFloorField(v))
    case v: Double => Some(MaxFloorField(v.toFloat))
    case v: Int => Some(MaxFloorField(v.toFloat))
    case v: MaxFloorField => Some(v)
    case _ => scala.Option.empty[MaxFloorField]
  } 
}
