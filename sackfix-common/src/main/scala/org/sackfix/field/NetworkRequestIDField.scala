package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class NetworkRequestIDField(override val value: String) extends SfFieldString(933, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(933)NetworkRequestID=(").append(value).append(")")
}

object NetworkRequestIDField {
  val TagId = 933  
  def decode(a: Option[Any]) : Option[NetworkRequestIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NetworkRequestIDField]
  }

  def decode(a: Any) : Option[NetworkRequestIDField] = a match {
    case v: String => Some(NetworkRequestIDField(v))
    case v: NetworkRequestIDField => Some(v)
    case _ => scala.Option.empty[NetworkRequestIDField]
  } 
}
