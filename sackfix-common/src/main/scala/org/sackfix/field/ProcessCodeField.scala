package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ProcessCodeField(override val value: String) extends SfFieldString(81, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(81)ProcessCode=(").append(value).append(")").append(ProcessCodeField.fixDescriptionByValue.getOrElse(value,""))
}

object ProcessCodeField {
  val TagId = 81 
  val Regular="0"
  val SoftDollar="1"
  val StepIn="2"
  val StepOut="3"
  val SoftDollarStepIn="4"
  val SoftDollarStepOut="5"
  val PlanSponsor="6"
  lazy val fixDescriptionByValue = Map("0"->"REGULAR","1"->"SOFT_DOLLAR",
    "2"->"STEP_IN","3"->"STEP_OUT","4"->"SOFT_DOLLAR_STEP_IN",
    "5"->"SOFT_DOLLAR_STEP_OUT","6"->"PLAN_SPONSOR")
 
  def decode(a: Option[Any]) : Option[ProcessCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ProcessCodeField]
  }

  def decode(a: Any) : Option[ProcessCodeField] = a match {
    case v: String => Some(ProcessCodeField(v))
    case v: Char => Some(ProcessCodeField(v.toString))
    case v: ProcessCodeField => Some(v)
    case _ => scala.Option.empty[ProcessCodeField]
  } 
}
