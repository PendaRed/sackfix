package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class Nested3PartyIDField(override val value: String) extends SfFieldString(949, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(949)Nested3PartyID=(").append(value).append(")")
}

object Nested3PartyIDField {
  val TagId = 949  
  def decode(a: Option[Any]) : Option[Nested3PartyIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested3PartyIDField]
  }

  def decode(a: Any) : Option[Nested3PartyIDField] = a match {
    case v: String => Some(Nested3PartyIDField(v))
    case v: Nested3PartyIDField => Some(v)
    case _ => scala.Option.empty[Nested3PartyIDField]
  } 
}
