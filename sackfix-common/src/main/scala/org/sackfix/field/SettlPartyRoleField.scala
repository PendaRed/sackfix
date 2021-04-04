package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class SettlPartyRoleField(override val value: Int) extends SfFieldInt(784, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(784)SettlPartyRole=(").append(value).append(")")
}

object SettlPartyRoleField {
  val TagId = 784  
  def apply(value: String) = try {
    new SettlPartyRoleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlPartyRole("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlPartyRoleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlPartyRoleField]
  }

  def decode(a: Any) : Option[SettlPartyRoleField] = a match {
    case v: String => Some(SettlPartyRoleField(v))
    case v: Int => Some(SettlPartyRoleField(v))
    case v: SettlPartyRoleField => Some(v)
    case _ => scala.Option.empty[SettlPartyRoleField]
  } 
}
