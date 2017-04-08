package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedTextLenField(override val value: Int) extends SfFieldInt(354, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(354)EncodedTextLen=(").append(value).append(")")
}

object EncodedTextLenField {
  val TagId = 354  
  def apply(value: String) = try {
    new EncodedTextLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedTextLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedTextLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedTextLenField]
  }

  def decode(a: Any) : Option[EncodedTextLenField] = a match {
    case v: String => Some(EncodedTextLenField(v))
    case v: Int => Some(EncodedTextLenField(v))
    case v: EncodedTextLenField => Some(v)
    case _ => scala.Option.empty[EncodedTextLenField]
  } 
}
