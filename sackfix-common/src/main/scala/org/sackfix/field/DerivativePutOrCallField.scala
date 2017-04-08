package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativePutOrCallField(override val value: Int) extends SfFieldInt(1323, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1323)DerivativePutOrCall=(").append(value).append(")")
}

object DerivativePutOrCallField {
  val TagId = 1323  
  def apply(value: String) = try {
    new DerivativePutOrCallField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativePutOrCall("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativePutOrCallField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativePutOrCallField]
  }

  def decode(a: Any) : Option[DerivativePutOrCallField] = a match {
    case v: String => Some(DerivativePutOrCallField(v))
    case v: Int => Some(DerivativePutOrCallField(v))
    case v: DerivativePutOrCallField => Some(v)
    case _ => scala.Option.empty[DerivativePutOrCallField]
  } 
}
