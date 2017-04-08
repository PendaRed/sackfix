package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class NestedInstrAttribValueField(override val value: String) extends SfFieldString(1211, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1211)NestedInstrAttribValue=(").append(value).append(")")
}

object NestedInstrAttribValueField {
  val TagId = 1211  
  def decode(a: Option[Any]) : Option[NestedInstrAttribValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NestedInstrAttribValueField]
  }

  def decode(a: Any) : Option[NestedInstrAttribValueField] = a match {
    case v: String => Some(NestedInstrAttribValueField(v))
    case v: NestedInstrAttribValueField => Some(v)
    case _ => scala.Option.empty[NestedInstrAttribValueField]
  } 
}
