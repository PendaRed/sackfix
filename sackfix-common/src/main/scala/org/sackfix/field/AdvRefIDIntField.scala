package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class AdvRefIDIntField(override val value: Int) extends SfFieldInt(3, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(3)AdvRefIDInt=(").append(value).append(")")
}

object AdvRefIDIntField {
  val TagId = 3  
  def apply(value: String) = try {
    new AdvRefIDIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AdvRefIDInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AdvRefIDIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AdvRefIDIntField]
  }

  def decode(a: Any) : Option[AdvRefIDIntField] = a match {
    case v: String => Some(AdvRefIDIntField(v))
    case v: Int => Some(AdvRefIDIntField(v))
    case v: AdvRefIDIntField => Some(v)
    case _ => scala.Option.empty[AdvRefIDIntField]
  } 
}
