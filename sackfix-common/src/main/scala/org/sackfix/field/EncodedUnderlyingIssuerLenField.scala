package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class EncodedUnderlyingIssuerLenField(override val value: Int) extends SfFieldInt(362, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(362)EncodedUnderlyingIssuerLen=(").append(value).append(")")
}

object EncodedUnderlyingIssuerLenField {
  val TagId = 362  
  def apply(value: String) = try {
    new EncodedUnderlyingIssuerLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedUnderlyingIssuerLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedUnderlyingIssuerLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedUnderlyingIssuerLenField]
  }

  def decode(a: Any) : Option[EncodedUnderlyingIssuerLenField] = a match {
    case v: String => Some(EncodedUnderlyingIssuerLenField(v))
    case v: Int => Some(EncodedUnderlyingIssuerLenField(v))
    case v: EncodedUnderlyingIssuerLenField => Some(v)
    case _ => scala.Option.empty[EncodedUnderlyingIssuerLenField]
  } 
}
