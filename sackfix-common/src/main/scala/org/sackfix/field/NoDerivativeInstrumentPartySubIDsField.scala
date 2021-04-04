package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoDerivativeInstrumentPartySubIDsField(override val value: Int) extends SfNumInGroup(1296, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1296)NoDerivativeInstrumentPartySubIDs=(").append(value).append(")")
}

object NoDerivativeInstrumentPartySubIDsField {
  val TagId = 1296  
  def apply(value: String) = try {
    new NoDerivativeInstrumentPartySubIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDerivativeInstrumentPartySubIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDerivativeInstrumentPartySubIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDerivativeInstrumentPartySubIDsField]
  }

  def decode(a: Any) : Option[NoDerivativeInstrumentPartySubIDsField] = a match {
    case v: String => Some(NoDerivativeInstrumentPartySubIDsField(v))
    case v: Int => Some(NoDerivativeInstrumentPartySubIDsField(v))
    case v: NoDerivativeInstrumentPartySubIDsField => Some(v)
    case _ => scala.Option.empty[NoDerivativeInstrumentPartySubIDsField]
  } 
}
