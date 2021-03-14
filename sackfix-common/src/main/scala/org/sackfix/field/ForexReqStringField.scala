package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ForexReqStringField(override val value: String) extends SfFieldString(121, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(121)ForexReqString=(").append(value).append(")")
}

object ForexReqStringField {
  val TagId = 121  
  def decode(a: Option[Any]) : Option[ForexReqStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ForexReqStringField]
  }

  def decode(a: Any) : Option[ForexReqStringField] = a match {
    case v: String => Some(ForexReqStringField(v))
    case v: ForexReqStringField => Some(v)
    case _ => scala.Option.empty[ForexReqStringField]
  } 
}
