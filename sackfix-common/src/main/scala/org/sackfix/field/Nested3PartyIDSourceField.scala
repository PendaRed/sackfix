package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class Nested3PartyIDSourceField(override val value: String) extends SfFieldString(950, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(950)Nested3PartyIDSource=(").append(value).append(")")
}

object Nested3PartyIDSourceField {
  val TagId = 950  
  def decode(a: Option[Any]) : Option[Nested3PartyIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested3PartyIDSourceField]
  }

  def decode(a: Any) : Option[Nested3PartyIDSourceField] = a match {
    case v: String => Some(Nested3PartyIDSourceField(v))
    case v: Char => Some(Nested3PartyIDSourceField(v.toString))
    case v: Nested3PartyIDSourceField => Some(v)
    case _ => scala.Option.empty[Nested3PartyIDSourceField]
  } 
}
