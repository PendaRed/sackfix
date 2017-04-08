package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedSubjectField(override val value: String) extends SfFieldString(357, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(357)EncodedSubject=(").append(value).append(")")
}

object EncodedSubjectField {
  val TagId = 357  
  def decode(a: Option[Any]) : Option[EncodedSubjectField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedSubjectField]
  }

  def decode(a: Any) : Option[EncodedSubjectField] = a match {
    case v: String => Some(EncodedSubjectField(v))
    case v: EncodedSubjectField => Some(v)
    case _ => scala.Option.empty[EncodedSubjectField]
  } 
}