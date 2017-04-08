package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LastNetworkResponseIDField(override val value: String) extends SfFieldString(934, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(934)LastNetworkResponseID=(").append(value).append(")")
}

object LastNetworkResponseIDField {
  val TagId = 934  
  def decode(a: Option[Any]) : Option[LastNetworkResponseIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastNetworkResponseIDField]
  }

  def decode(a: Any) : Option[LastNetworkResponseIDField] = a match {
    case v: String => Some(LastNetworkResponseIDField(v))
    case v: LastNetworkResponseIDField => Some(v)
    case _ => scala.Option.empty[LastNetworkResponseIDField]
  } 
}
