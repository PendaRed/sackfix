package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SenderSubIDField(override val value: String) extends SfFieldString(50, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(50)SenderSubID=(").append(value).append(")")
}

object SenderSubIDField {
  val TagId = 50  
  def decode(a: Option[Any]) : Option[SenderSubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SenderSubIDField]
  }

  def decode(a: Any) : Option[SenderSubIDField] = a match {
    case v: String => Some(SenderSubIDField(v))
    case v: SenderSubIDField => Some(v)
    case _ => scala.Option.empty[SenderSubIDField]
  } 
}
