package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class MDEntryOriginatorField(override val value: String) extends SfFieldString(282, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(282)MDEntryOriginator=(").append(value).append(")")
}

object MDEntryOriginatorField {
  val TagId = 282  
  def decode(a: Option[Any]) : Option[MDEntryOriginatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDEntryOriginatorField]
  }

  def decode(a: Any) : Option[MDEntryOriginatorField] = a match {
    case v: String => Some(MDEntryOriginatorField(v))
    case v: MDEntryOriginatorField => Some(v)
    case _ => scala.Option.empty[MDEntryOriginatorField]
  } 
}
