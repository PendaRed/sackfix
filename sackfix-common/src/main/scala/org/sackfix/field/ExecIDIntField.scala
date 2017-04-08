package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExecIDIntField(override val value: Int) extends SfFieldInt(17, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(17)ExecIDInt=(").append(value).append(")")
}

object ExecIDIntField {
  val TagId = 17  
  def apply(value: String) = try {
    new ExecIDIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExecIDInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExecIDIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExecIDIntField]
  }

  def decode(a: Any) : Option[ExecIDIntField] = a match {
    case v: String => Some(ExecIDIntField(v))
    case v: Int => Some(ExecIDIntField(v))
    case v: ExecIDIntField => Some(v)
    case _ => scala.Option.empty[ExecIDIntField]
  } 
}
