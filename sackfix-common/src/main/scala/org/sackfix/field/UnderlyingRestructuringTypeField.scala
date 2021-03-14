package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingRestructuringTypeField(override val value: String) extends SfFieldString(1453, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1453)UnderlyingRestructuringType=(").append(value).append(")")
}

object UnderlyingRestructuringTypeField {
  val TagId = 1453  
  def decode(a: Option[Any]) : Option[UnderlyingRestructuringTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingRestructuringTypeField]
  }

  def decode(a: Any) : Option[UnderlyingRestructuringTypeField] = a match {
    case v: String => Some(UnderlyingRestructuringTypeField(v))
    case v: UnderlyingRestructuringTypeField => Some(v)
    case _ => scala.Option.empty[UnderlyingRestructuringTypeField]
  } 
}
