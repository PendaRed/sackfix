package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class PossResendStringField(override val value: String) extends SfFieldString(97, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(97)PossResendString=(").append(value).append(")")
}

object PossResendStringField {
  val TagId = 97  
  def decode(a: Option[Any]) : Option[PossResendStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PossResendStringField]
  }

  def decode(a: Any) : Option[PossResendStringField] = a match {
    case v: String => Some(PossResendStringField(v))
    case v: PossResendStringField => Some(v)
    case _ => scala.Option.empty[PossResendStringField]
  } 
}
