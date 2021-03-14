package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class ContraLegRefIDField(override val value: String) extends SfFieldString(655, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(655)ContraLegRefID=(").append(value).append(")")
}

object ContraLegRefIDField {
  val TagId = 655  
  def decode(a: Option[Any]) : Option[ContraLegRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContraLegRefIDField]
  }

  def decode(a: Any) : Option[ContraLegRefIDField] = a match {
    case v: String => Some(ContraLegRefIDField(v))
    case v: ContraLegRefIDField => Some(v)
    case _ => scala.Option.empty[ContraLegRefIDField]
  } 
}
