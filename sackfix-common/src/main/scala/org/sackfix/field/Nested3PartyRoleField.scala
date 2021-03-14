package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class Nested3PartyRoleField(override val value: Int) extends SfFieldInt(951, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(951)Nested3PartyRole=(").append(value).append(")")
}

object Nested3PartyRoleField {
  val TagId = 951  
  def apply(value: String) = try {
    new Nested3PartyRoleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Nested3PartyRole("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[Nested3PartyRoleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested3PartyRoleField]
  }

  def decode(a: Any) : Option[Nested3PartyRoleField] = a match {
    case v: String => Some(Nested3PartyRoleField(v))
    case v: Int => Some(Nested3PartyRoleField(v))
    case v: Nested3PartyRoleField => Some(v)
    case _ => scala.Option.empty[Nested3PartyRoleField]
  } 
}
