package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoClearingInstructionsField(override val value: Int) extends SfNumInGroup(576, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(576)NoClearingInstructions=(").append(value).append(")")
}

object NoClearingInstructionsField {
  val TagId = 576  
  def apply(value: String) = try {
    new NoClearingInstructionsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoClearingInstructions("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoClearingInstructionsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoClearingInstructionsField]
  }

  def decode(a: Any) : Option[NoClearingInstructionsField] = a match {
    case v: String => Some(NoClearingInstructionsField(v))
    case v: Int => Some(NoClearingInstructionsField(v))
    case v: NoClearingInstructionsField => Some(v)
    case _ => scala.Option.empty[NoClearingInstructionsField]
  } 
}
