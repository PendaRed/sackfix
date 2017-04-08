package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocAvgPxField(override val value: Float) extends SfFieldFloat(153, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(153)AllocAvgPx=(").append(value).append(")")
}

object AllocAvgPxField {
  val TagId = 153  
  def apply(value: String) = try {
    new AllocAvgPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocAvgPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocAvgPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocAvgPxField]
  }

  def decode(a: Any) : Option[AllocAvgPxField] = a match {
    case v: String => Some(AllocAvgPxField(v))
    case v: Float => Some(AllocAvgPxField(v))
    case v: Double => Some(AllocAvgPxField(v.toFloat))
    case v: Int => Some(AllocAvgPxField(v.toFloat))
    case v: AllocAvgPxField => Some(v)
    case _ => scala.Option.empty[AllocAvgPxField]
  } 
}
