package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class StreamAsgnAckTypeField(override val value: Int) extends SfFieldInt(1503, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1503)StreamAsgnAckType=(").append(value).append(")").append(StreamAsgnAckTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object StreamAsgnAckTypeField {
  val TagId = 1503 
  val AssignmentAccepted=0
  val AssignmentRejected=1
  lazy val fixDescriptionByValue = Map(0->"ASSIGNMENT_ACCEPTED",1->"ASSIGNMENT_REJECTED")
 
  def apply(value: String) = try {
    new StreamAsgnAckTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StreamAsgnAckType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StreamAsgnAckTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StreamAsgnAckTypeField]
  }

  def decode(a: Any) : Option[StreamAsgnAckTypeField] = a match {
    case v: String => Some(StreamAsgnAckTypeField(v))
    case v: Int => Some(StreamAsgnAckTypeField(v))
    case v: StreamAsgnAckTypeField => Some(v)
    case _ => scala.Option.empty[StreamAsgnAckTypeField]
  } 
}
