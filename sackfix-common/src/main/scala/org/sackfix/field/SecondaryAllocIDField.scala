package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SecondaryAllocIDField(override val value: String) extends SfFieldString(793, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(793)SecondaryAllocID=(").append(value).append(")")
}

object SecondaryAllocIDField {
  val TagId = 793  
  def decode(a: Option[Any]) : Option[SecondaryAllocIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecondaryAllocIDField]
  }

  def decode(a: Any) : Option[SecondaryAllocIDField] = a match {
    case v: String => Some(SecondaryAllocIDField(v))
    case v: SecondaryAllocIDField => Some(v)
    case _ => scala.Option.empty[SecondaryAllocIDField]
  } 
}
