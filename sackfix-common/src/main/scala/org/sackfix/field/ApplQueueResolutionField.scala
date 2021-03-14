package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class ApplQueueResolutionField(override val value: Int) extends SfFieldInt(814, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(814)ApplQueueResolution=(").append(value).append(")").append(ApplQueueResolutionField.fixDescriptionByValue.getOrElse(value,""))
}

object ApplQueueResolutionField {
  val TagId = 814 
  val NoActionTaken=0
  val QueueFlushed=1
  val OverlayLast=2
  val EndSession=3
  lazy val fixDescriptionByValue = Map(0->"NO_ACTION_TAKEN",1->"QUEUE_FLUSHED",
    2->"OVERLAY_LAST",3->"END_SESSION")
 
  def apply(value: String) = try {
    new ApplQueueResolutionField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplQueueResolution("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplQueueResolutionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplQueueResolutionField]
  }

  def decode(a: Any) : Option[ApplQueueResolutionField] = a match {
    case v: String => Some(ApplQueueResolutionField(v))
    case v: Int => Some(ApplQueueResolutionField(v))
    case v: ApplQueueResolutionField => Some(v)
    case _ => scala.Option.empty[ApplQueueResolutionField]
  } 
}
