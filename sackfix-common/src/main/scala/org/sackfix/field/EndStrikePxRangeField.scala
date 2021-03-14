package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170521
  */
case class EndStrikePxRangeField(override val value: Float) extends SfFieldFloat(1203, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1203)EndStrikePxRange=(").append(value).append(")")
}

object EndStrikePxRangeField {
  val TagId = 1203  
  def apply(value: String) = try {
    new EndStrikePxRangeField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EndStrikePxRange("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EndStrikePxRangeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EndStrikePxRangeField]
  }

  def decode(a: Any) : Option[EndStrikePxRangeField] = a match {
    case v: String => Some(EndStrikePxRangeField(v))
    case v: Float => Some(EndStrikePxRangeField(v))
    case v: Double => Some(EndStrikePxRangeField(v.toFloat))
    case v: Int => Some(EndStrikePxRangeField(v.toFloat))
    case v: EndStrikePxRangeField => Some(v)
    case _ => scala.Option.empty[EndStrikePxRangeField]
  } 
}
