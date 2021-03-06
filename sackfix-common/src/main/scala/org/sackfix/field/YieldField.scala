package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class YieldField(override val value: Float) extends SfFieldFloat(236, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(236)Yield=(").append(value).append(")")
}

object YieldField {
  val TagId = 236  
  def apply(value: String) = try {
    new YieldField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Yield("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[YieldField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[YieldField]
  }

  def decode(a: Any) : Option[YieldField] = a match {
    case v: String => Some(YieldField(v))
    case v: Float => Some(YieldField(v))
    case v: Double => Some(YieldField(v.toFloat))
    case v: Int => Some(YieldField(v.toFloat))
    case v: YieldField => Some(v)
    case _ => scala.Option.empty[YieldField]
  } 
}
