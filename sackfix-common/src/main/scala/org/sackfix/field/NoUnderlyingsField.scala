package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoUnderlyingsField(override val value: Int) extends SfNumInGroup(711, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(711)NoUnderlyings=(").append(value).append(")")
}

object NoUnderlyingsField {
  val TagId = 711  
  def apply(value: String) = try {
    new NoUnderlyingsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoUnderlyings("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoUnderlyingsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoUnderlyingsField]
  }

  def decode(a: Any) : Option[NoUnderlyingsField] = a match {
    case v: String => Some(NoUnderlyingsField(v))
    case v: Int => Some(NoUnderlyingsField(v))
    case v: NoUnderlyingsField => Some(v)
    case _ => scala.Option.empty[NoUnderlyingsField]
  } 
}
