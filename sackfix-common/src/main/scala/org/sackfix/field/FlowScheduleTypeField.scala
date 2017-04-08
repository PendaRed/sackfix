package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class FlowScheduleTypeField(override val value: Int) extends SfFieldInt(1439, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1439)FlowScheduleType=(").append(value).append(")").append(FlowScheduleTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object FlowScheduleTypeField {
  val TagId = 1439 
  val NercEasternOffPeak=0
  val NercWesternOffPeak=1
  val NercCalendarAllDaysInMonth=2
  val NercEasternPeak=3
  val NercWesternPeak=4
  lazy val fixDescriptionByValue = Map(0->"NERC_EASTERN_OFF_PEAK",1->"NERC_WESTERN_OFF_PEAK",
    2->"NERC_CALENDAR_ALL_DAYS_IN_MONTH",3->"NERC_EASTERN_PEAK",4->"NERC_WESTERN_PEAK")
 
  def apply(value: String) = try {
    new FlowScheduleTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new FlowScheduleType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[FlowScheduleTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FlowScheduleTypeField]
  }

  def decode(a: Any) : Option[FlowScheduleTypeField] = a match {
    case v: String => Some(FlowScheduleTypeField(v))
    case v: Int => Some(FlowScheduleTypeField(v))
    case v: FlowScheduleTypeField => Some(v)
    case _ => scala.Option.empty[FlowScheduleTypeField]
  } 
}