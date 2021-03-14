package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class Nested4PartyIDSourceField(override val value: String) extends SfFieldString(1416, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1416)Nested4PartyIDSource=(").append(value).append(")")
}

object Nested4PartyIDSourceField {
  val TagId = 1416  
  def decode(a: Option[Any]) : Option[Nested4PartyIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested4PartyIDSourceField]
  }

  def decode(a: Any) : Option[Nested4PartyIDSourceField] = a match {
    case v: String => Some(Nested4PartyIDSourceField(v))
    case v: Char => Some(Nested4PartyIDSourceField(v.toString))
    case v: Nested4PartyIDSourceField => Some(v)
    case _ => scala.Option.empty[Nested4PartyIDSourceField]
  } 
}
