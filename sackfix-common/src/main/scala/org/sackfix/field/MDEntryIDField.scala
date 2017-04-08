package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class MDEntryIDField(override val value: String) extends SfFieldString(278, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(278)MDEntryID=(").append(value).append(")")
}

object MDEntryIDField {
  val TagId = 278  
  def decode(a: Option[Any]) : Option[MDEntryIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDEntryIDField]
  }

  def decode(a: Any) : Option[MDEntryIDField] = a match {
    case v: String => Some(MDEntryIDField(v))
    case v: MDEntryIDField => Some(v)
    case _ => scala.Option.empty[MDEntryIDField]
  } 
}