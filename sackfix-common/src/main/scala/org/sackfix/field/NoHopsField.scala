package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoHopsField(override val value: Int) extends SfNumInGroup(627, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(627)NoHops=(").append(value).append(")")
}

object NoHopsField {
  val TagId = 627  
  def apply(value: String) = try {
    new NoHopsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoHops("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoHopsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoHopsField]
  }

  def decode(a: Any) : Option[NoHopsField] = a match {
    case v: String => Some(NoHopsField(v))
    case v: Int => Some(NoHopsField(v))
    case v: NoHopsField => Some(v)
    case _ => scala.Option.empty[NoHopsField]
  } 
}
