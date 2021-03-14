package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class MDUpdateActionField(override val value: String) extends SfFieldString(279, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(279)MDUpdateAction=(").append(value).append(")").append(MDUpdateActionField.fixDescriptionByValue.getOrElse(value,""))
}

object MDUpdateActionField {
  val TagId = 279 
  val New="0"
  val Change="1"
  val Delete="2"
  val DeleteThru="3"
  val DeleteFrom="4"
  lazy val fixDescriptionByValue = Map("0"->"NEW","1"->"CHANGE",
    "2"->"DELETE","3"->"DELETE_THRU","4"->"DELETE_FROM")
 
  def decode(a: Option[Any]) : Option[MDUpdateActionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDUpdateActionField]
  }

  def decode(a: Any) : Option[MDUpdateActionField] = a match {
    case v: String => Some(MDUpdateActionField(v))
    case v: Char => Some(MDUpdateActionField(v.toString))
    case v: MDUpdateActionField => Some(v)
    case _ => scala.Option.empty[MDUpdateActionField]
  } 
}
