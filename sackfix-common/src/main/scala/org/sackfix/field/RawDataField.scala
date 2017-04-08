package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class RawDataField(override val value: String) extends SfFieldString(96, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(96)RawData=(").append(value).append(")")
}

object RawDataField {
  val TagId = 96  
  def decode(a: Option[Any]) : Option[RawDataField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RawDataField]
  }

  def decode(a: Any) : Option[RawDataField] = a match {
    case v: String => Some(RawDataField(v))
    case v: RawDataField => Some(v)
    case _ => scala.Option.empty[RawDataField]
  } 
}
