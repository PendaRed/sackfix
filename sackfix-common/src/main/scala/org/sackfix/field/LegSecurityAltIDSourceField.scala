package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegSecurityAltIDSourceField(override val value: String) extends SfFieldString(606, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(606)LegSecurityAltIDSource=(").append(value).append(")")
}

object LegSecurityAltIDSourceField {
  val TagId = 606  
  def decode(a: Option[Any]) : Option[LegSecurityAltIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegSecurityAltIDSourceField]
  }

  def decode(a: Any) : Option[LegSecurityAltIDSourceField] = a match {
    case v: String => Some(LegSecurityAltIDSourceField(v))
    case v: LegSecurityAltIDSourceField => Some(v)
    case _ => scala.Option.empty[LegSecurityAltIDSourceField]
  } 
}
