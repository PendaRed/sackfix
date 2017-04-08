package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class RegistTransTypeField(override val value: String) extends SfFieldString(514, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(514)RegistTransType=(").append(value).append(")").append(RegistTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object RegistTransTypeField {
  val TagId = 514 
  val New="0"
  val Replace="1"
  val Cancel="2"
  lazy val fixDescriptionByValue = Map("0"->"NEW","1"->"REPLACE",
    "2"->"CANCEL")
 
  def decode(a: Option[Any]) : Option[RegistTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RegistTransTypeField]
  }

  def decode(a: Any) : Option[RegistTransTypeField] = a match {
    case v: String => Some(RegistTransTypeField(v))
    case v: Char => Some(RegistTransTypeField(v.toString))
    case v: RegistTransTypeField => Some(v)
    case _ => scala.Option.empty[RegistTransTypeField]
  } 
}
