package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class Nested4PartySubIDField(override val value: String) extends SfFieldString(1412, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1412)Nested4PartySubID=(").append(value).append(")")
}

object Nested4PartySubIDField {
  val TagId = 1412  
  def decode(a: Option[Any]) : Option[Nested4PartySubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested4PartySubIDField]
  }

  def decode(a: Any) : Option[Nested4PartySubIDField] = a match {
    case v: String => Some(Nested4PartySubIDField(v))
    case v: Nested4PartySubIDField => Some(v)
    case _ => scala.Option.empty[Nested4PartySubIDField]
  } 
}
