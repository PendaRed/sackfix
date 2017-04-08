package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingOptAttributeField(override val value: String) extends SfFieldString(317, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(317)UnderlyingOptAttribute=(").append(value).append(")")
}

object UnderlyingOptAttributeField {
  val TagId = 317  
  def decode(a: Option[Any]) : Option[UnderlyingOptAttributeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingOptAttributeField]
  }

  def decode(a: Any) : Option[UnderlyingOptAttributeField] = a match {
    case v: String => Some(UnderlyingOptAttributeField(v))
    case v: Char => Some(UnderlyingOptAttributeField(v.toString))
    case v: UnderlyingOptAttributeField => Some(v)
    case _ => scala.Option.empty[UnderlyingOptAttributeField]
  } 
}
