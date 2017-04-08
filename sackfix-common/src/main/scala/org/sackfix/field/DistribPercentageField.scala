package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class DistribPercentageField(override val value: Float) extends SfFieldFloat(512, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(512)DistribPercentage=(").append(value).append(")")
}

object DistribPercentageField {
  val TagId = 512  
  def apply(value: String) = try {
    new DistribPercentageField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DistribPercentage("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DistribPercentageField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DistribPercentageField]
  }

  def decode(a: Any) : Option[DistribPercentageField] = a match {
    case v: String => Some(DistribPercentageField(v))
    case v: Float => Some(DistribPercentageField(v))
    case v: Double => Some(DistribPercentageField(v.toFloat))
    case v: Int => Some(DistribPercentageField(v.toFloat))
    case v: DistribPercentageField => Some(v)
    case _ => scala.Option.empty[DistribPercentageField]
  } 
}
