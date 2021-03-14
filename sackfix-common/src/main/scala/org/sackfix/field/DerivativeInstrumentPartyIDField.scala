package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class DerivativeInstrumentPartyIDField(override val value: String) extends SfFieldString(1293, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1293)DerivativeInstrumentPartyID=(").append(value).append(")")
}

object DerivativeInstrumentPartyIDField {
  val TagId = 1293  
  def decode(a: Option[Any]) : Option[DerivativeInstrumentPartyIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrumentPartyIDField]
  }

  def decode(a: Any) : Option[DerivativeInstrumentPartyIDField] = a match {
    case v: String => Some(DerivativeInstrumentPartyIDField(v))
    case v: DerivativeInstrumentPartyIDField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrumentPartyIDField]
  } 
}
