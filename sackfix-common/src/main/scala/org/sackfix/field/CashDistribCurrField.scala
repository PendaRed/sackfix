package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class CashDistribCurrField(override val value: String) extends SfFieldString(478, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(478)CashDistribCurr=(").append(value).append(")")
}

object CashDistribCurrField {
  val TagId = 478  
  def decode(a: Option[Any]) : Option[CashDistribCurrField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashDistribCurrField]
  }

  def decode(a: Any) : Option[CashDistribCurrField] = a match {
    case v: String => Some(CashDistribCurrField(v))
    case v: CashDistribCurrField => Some(v)
    case _ => scala.Option.empty[CashDistribCurrField]
  } 
}
