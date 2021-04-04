package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class MDEntryRefIDField(override val value: String) extends SfFieldString(280, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(280)MDEntryRefID=(").append(value).append(")")
}

object MDEntryRefIDField {
  val TagId = 280  
  def decode(a: Option[Any]) : Option[MDEntryRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDEntryRefIDField]
  }

  def decode(a: Any) : Option[MDEntryRefIDField] = a match {
    case v: String => Some(MDEntryRefIDField(v))
    case v: MDEntryRefIDField => Some(v)
    case _ => scala.Option.empty[MDEntryRefIDField]
  } 
}
