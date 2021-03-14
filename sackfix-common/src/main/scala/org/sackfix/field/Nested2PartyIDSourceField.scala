package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class Nested2PartyIDSourceField(override val value: String) extends SfFieldString(758, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(758)Nested2PartyIDSource=(").append(value).append(")")
}

object Nested2PartyIDSourceField {
  val TagId = 758  
  def decode(a: Option[Any]) : Option[Nested2PartyIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested2PartyIDSourceField]
  }

  def decode(a: Any) : Option[Nested2PartyIDSourceField] = a match {
    case v: String => Some(Nested2PartyIDSourceField(v))
    case v: Char => Some(Nested2PartyIDSourceField(v.toString))
    case v: Nested2PartyIDSourceField => Some(v)
    case _ => scala.Option.empty[Nested2PartyIDSourceField]
  } 
}
