package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class SpreadField(override val value: Float) extends SfFieldFloat(218, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(218)Spread=(").append(value).append(")")
}

object SpreadField {
  val TagId = 218  
  def apply(value: String) = try {
    new SpreadField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Spread("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SpreadField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SpreadField]
  }

  def decode(a: Any) : Option[SpreadField] = a match {
    case v: String => Some(SpreadField(v))
    case v: Float => Some(SpreadField(v))
    case v: Double => Some(SpreadField(v.toFloat))
    case v: Int => Some(SpreadField(v.toFloat))
    case v: SpreadField => Some(v)
    case _ => scala.Option.empty[SpreadField]
  } 
}
