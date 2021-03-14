package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class EncodedSecurityDescLenField(override val value: Int) extends SfFieldInt(350, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(350)EncodedSecurityDescLen=(").append(value).append(")")
}

object EncodedSecurityDescLenField {
  val TagId = 350  
  def apply(value: String) = try {
    new EncodedSecurityDescLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedSecurityDescLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedSecurityDescLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedSecurityDescLenField]
  }

  def decode(a: Any) : Option[EncodedSecurityDescLenField] = a match {
    case v: String => Some(EncodedSecurityDescLenField(v))
    case v: Int => Some(EncodedSecurityDescLenField(v))
    case v: EncodedSecurityDescLenField => Some(v)
    case _ => scala.Option.empty[EncodedSecurityDescLenField]
  } 
}
