package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeInstrumentPartyRoleField(override val value: Int) extends SfFieldInt(1295, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1295)DerivativeInstrumentPartyRole=(").append(value).append(")")
}

object DerivativeInstrumentPartyRoleField {
  val TagId = 1295  
  def apply(value: String) = try {
    new DerivativeInstrumentPartyRoleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeInstrumentPartyRole("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeInstrumentPartyRoleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrumentPartyRoleField]
  }

  def decode(a: Any) : Option[DerivativeInstrumentPartyRoleField] = a match {
    case v: String => Some(DerivativeInstrumentPartyRoleField(v))
    case v: Int => Some(DerivativeInstrumentPartyRoleField(v))
    case v: DerivativeInstrumentPartyRoleField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrumentPartyRoleField]
  } 
}
