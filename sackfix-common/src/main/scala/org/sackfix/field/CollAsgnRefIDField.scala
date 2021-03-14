package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class CollAsgnRefIDField(override val value: String) extends SfFieldString(907, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(907)CollAsgnRefID=(").append(value).append(")")
}

object CollAsgnRefIDField {
  val TagId = 907  
  def decode(a: Option[Any]) : Option[CollAsgnRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollAsgnRefIDField]
  }

  def decode(a: Any) : Option[CollAsgnRefIDField] = a match {
    case v: String => Some(CollAsgnRefIDField(v))
    case v: CollAsgnRefIDField => Some(v)
    case _ => scala.Option.empty[CollAsgnRefIDField]
  } 
}
