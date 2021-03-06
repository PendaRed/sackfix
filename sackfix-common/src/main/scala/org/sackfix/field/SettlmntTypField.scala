package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlmntTypField(override val value: String) extends SfFieldString(63, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(63)SettlmntTyp=(").append(value).append(")").append(SettlmntTypField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlmntTypField {
  val TagId = 63 
  val Regular="0"
  val Cash="1"
  val NextDay="2"
  val Tplus2="3"
  val Tplus3="4"
  val Tplus4="5"
  val Future="6"
  val WhenIssued="7"
  val SellersOption="8"
  val Tplus5="9"
  lazy val fixDescriptionByValue = Map("0"->"REGULAR","1"->"CASH",
    "2"->"NEXT_DAY","3"->"TPLUS2","4"->"TPLUS3",
    "5"->"TPLUS4","6"->"FUTURE","7"->"WHEN_ISSUED",
    "8"->"SELLERS_OPTION","9"->"TPLUS5")
 
  def decode(a: Option[Any]) : Option[SettlmntTypField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlmntTypField]
  }

  def decode(a: Any) : Option[SettlmntTypField] = a match {
    case v: String => Some(SettlmntTypField(v))
    case v: SettlmntTypField => Some(v)
    case _ => scala.Option.empty[SettlmntTypField]
  } 
}
