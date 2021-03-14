package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class EncodedAllocTextLenField(override val value: Int) extends SfFieldInt(360, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(360)EncodedAllocTextLen=(").append(value).append(")")
}

object EncodedAllocTextLenField {
  val TagId = 360  
  def apply(value: String) = try {
    new EncodedAllocTextLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedAllocTextLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedAllocTextLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedAllocTextLenField]
  }

  def decode(a: Any) : Option[EncodedAllocTextLenField] = a match {
    case v: String => Some(EncodedAllocTextLenField(v))
    case v: Int => Some(EncodedAllocTextLenField(v))
    case v: EncodedAllocTextLenField => Some(v)
    case _ => scala.Option.empty[EncodedAllocTextLenField]
  } 
}
