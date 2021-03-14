package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class AllocReportRefIDField(override val value: String) extends SfFieldString(795, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(795)AllocReportRefID=(").append(value).append(")")
}

object AllocReportRefIDField {
  val TagId = 795  
  def decode(a: Option[Any]) : Option[AllocReportRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocReportRefIDField]
  }

  def decode(a: Any) : Option[AllocReportRefIDField] = a match {
    case v: String => Some(AllocReportRefIDField(v))
    case v: AllocReportRefIDField => Some(v)
    case _ => scala.Option.empty[AllocReportRefIDField]
  } 
}
