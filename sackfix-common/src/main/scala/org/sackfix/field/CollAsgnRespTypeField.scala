package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class CollAsgnRespTypeField(override val value: Int) extends SfFieldInt(905, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(905)CollAsgnRespType=(").append(value).append(")").append(CollAsgnRespTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object CollAsgnRespTypeField {
  val TagId = 905 
  val Received=0
  val Accepted=1
  val Declined=2
  val Rejected=3
  lazy val fixDescriptionByValue = Map(0->"RECEIVED",1->"ACCEPTED",
    2->"DECLINED",3->"REJECTED")
 
  def apply(value: String) = try {
    new CollAsgnRespTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CollAsgnRespType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CollAsgnRespTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollAsgnRespTypeField]
  }

  def decode(a: Any) : Option[CollAsgnRespTypeField] = a match {
    case v: String => Some(CollAsgnRespTypeField(v))
    case v: Int => Some(CollAsgnRespTypeField(v))
    case v: CollAsgnRespTypeField => Some(v)
    case _ => scala.Option.empty[CollAsgnRespTypeField]
  } 
}
