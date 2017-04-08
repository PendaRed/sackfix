package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoComplexEventTimesField(override val value: Int) extends SfNumInGroup(1494, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1494)NoComplexEventTimes=(").append(value).append(")")
}

object NoComplexEventTimesField {
  val TagId = 1494  
  def apply(value: String) = try {
    new NoComplexEventTimesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoComplexEventTimes("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoComplexEventTimesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoComplexEventTimesField]
  }

  def decode(a: Any) : Option[NoComplexEventTimesField] = a match {
    case v: String => Some(NoComplexEventTimesField(v))
    case v: Int => Some(NoComplexEventTimesField(v))
    case v: NoComplexEventTimesField => Some(v)
    case _ => scala.Option.empty[NoComplexEventTimesField]
  } 
}
