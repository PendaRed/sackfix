package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeInstrAttribValueField(override val value: String) extends SfFieldString(1314, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1314)DerivativeInstrAttribValue=(").append(value).append(")")
}

object DerivativeInstrAttribValueField {
  val TagId = 1314  
  def decode(a: Option[Any]) : Option[DerivativeInstrAttribValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrAttribValueField]
  }

  def decode(a: Any) : Option[DerivativeInstrAttribValueField] = a match {
    case v: String => Some(DerivativeInstrAttribValueField(v))
    case v: DerivativeInstrAttribValueField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrAttribValueField]
  } 
}