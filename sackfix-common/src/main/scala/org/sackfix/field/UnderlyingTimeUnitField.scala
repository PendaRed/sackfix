package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class UnderlyingTimeUnitField(override val value: String) extends SfFieldString(1000, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1000)UnderlyingTimeUnit=(").append(value).append(")")
}

object UnderlyingTimeUnitField {
  val TagId = 1000  
  def decode(a: Option[Any]) : Option[UnderlyingTimeUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingTimeUnitField]
  }

  def decode(a: Any) : Option[UnderlyingTimeUnitField] = a match {
    case v: String => Some(UnderlyingTimeUnitField(v))
    case v: UnderlyingTimeUnitField => Some(v)
    case _ => scala.Option.empty[UnderlyingTimeUnitField]
  } 
}
