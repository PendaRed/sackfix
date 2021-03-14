package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class SecDefStatusField(override val value: Int) extends SfFieldInt(653, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(653)SecDefStatus=(").append(value).append(")").append(SecDefStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object SecDefStatusField {
  val TagId = 653 
  val PendingApproval=0
  val Approved=1
  val Rejected=2
  val UnauthorizedRequest=3
  val InvalidDefinitionRequest=4
  lazy val fixDescriptionByValue = Map(0->"PENDING_APPROVAL",1->"APPROVED",
    2->"REJECTED",3->"UNAUTHORIZED_REQUEST",4->"INVALID_DEFINITION_REQUEST")
 
  def apply(value: String) = try {
    new SecDefStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecDefStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecDefStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecDefStatusField]
  }

  def decode(a: Any) : Option[SecDefStatusField] = a match {
    case v: String => Some(SecDefStatusField(v))
    case v: Int => Some(SecDefStatusField(v))
    case v: SecDefStatusField => Some(v)
    case _ => scala.Option.empty[SecDefStatusField]
  } 
}
