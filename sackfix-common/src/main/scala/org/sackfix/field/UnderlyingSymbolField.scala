package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingSymbolField(override val value: String) extends SfFieldString(311, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(311)UnderlyingSymbol=(").append(value).append(")")
}

object UnderlyingSymbolField {
  val TagId = 311  
  def decode(a: Option[Any]) : Option[UnderlyingSymbolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSymbolField]
  }

  def decode(a: Any) : Option[UnderlyingSymbolField] = a match {
    case v: String => Some(UnderlyingSymbolField(v))
    case v: UnderlyingSymbolField => Some(v)
    case _ => scala.Option.empty[UnderlyingSymbolField]
  } 
}
