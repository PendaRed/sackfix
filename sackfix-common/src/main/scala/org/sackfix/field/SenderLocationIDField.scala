package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SenderLocationIDField(override val value: String) extends SfFieldString(142, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(142)SenderLocationID=(").append(value).append(")")
}

object SenderLocationIDField {
  val TagId = 142  
  def decode(a: Option[Any]) : Option[SenderLocationIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SenderLocationIDField]
  }

  def decode(a: Any) : Option[SenderLocationIDField] = a match {
    case v: String => Some(SenderLocationIDField(v))
    case v: SenderLocationIDField => Some(v)
    case _ => scala.Option.empty[SenderLocationIDField]
  } 
}
