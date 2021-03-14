package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class RegistEmailField(override val value: String) extends SfFieldString(511, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(511)RegistEmail=(").append(value).append(")")
}

object RegistEmailField {
  val TagId = 511  
  def decode(a: Option[Any]) : Option[RegistEmailField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RegistEmailField]
  }

  def decode(a: Any) : Option[RegistEmailField] = a match {
    case v: String => Some(RegistEmailField(v))
    case v: RegistEmailField => Some(v)
    case _ => scala.Option.empty[RegistEmailField]
  } 
}
