package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlObligSourceField(override val value: String) extends SfFieldString(1164, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1164)SettlObligSource=(").append(value).append(")").append(SettlObligSourceField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlObligSourceField {
  val TagId = 1164 
  val InstructionsOfBroker="1"
  val InstructionsForInstitution="2"
  val Investor="3"
  lazy val fixDescriptionByValue = Map("1"->"INSTRUCTIONS_OF_BROKER","2"->"INSTRUCTIONS_FOR_INSTITUTION",
    "3"->"INVESTOR")
 
  def decode(a: Option[Any]) : Option[SettlObligSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlObligSourceField]
  }

  def decode(a: Any) : Option[SettlObligSourceField] = a match {
    case v: String => Some(SettlObligSourceField(v))
    case v: Char => Some(SettlObligSourceField(v.toString))
    case v: SettlObligSourceField => Some(v)
    case _ => scala.Option.empty[SettlObligSourceField]
  } 
}
