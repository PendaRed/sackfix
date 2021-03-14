package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SecurityStatusField(override val value: String) extends SfFieldString(965, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(965)SecurityStatus=(").append(value).append(")").append(SecurityStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityStatusField {
  val TagId = 965 
  val Active="1"
  val Inactive="2"
  lazy val fixDescriptionByValue = Map("1"->"ACTIVE","2"->"INACTIVE")
 
  def decode(a: Option[Any]) : Option[SecurityStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityStatusField]
  }

  def decode(a: Any) : Option[SecurityStatusField] = a match {
    case v: String => Some(SecurityStatusField(v))
    case v: SecurityStatusField => Some(v)
    case _ => scala.Option.empty[SecurityStatusField]
  } 
}
