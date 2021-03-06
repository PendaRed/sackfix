package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class ClOrdLinkIDField(override val value: String) extends SfFieldString(583, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(583)ClOrdLinkID=(").append(value).append(")")
}

object ClOrdLinkIDField {
  val TagId = 583  
  def decode(a: Option[Any]) : Option[ClOrdLinkIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClOrdLinkIDField]
  }

  def decode(a: Any) : Option[ClOrdLinkIDField] = a match {
    case v: String => Some(ClOrdLinkIDField(v))
    case v: ClOrdLinkIDField => Some(v)
    case _ => scala.Option.empty[ClOrdLinkIDField]
  } 
}
