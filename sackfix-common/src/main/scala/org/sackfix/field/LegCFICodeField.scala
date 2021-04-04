package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegCFICodeField(override val value: String) extends SfFieldString(608, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(608)LegCFICode=(").append(value).append(")")
}

object LegCFICodeField {
  val TagId = 608  
  def decode(a: Option[Any]) : Option[LegCFICodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegCFICodeField]
  }

  def decode(a: Any) : Option[LegCFICodeField] = a match {
    case v: String => Some(LegCFICodeField(v))
    case v: LegCFICodeField => Some(v)
    case _ => scala.Option.empty[LegCFICodeField]
  } 
}
