package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoSideTrdRegTSField(override val value: Int) extends SfNumInGroup(1016, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1016)NoSideTrdRegTS=(").append(value).append(")")
}

object NoSideTrdRegTSField {
  val TagId = 1016  
  def apply(value: String) = try {
    new NoSideTrdRegTSField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoSideTrdRegTS("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoSideTrdRegTSField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoSideTrdRegTSField]
  }

  def decode(a: Any) : Option[NoSideTrdRegTSField] = a match {
    case v: String => Some(NoSideTrdRegTSField(v))
    case v: Int => Some(NoSideTrdRegTSField(v))
    case v: NoSideTrdRegTSField => Some(v)
    case _ => scala.Option.empty[NoSideTrdRegTSField]
  } 
}
