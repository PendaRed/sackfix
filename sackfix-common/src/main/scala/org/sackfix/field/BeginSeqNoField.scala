package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class BeginSeqNoField(override val value: Int) extends SfFieldInt(7, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(7)BeginSeqNo=(").append(value).append(")")
}

object BeginSeqNoField {
  val TagId = 7  
  def apply(value: String) = try {
    new BeginSeqNoField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BeginSeqNo("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BeginSeqNoField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BeginSeqNoField]
  }

  def decode(a: Any) : Option[BeginSeqNoField] = a match {
    case v: String => Some(BeginSeqNoField(v))
    case v: Int => Some(BeginSeqNoField(v))
    case v: BeginSeqNoField => Some(v)
    case _ => scala.Option.empty[BeginSeqNoField]
  } 
}
