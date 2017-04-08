package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class OrderCapacityField(override val value: String) extends SfFieldString(528, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(528)OrderCapacity=(").append(value).append(")").append(OrderCapacityField.fixDescriptionByValue.getOrElse(value,""))
}

object OrderCapacityField {
  val TagId = 528 
  val Agency="A"
  val Proprietary="G"
  val Individual="I"
  val Principal="P"
  val RisklessPrincipal="R"
  val AgentForOtherMember="W"
  lazy val fixDescriptionByValue = Map("A"->"AGENCY","G"->"PROPRIETARY",
    "I"->"INDIVIDUAL","P"->"PRINCIPAL","R"->"RISKLESS_PRINCIPAL",
    "W"->"AGENT_FOR_OTHER_MEMBER")
 
  def decode(a: Option[Any]) : Option[OrderCapacityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrderCapacityField]
  }

  def decode(a: Any) : Option[OrderCapacityField] = a match {
    case v: String => Some(OrderCapacityField(v))
    case v: Char => Some(OrderCapacityField(v.toString))
    case v: OrderCapacityField => Some(v)
    case _ => scala.Option.empty[OrderCapacityField]
  } 
}