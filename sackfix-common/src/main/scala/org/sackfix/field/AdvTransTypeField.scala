package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class AdvTransTypeField(override val value: String) extends SfFieldString(5, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(5)AdvTransType=(").append(value).append(")").append(AdvTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object AdvTransTypeField {
  val TagId = 5 
  val New="N"
  val Cancel="C"
  val Replace="R"
  lazy val fixDescriptionByValue = Map("N"->"NEW","C"->"CANCEL",
    "R"->"REPLACE")
 
  def decode(a: Option[Any]) : Option[AdvTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AdvTransTypeField]
  }

  def decode(a: Any) : Option[AdvTransTypeField] = a match {
    case v: String => Some(AdvTransTypeField(v))
    case v: AdvTransTypeField => Some(v)
    case _ => scala.Option.empty[AdvTransTypeField]
  } 
}
