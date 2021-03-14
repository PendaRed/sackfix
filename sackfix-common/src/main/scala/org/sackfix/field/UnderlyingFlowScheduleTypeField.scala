package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingFlowScheduleTypeField(override val value: Int) extends SfFieldInt(1441, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1441)UnderlyingFlowScheduleType=(").append(value).append(")")
}

object UnderlyingFlowScheduleTypeField {
  val TagId = 1441  
  def apply(value: String) = try {
    new UnderlyingFlowScheduleTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingFlowScheduleType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingFlowScheduleTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingFlowScheduleTypeField]
  }

  def decode(a: Any) : Option[UnderlyingFlowScheduleTypeField] = a match {
    case v: String => Some(UnderlyingFlowScheduleTypeField(v))
    case v: Int => Some(UnderlyingFlowScheduleTypeField(v))
    case v: UnderlyingFlowScheduleTypeField => Some(v)
    case _ => scala.Option.empty[UnderlyingFlowScheduleTypeField]
  } 
}
