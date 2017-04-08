package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class MDEntryPositionNoField(override val value: Int) extends SfFieldInt(290, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(290)MDEntryPositionNo=(").append(value).append(")")
}

object MDEntryPositionNoField {
  val TagId = 290  
  def apply(value: String) = try {
    new MDEntryPositionNoField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDEntryPositionNo("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDEntryPositionNoField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDEntryPositionNoField]
  }

  def decode(a: Any) : Option[MDEntryPositionNoField] = a match {
    case v: String => Some(MDEntryPositionNoField(v))
    case v: Int => Some(MDEntryPositionNoField(v))
    case v: MDEntryPositionNoField => Some(v)
    case _ => scala.Option.empty[MDEntryPositionNoField]
  } 
}
