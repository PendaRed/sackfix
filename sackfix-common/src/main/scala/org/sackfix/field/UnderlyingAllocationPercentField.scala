package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingAllocationPercentField(override val value: Float) extends SfFieldFloat(972, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(972)UnderlyingAllocationPercent=(").append(value).append(")")
}

object UnderlyingAllocationPercentField {
  val TagId = 972  
  def apply(value: String) = try {
    new UnderlyingAllocationPercentField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingAllocationPercent("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingAllocationPercentField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingAllocationPercentField]
  }

  def decode(a: Any) : Option[UnderlyingAllocationPercentField] = a match {
    case v: String => Some(UnderlyingAllocationPercentField(v))
    case v: Float => Some(UnderlyingAllocationPercentField(v))
    case v: Double => Some(UnderlyingAllocationPercentField(v.toFloat))
    case v: Int => Some(UnderlyingAllocationPercentField(v.toFloat))
    case v: UnderlyingAllocationPercentField => Some(v)
    case _ => scala.Option.empty[UnderlyingAllocationPercentField]
  } 
}
