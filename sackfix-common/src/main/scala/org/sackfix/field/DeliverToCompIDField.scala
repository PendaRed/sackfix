package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DeliverToCompIDField(override val value: String) extends SfFieldString(128, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(128)DeliverToCompID=(").append(value).append(")")
}

object DeliverToCompIDField {
  val TagId = 128  
  def decode(a: Option[Any]) : Option[DeliverToCompIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeliverToCompIDField]
  }

  def decode(a: Any) : Option[DeliverToCompIDField] = a match {
    case v: String => Some(DeliverToCompIDField(v))
    case v: DeliverToCompIDField => Some(v)
    case _ => scala.Option.empty[DeliverToCompIDField]
  } 
}
