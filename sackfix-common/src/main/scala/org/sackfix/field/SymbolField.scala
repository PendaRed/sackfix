package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SymbolField(override val value: String) extends SfFieldString(55, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(55)Symbol=(").append(value).append(")")
}

object SymbolField {
  val TagId = 55  
  def decode(a: Option[Any]) : Option[SymbolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SymbolField]
  }

  def decode(a: Any) : Option[SymbolField] = a match {
    case v: String => Some(SymbolField(v))
    case v: SymbolField => Some(v)
    case _ => scala.Option.empty[SymbolField]
  } 
}
