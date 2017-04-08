package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class UndlyInstrumentPartyRoleField(override val value: Int) extends SfFieldInt(1061, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1061)UndlyInstrumentPartyRole=(").append(value).append(")")
}

object UndlyInstrumentPartyRoleField {
  val TagId = 1061  
  def apply(value: String) = try {
    new UndlyInstrumentPartyRoleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UndlyInstrumentPartyRole("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UndlyInstrumentPartyRoleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UndlyInstrumentPartyRoleField]
  }

  def decode(a: Any) : Option[UndlyInstrumentPartyRoleField] = a match {
    case v: String => Some(UndlyInstrumentPartyRoleField(v))
    case v: Int => Some(UndlyInstrumentPartyRoleField(v))
    case v: UndlyInstrumentPartyRoleField => Some(v)
    case _ => scala.Option.empty[UndlyInstrumentPartyRoleField]
  } 
}