package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class TickRuleTypeField(override val value: Int) extends SfFieldInt(1209, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1209)TickRuleType=(").append(value).append(")").append(TickRuleTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TickRuleTypeField {
  val TagId = 1209 
  val Regular=0
  val Variable=1
  val Fixed=2
  val TradedAsASpreadLeg=3
  val SettledAsASpreadLeg=4
  lazy val fixDescriptionByValue = Map(0->"REGULAR",1->"VARIABLE",
    2->"FIXED",3->"TRADED_AS_A_SPREAD_LEG",4->"SETTLED_AS_A_SPREAD_LEG")
 
  def apply(value: String) = try {
    new TickRuleTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TickRuleType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TickRuleTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TickRuleTypeField]
  }

  def decode(a: Any) : Option[TickRuleTypeField] = a match {
    case v: String => Some(TickRuleTypeField(v))
    case v: Int => Some(TickRuleTypeField(v))
    case v: TickRuleTypeField => Some(v)
    case _ => scala.Option.empty[TickRuleTypeField]
  } 
}
