package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoContAmtsField(override val value: Int) extends SfNumInGroup(518, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(518)NoContAmts=(").append(value).append(")")
}

object NoContAmtsField {
  val TagId = 518  
  def apply(value: String) = try {
    new NoContAmtsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoContAmts("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoContAmtsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoContAmtsField]
  }

  def decode(a: Any) : Option[NoContAmtsField] = a match {
    case v: String => Some(NoContAmtsField(v))
    case v: Int => Some(NoContAmtsField(v))
    case v: NoContAmtsField => Some(v)
    case _ => scala.Option.empty[NoContAmtsField]
  } 
}
