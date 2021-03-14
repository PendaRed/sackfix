package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class RegistStatusField(override val value: String) extends SfFieldString(506, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(506)RegistStatus=(").append(value).append(")").append(RegistStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object RegistStatusField {
  val TagId = 506 
  val Accepted="A"
  val Rejected="R"
  val Held="H"
  val Reminder="N"
  lazy val fixDescriptionByValue = Map("A"->"ACCEPTED","R"->"REJECTED",
    "H"->"HELD","N"->"REMINDER")
 
  def decode(a: Option[Any]) : Option[RegistStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RegistStatusField]
  }

  def decode(a: Any) : Option[RegistStatusField] = a match {
    case v: String => Some(RegistStatusField(v))
    case v: Char => Some(RegistStatusField(v.toString))
    case v: RegistStatusField => Some(v)
    case _ => scala.Option.empty[RegistStatusField]
  } 
}
