package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class EncodedSecurityListDescLenField(override val value: Int) extends SfFieldInt(1468, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1468)EncodedSecurityListDescLen=(").append(value).append(")")
}

object EncodedSecurityListDescLenField {
  val TagId = 1468  
  def apply(value: String) = try {
    new EncodedSecurityListDescLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedSecurityListDescLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedSecurityListDescLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedSecurityListDescLenField]
  }

  def decode(a: Any) : Option[EncodedSecurityListDescLenField] = a match {
    case v: String => Some(EncodedSecurityListDescLenField(v))
    case v: Int => Some(EncodedSecurityListDescLenField(v))
    case v: EncodedSecurityListDescLenField => Some(v)
    case _ => scala.Option.empty[EncodedSecurityListDescLenField]
  } 
}
