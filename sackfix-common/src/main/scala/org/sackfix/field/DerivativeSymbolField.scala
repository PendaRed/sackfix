package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class DerivativeSymbolField(override val value: String) extends SfFieldString(1214, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1214)DerivativeSymbol=(").append(value).append(")")
}

object DerivativeSymbolField {
  val TagId = 1214  
  def decode(a: Option[Any]) : Option[DerivativeSymbolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSymbolField]
  }

  def decode(a: Any) : Option[DerivativeSymbolField] = a match {
    case v: String => Some(DerivativeSymbolField(v))
    case v: DerivativeSymbolField => Some(v)
    case _ => scala.Option.empty[DerivativeSymbolField]
  } 
}
