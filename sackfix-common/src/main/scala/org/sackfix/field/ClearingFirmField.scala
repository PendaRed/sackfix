package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ClearingFirmField(override val value: String) extends SfFieldString(439, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(439)ClearingFirm=(").append(value).append(")")
}

object ClearingFirmField {
  val TagId = 439  
  def decode(a: Option[Any]) : Option[ClearingFirmField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClearingFirmField]
  }

  def decode(a: Any) : Option[ClearingFirmField] = a match {
    case v: String => Some(ClearingFirmField(v))
    case v: ClearingFirmField => Some(v)
    case _ => scala.Option.empty[ClearingFirmField]
  } 
}
