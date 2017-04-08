package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TrdMatchIDField(override val value: String) extends SfFieldString(880, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(880)TrdMatchID=(").append(value).append(")")
}

object TrdMatchIDField {
  val TagId = 880  
  def decode(a: Option[Any]) : Option[TrdMatchIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TrdMatchIDField]
  }

  def decode(a: Any) : Option[TrdMatchIDField] = a match {
    case v: String => Some(TrdMatchIDField(v))
    case v: TrdMatchIDField => Some(v)
    case _ => scala.Option.empty[TrdMatchIDField]
  } 
}
