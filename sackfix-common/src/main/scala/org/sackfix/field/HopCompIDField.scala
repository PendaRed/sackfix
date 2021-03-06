package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class HopCompIDField(override val value: String) extends SfFieldString(628, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(628)HopCompID=(").append(value).append(")")
}

object HopCompIDField {
  val TagId = 628  
  def decode(a: Option[Any]) : Option[HopCompIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HopCompIDField]
  }

  def decode(a: Any) : Option[HopCompIDField] = a match {
    case v: String => Some(HopCompIDField(v))
    case v: HopCompIDField => Some(v)
    case _ => scala.Option.empty[HopCompIDField]
  } 
}
