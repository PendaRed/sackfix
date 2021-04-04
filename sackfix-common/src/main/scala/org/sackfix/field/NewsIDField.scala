package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class NewsIDField(override val value: String) extends SfFieldString(1472, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1472)NewsID=(").append(value).append(")")
}

object NewsIDField {
  val TagId = 1472  
  def decode(a: Option[Any]) : Option[NewsIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NewsIDField]
  }

  def decode(a: Any) : Option[NewsIDField] = a match {
    case v: String => Some(NewsIDField(v))
    case v: NewsIDField => Some(v)
    case _ => scala.Option.empty[NewsIDField]
  } 
}
