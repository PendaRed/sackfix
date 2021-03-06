package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class DerivativeOptAttributeField(override val value: String) extends SfFieldString(1265, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1265)DerivativeOptAttribute=(").append(value).append(")")
}

object DerivativeOptAttributeField {
  val TagId = 1265  
  def decode(a: Option[Any]) : Option[DerivativeOptAttributeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeOptAttributeField]
  }

  def decode(a: Any) : Option[DerivativeOptAttributeField] = a match {
    case v: String => Some(DerivativeOptAttributeField(v))
    case v: Char => Some(DerivativeOptAttributeField(v.toString))
    case v: DerivativeOptAttributeField => Some(v)
    case _ => scala.Option.empty[DerivativeOptAttributeField]
  } 
}
