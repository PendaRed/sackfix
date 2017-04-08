package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TriggerOrderTypeField(override val value: String) extends SfFieldString(1111, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1111)TriggerOrderType=(").append(value).append(")").append(TriggerOrderTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TriggerOrderTypeField {
  val TagId = 1111 
  val Market="1"
  val Limit="2"
  lazy val fixDescriptionByValue = Map("1"->"MARKET","2"->"LIMIT")
 
  def decode(a: Option[Any]) : Option[TriggerOrderTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TriggerOrderTypeField]
  }

  def decode(a: Any) : Option[TriggerOrderTypeField] = a match {
    case v: String => Some(TriggerOrderTypeField(v))
    case v: Char => Some(TriggerOrderTypeField(v.toString))
    case v: TriggerOrderTypeField => Some(v)
    case _ => scala.Option.empty[TriggerOrderTypeField]
  } 
}
