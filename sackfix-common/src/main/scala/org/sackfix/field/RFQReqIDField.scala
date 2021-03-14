package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class RFQReqIDField(override val value: String) extends SfFieldString(644, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(644)RFQReqID=(").append(value).append(")")
}

object RFQReqIDField {
  val TagId = 644  
  def decode(a: Option[Any]) : Option[RFQReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RFQReqIDField]
  }

  def decode(a: Any) : Option[RFQReqIDField] = a match {
    case v: String => Some(RFQReqIDField(v))
    case v: RFQReqIDField => Some(v)
    case _ => scala.Option.empty[RFQReqIDField]
  } 
}
