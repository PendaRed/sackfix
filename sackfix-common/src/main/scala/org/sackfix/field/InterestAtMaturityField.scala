package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class InterestAtMaturityField(override val value: Float) extends SfFieldFloat(738, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(738)InterestAtMaturity=(").append(value).append(")")
}

object InterestAtMaturityField {
  val TagId = 738  
  def apply(value: String) = try {
    new InterestAtMaturityField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new InterestAtMaturity("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[InterestAtMaturityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InterestAtMaturityField]
  }

  def decode(a: Any) : Option[InterestAtMaturityField] = a match {
    case v: String => Some(InterestAtMaturityField(v))
    case v: Float => Some(InterestAtMaturityField(v))
    case v: Double => Some(InterestAtMaturityField(v.toFloat))
    case v: Int => Some(InterestAtMaturityField(v.toFloat))
    case v: InterestAtMaturityField => Some(v)
    case _ => scala.Option.empty[InterestAtMaturityField]
  } 
}
