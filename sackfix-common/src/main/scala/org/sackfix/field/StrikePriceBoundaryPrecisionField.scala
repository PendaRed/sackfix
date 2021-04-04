package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class StrikePriceBoundaryPrecisionField(override val value: Float) extends SfFieldFloat(1480, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1480)StrikePriceBoundaryPrecision=(").append(value).append(")")
}

object StrikePriceBoundaryPrecisionField {
  val TagId = 1480  
  def apply(value: String) = try {
    new StrikePriceBoundaryPrecisionField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StrikePriceBoundaryPrecision("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StrikePriceBoundaryPrecisionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrikePriceBoundaryPrecisionField]
  }

  def decode(a: Any) : Option[StrikePriceBoundaryPrecisionField] = a match {
    case v: String => Some(StrikePriceBoundaryPrecisionField(v))
    case v: Float => Some(StrikePriceBoundaryPrecisionField(v))
    case v: Double => Some(StrikePriceBoundaryPrecisionField(v.toFloat))
    case v: Int => Some(StrikePriceBoundaryPrecisionField(v.toFloat))
    case v: StrikePriceBoundaryPrecisionField => Some(v)
    case _ => scala.Option.empty[StrikePriceBoundaryPrecisionField]
  } 
}
