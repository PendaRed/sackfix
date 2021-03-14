package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ConfirmReqIDField(override val value: String) extends SfFieldString(859, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(859)ConfirmReqID=(").append(value).append(")")
}

object ConfirmReqIDField {
  val TagId = 859  
  def decode(a: Option[Any]) : Option[ConfirmReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ConfirmReqIDField]
  }

  def decode(a: Any) : Option[ConfirmReqIDField] = a match {
    case v: String => Some(ConfirmReqIDField(v))
    case v: ConfirmReqIDField => Some(v)
    case _ => scala.Option.empty[ConfirmReqIDField]
  } 
}
