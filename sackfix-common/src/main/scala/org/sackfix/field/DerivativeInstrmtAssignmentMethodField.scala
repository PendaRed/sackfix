package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeInstrmtAssignmentMethodField(override val value: String) extends SfFieldString(1255, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1255)DerivativeInstrmtAssignmentMethod=(").append(value).append(")")
}

object DerivativeInstrmtAssignmentMethodField {
  val TagId = 1255  
  def decode(a: Option[Any]) : Option[DerivativeInstrmtAssignmentMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrmtAssignmentMethodField]
  }

  def decode(a: Any) : Option[DerivativeInstrmtAssignmentMethodField] = a match {
    case v: String => Some(DerivativeInstrmtAssignmentMethodField(v))
    case v: Char => Some(DerivativeInstrmtAssignmentMethodField(v.toString))
    case v: DerivativeInstrmtAssignmentMethodField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrmtAssignmentMethodField]
  } 
}
