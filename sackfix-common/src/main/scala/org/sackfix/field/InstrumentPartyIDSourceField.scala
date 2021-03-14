package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class InstrumentPartyIDSourceField(override val value: String) extends SfFieldString(1050, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1050)InstrumentPartyIDSource=(").append(value).append(")")
}

object InstrumentPartyIDSourceField {
  val TagId = 1050  
  def decode(a: Option[Any]) : Option[InstrumentPartyIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InstrumentPartyIDSourceField]
  }

  def decode(a: Any) : Option[InstrumentPartyIDSourceField] = a match {
    case v: String => Some(InstrumentPartyIDSourceField(v))
    case v: Char => Some(InstrumentPartyIDSourceField(v.toString))
    case v: InstrumentPartyIDSourceField => Some(v)
    case _ => scala.Option.empty[InstrumentPartyIDSourceField]
  } 
}
