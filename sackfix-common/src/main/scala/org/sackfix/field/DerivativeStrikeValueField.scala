package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class DerivativeStrikeValueField(override val value: Float) extends SfFieldFloat(1264, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1264)DerivativeStrikeValue=(").append(value).append(")")
}

object DerivativeStrikeValueField {
  val TagId = 1264  
  def apply(value: String) = try {
    new DerivativeStrikeValueField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeStrikeValue("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeStrikeValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeStrikeValueField]
  }

  def decode(a: Any) : Option[DerivativeStrikeValueField] = a match {
    case v: String => Some(DerivativeStrikeValueField(v))
    case v: Float => Some(DerivativeStrikeValueField(v))
    case v: Double => Some(DerivativeStrikeValueField(v.toFloat))
    case v: Int => Some(DerivativeStrikeValueField(v.toFloat))
    case v: DerivativeStrikeValueField => Some(v)
    case _ => scala.Option.empty[DerivativeStrikeValueField]
  } 
}
