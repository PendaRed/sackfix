package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class StrikeIncrementField(override val value: Float) extends SfFieldFloat(1204, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1204)StrikeIncrement=(").append(value).append(")")
}

object StrikeIncrementField {
  val TagId = 1204  
  def apply(value: String) = try {
    new StrikeIncrementField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StrikeIncrement("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StrikeIncrementField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrikeIncrementField]
  }

  def decode(a: Any) : Option[StrikeIncrementField] = a match {
    case v: String => Some(StrikeIncrementField(v))
    case v: Float => Some(StrikeIncrementField(v))
    case v: Double => Some(StrikeIncrementField(v.toFloat))
    case v: Int => Some(StrikeIncrementField(v.toFloat))
    case v: StrikeIncrementField => Some(v)
    case _ => scala.Option.empty[StrikeIncrementField]
  } 
}