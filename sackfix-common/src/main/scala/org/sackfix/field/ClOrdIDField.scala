package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ClOrdIDField(override val value: String) extends SfFieldString(11, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(11)ClOrdID=(").append(value).append(")")
}

object ClOrdIDField {
  val TagId = 11  
  def decode(a: Option[Any]) : Option[ClOrdIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClOrdIDField]
  }

  def decode(a: Any) : Option[ClOrdIDField] = a match {
    case v: String => Some(ClOrdIDField(v))
    case v: ClOrdIDField => Some(v)
    case _ => scala.Option.empty[ClOrdIDField]
  } 
}
