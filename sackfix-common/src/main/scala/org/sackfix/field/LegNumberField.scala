package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class LegNumberField(override val value: Int) extends SfFieldInt(1152, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1152)LegNumber=(").append(value).append(")")
}

object LegNumberField {
  val TagId = 1152  
  def apply(value: String) = try {
    new LegNumberField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegNumber("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegNumberField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegNumberField]
  }

  def decode(a: Any) : Option[LegNumberField] = a match {
    case v: String => Some(LegNumberField(v))
    case v: Int => Some(LegNumberField(v))
    case v: LegNumberField => Some(v)
    case _ => scala.Option.empty[LegNumberField]
  } 
}