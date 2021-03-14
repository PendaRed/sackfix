package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class ContAmtCurrField(override val value: String) extends SfFieldString(521, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(521)ContAmtCurr=(").append(value).append(")")
}

object ContAmtCurrField {
  val TagId = 521  
  def decode(a: Option[Any]) : Option[ContAmtCurrField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContAmtCurrField]
  }

  def decode(a: Any) : Option[ContAmtCurrField] = a match {
    case v: String => Some(ContAmtCurrField(v))
    case v: ContAmtCurrField => Some(v)
    case _ => scala.Option.empty[ContAmtCurrField]
  } 
}
