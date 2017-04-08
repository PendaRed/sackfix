package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class LocateReqdStringField(override val value: String) extends SfFieldString(114, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(114)LocateReqdString=(").append(value).append(")")
}

object LocateReqdStringField {
  val TagId = 114  
  def decode(a: Option[Any]) : Option[LocateReqdStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LocateReqdStringField]
  }

  def decode(a: Any) : Option[LocateReqdStringField] = a match {
    case v: String => Some(LocateReqdStringField(v))
    case v: LocateReqdStringField => Some(v)
    case _ => scala.Option.empty[LocateReqdStringField]
  } 
}
