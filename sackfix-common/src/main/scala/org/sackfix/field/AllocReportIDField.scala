package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocReportIDField(override val value: String) extends SfFieldString(755, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(755)AllocReportID=(").append(value).append(")")
}

object AllocReportIDField {
  val TagId = 755  
  def decode(a: Option[Any]) : Option[AllocReportIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocReportIDField]
  }

  def decode(a: Any) : Option[AllocReportIDField] = a match {
    case v: String => Some(AllocReportIDField(v))
    case v: AllocReportIDField => Some(v)
    case _ => scala.Option.empty[AllocReportIDField]
  } 
}
