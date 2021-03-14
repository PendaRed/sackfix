package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class ApplNewSeqNumField(override val value: Int) extends SfFieldInt(1399, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1399)ApplNewSeqNum=(").append(value).append(")")
}

object ApplNewSeqNumField {
  val TagId = 1399  
  def apply(value: String) = try {
    new ApplNewSeqNumField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplNewSeqNum("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplNewSeqNumField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplNewSeqNumField]
  }

  def decode(a: Any) : Option[ApplNewSeqNumField] = a match {
    case v: String => Some(ApplNewSeqNumField(v))
    case v: Int => Some(ApplNewSeqNumField(v))
    case v: ApplNewSeqNumField => Some(v)
    case _ => scala.Option.empty[ApplNewSeqNumField]
  } 
}
