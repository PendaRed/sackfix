package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LocaleOfIssueField(override val value: String) extends SfFieldString(472, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(472)LocaleOfIssue=(").append(value).append(")")
}

object LocaleOfIssueField {
  val TagId = 472  
  def decode(a: Option[Any]) : Option[LocaleOfIssueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LocaleOfIssueField]
  }

  def decode(a: Any) : Option[LocaleOfIssueField] = a match {
    case v: String => Some(LocaleOfIssueField(v))
    case v: LocaleOfIssueField => Some(v)
    case _ => scala.Option.empty[LocaleOfIssueField]
  } 
}
