package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class LegSecuritySubTypeField(override val value: String) extends SfFieldString(764, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(764)LegSecuritySubType=(").append(value).append(")")
}

object LegSecuritySubTypeField {
  val TagId = 764  
  def decode(a: Option[Any]) : Option[LegSecuritySubTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegSecuritySubTypeField]
  }

  def decode(a: Any) : Option[LegSecuritySubTypeField] = a match {
    case v: String => Some(LegSecuritySubTypeField(v))
    case v: LegSecuritySubTypeField => Some(v)
    case _ => scala.Option.empty[LegSecuritySubTypeField]
  } 
}
