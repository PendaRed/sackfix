package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DefaultApplVerIDField(override val value: String) extends SfFieldString(1137, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1137)DefaultApplVerID=(").append(value).append(")")
}

object DefaultApplVerIDField {
  val TagId = 1137  
  def decode(a: Option[Any]) : Option[DefaultApplVerIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DefaultApplVerIDField]
  }

  def decode(a: Any) : Option[DefaultApplVerIDField] = a match {
    case v: String => Some(DefaultApplVerIDField(v))
    case v: DefaultApplVerIDField => Some(v)
    case _ => scala.Option.empty[DefaultApplVerIDField]
  } 
}
