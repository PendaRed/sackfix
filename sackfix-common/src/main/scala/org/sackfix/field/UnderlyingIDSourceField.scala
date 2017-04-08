package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingIDSourceField(override val value: String) extends SfFieldString(305, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(305)UnderlyingIDSource=(").append(value).append(")")
}

object UnderlyingIDSourceField {
  val TagId = 305  
  def decode(a: Option[Any]) : Option[UnderlyingIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingIDSourceField]
  }

  def decode(a: Any) : Option[UnderlyingIDSourceField] = a match {
    case v: String => Some(UnderlyingIDSourceField(v))
    case v: UnderlyingIDSourceField => Some(v)
    case _ => scala.Option.empty[UnderlyingIDSourceField]
  } 
}
