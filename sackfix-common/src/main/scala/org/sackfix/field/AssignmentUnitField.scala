package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class AssignmentUnitField(override val value: Float) extends SfFieldFloat(745, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(745)AssignmentUnit=(").append(value).append(")")
}

object AssignmentUnitField {
  val TagId = 745  
  def apply(value: String) = try {
    new AssignmentUnitField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AssignmentUnit("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AssignmentUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AssignmentUnitField]
  }

  def decode(a: Any) : Option[AssignmentUnitField] = a match {
    case v: String => Some(AssignmentUnitField(v))
    case v: Float => Some(AssignmentUnitField(v))
    case v: Double => Some(AssignmentUnitField(v.toFloat))
    case v: Int => Some(AssignmentUnitField(v.toFloat))
    case v: AssignmentUnitField => Some(v)
    case _ => scala.Option.empty[AssignmentUnitField]
  } 
}
