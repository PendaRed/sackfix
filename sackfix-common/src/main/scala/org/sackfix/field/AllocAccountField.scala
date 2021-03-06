package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class AllocAccountField(override val value: String) extends SfFieldString(79, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(79)AllocAccount=(").append(value).append(")")
}

object AllocAccountField {
  val TagId = 79  
  def decode(a: Option[Any]) : Option[AllocAccountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocAccountField]
  }

  def decode(a: Any) : Option[AllocAccountField] = a match {
    case v: String => Some(AllocAccountField(v))
    case v: AllocAccountField => Some(v)
    case _ => scala.Option.empty[AllocAccountField]
  } 
}
