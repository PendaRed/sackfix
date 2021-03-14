package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class MDFeedTypeField(override val value: String) extends SfFieldString(1022, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1022)MDFeedType=(").append(value).append(")")
}

object MDFeedTypeField {
  val TagId = 1022  
  def decode(a: Option[Any]) : Option[MDFeedTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDFeedTypeField]
  }

  def decode(a: Any) : Option[MDFeedTypeField] = a match {
    case v: String => Some(MDFeedTypeField(v))
    case v: MDFeedTypeField => Some(v)
    case _ => scala.Option.empty[MDFeedTypeField]
  } 
}
