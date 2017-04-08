package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ScopeField(override val value: String) extends SfFieldString(546, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(546)Scope=(").append(value).append(")").append(ScopeField.fixDescriptionByValue.getOrElse(value,""))
}

object ScopeField {
  val TagId = 546 
  val Local="1"
  val National="2"
  val Global="3"
  lazy val fixDescriptionByValue = Map("1"->"LOCAL","2"->"NATIONAL",
    "3"->"GLOBAL")
 
  def decode(a: Option[Any]) : Option[ScopeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ScopeField]
  }

  def decode(a: Any) : Option[ScopeField] = a match {
    case v: String => Some(ScopeField(v))
    case v: ScopeField => Some(v)
    case _ => scala.Option.empty[ScopeField]
  } 
}