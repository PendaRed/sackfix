package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class FillPxField(override val value: Float) extends SfFieldFloat(1364, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1364)FillPx=(").append(value).append(")")
}

object FillPxField {
  val TagId = 1364  
  def apply(value: String) = try {
    new FillPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new FillPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[FillPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FillPxField]
  }

  def decode(a: Any) : Option[FillPxField] = a match {
    case v: String => Some(FillPxField(v))
    case v: Float => Some(FillPxField(v))
    case v: Double => Some(FillPxField(v.toFloat))
    case v: Int => Some(FillPxField(v.toFloat))
    case v: FillPxField => Some(v)
    case _ => scala.Option.empty[FillPxField]
  } 
}
