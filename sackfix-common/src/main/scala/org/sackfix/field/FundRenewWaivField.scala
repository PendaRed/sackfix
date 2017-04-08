package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class FundRenewWaivField(override val value: String) extends SfFieldString(497, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(497)FundRenewWaiv=(").append(value).append(")").append(FundRenewWaivField.fixDescriptionByValue.getOrElse(value,""))
}

object FundRenewWaivField {
  val TagId = 497 
  val No="N"
  val Yes="Y"
  lazy val fixDescriptionByValue = Map("N"->"NO","Y"->"YES")
 
  def decode(a: Option[Any]) : Option[FundRenewWaivField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FundRenewWaivField]
  }

  def decode(a: Any) : Option[FundRenewWaivField] = a match {
    case v: String => Some(FundRenewWaivField(v))
    case v: Char => Some(FundRenewWaivField(v.toString))
    case v: FundRenewWaivField => Some(v)
    case _ => scala.Option.empty[FundRenewWaivField]
  } 
}
