package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingInstrumentPartySubIDField(override val value: String) extends SfFieldString(1063, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1063)UnderlyingInstrumentPartySubID=(").append(value).append(")")
}

object UnderlyingInstrumentPartySubIDField {
  val TagId = 1063  
  def decode(a: Option[Any]) : Option[UnderlyingInstrumentPartySubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingInstrumentPartySubIDField]
  }

  def decode(a: Any) : Option[UnderlyingInstrumentPartySubIDField] = a match {
    case v: String => Some(UnderlyingInstrumentPartySubIDField(v))
    case v: UnderlyingInstrumentPartySubIDField => Some(v)
    case _ => scala.Option.empty[UnderlyingInstrumentPartySubIDField]
  } 
}
