package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class NetworkResponseIDField(override val value: String) extends SfFieldString(932, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(932)NetworkResponseID=(").append(value).append(")")
}

object NetworkResponseIDField {
  val TagId = 932  
  def decode(a: Option[Any]) : Option[NetworkResponseIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NetworkResponseIDField]
  }

  def decode(a: Any) : Option[NetworkResponseIDField] = a match {
    case v: String => Some(NetworkResponseIDField(v))
    case v: NetworkResponseIDField => Some(v)
    case _ => scala.Option.empty[NetworkResponseIDField]
  } 
}
