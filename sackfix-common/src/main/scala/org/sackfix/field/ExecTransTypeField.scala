package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExecTransTypeField(override val value: String) extends SfFieldString(20, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(20)ExecTransType=(").append(value).append(")").append(ExecTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ExecTransTypeField {
  val TagId = 20 
  val New="0"
  val Cancel="1"
  val Correct="2"
  val Status="3"
  lazy val fixDescriptionByValue = Map("0"->"NEW","1"->"CANCEL",
    "2"->"CORRECT","3"->"STATUS")
 
  def decode(a: Option[Any]) : Option[ExecTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExecTransTypeField]
  }

  def decode(a: Any) : Option[ExecTransTypeField] = a match {
    case v: String => Some(ExecTransTypeField(v))
    case v: Char => Some(ExecTransTypeField(v.toString))
    case v: ExecTransTypeField => Some(v)
    case _ => scala.Option.empty[ExecTransTypeField]
  } 
}