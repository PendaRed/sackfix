package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class MiscFeeCurrField(override val value: String) extends SfFieldString(138, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(138)MiscFeeCurr=(").append(value).append(")")
}

object MiscFeeCurrField {
  val TagId = 138  
  def decode(a: Option[Any]) : Option[MiscFeeCurrField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MiscFeeCurrField]
  }

  def decode(a: Any) : Option[MiscFeeCurrField] = a match {
    case v: String => Some(MiscFeeCurrField(v))
    case v: MiscFeeCurrField => Some(v)
    case _ => scala.Option.empty[MiscFeeCurrField]
  } 
}
