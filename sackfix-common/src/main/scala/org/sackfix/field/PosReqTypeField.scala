package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class PosReqTypeField(override val value: Int) extends SfFieldInt(724, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(724)PosReqType=(").append(value).append(")").append(PosReqTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PosReqTypeField {
  val TagId = 724 
  val Positions=0
  val Trades=1
  val Exercises=2
  val Assignments=3
  val SettlementActivity=4
  val BackoutMessage=5
  lazy val fixDescriptionByValue = Map(0->"POSITIONS",1->"TRADES",
    2->"EXERCISES",3->"ASSIGNMENTS",4->"SETTLEMENT_ACTIVITY",
    5->"BACKOUT_MESSAGE")
 
  def apply(value: String) = try {
    new PosReqTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PosReqType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PosReqTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosReqTypeField]
  }

  def decode(a: Any) : Option[PosReqTypeField] = a match {
    case v: String => Some(PosReqTypeField(v))
    case v: Int => Some(PosReqTypeField(v))
    case v: PosReqTypeField => Some(v)
    case _ => scala.Option.empty[PosReqTypeField]
  } 
}
