package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class LegFlowScheduleTypeField(override val value: Int) extends SfFieldInt(1440, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1440)LegFlowScheduleType=(").append(value).append(")")
}

object LegFlowScheduleTypeField {
  val TagId = 1440  
  def apply(value: String) = try {
    new LegFlowScheduleTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegFlowScheduleType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegFlowScheduleTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegFlowScheduleTypeField]
  }

  def decode(a: Any) : Option[LegFlowScheduleTypeField] = a match {
    case v: String => Some(LegFlowScheduleTypeField(v))
    case v: Int => Some(LegFlowScheduleTypeField(v))
    case v: LegFlowScheduleTypeField => Some(v)
    case _ => scala.Option.empty[LegFlowScheduleTypeField]
  } 
}
