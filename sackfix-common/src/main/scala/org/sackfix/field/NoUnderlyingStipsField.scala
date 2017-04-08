package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoUnderlyingStipsField(override val value: Int) extends SfNumInGroup(887, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(887)NoUnderlyingStips=(").append(value).append(")")
}

object NoUnderlyingStipsField {
  val TagId = 887  
  def apply(value: String) = try {
    new NoUnderlyingStipsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoUnderlyingStips("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoUnderlyingStipsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoUnderlyingStipsField]
  }

  def decode(a: Any) : Option[NoUnderlyingStipsField] = a match {
    case v: String => Some(NoUnderlyingStipsField(v))
    case v: Int => Some(NoUnderlyingStipsField(v))
    case v: NoUnderlyingStipsField => Some(v)
    case _ => scala.Option.empty[NoUnderlyingStipsField]
  } 
}
