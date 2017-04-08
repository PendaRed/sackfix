package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class MiscFeeAmtField(override val value: Float) extends SfFieldFloat(137, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(137)MiscFeeAmt=(").append(value).append(")")
}

object MiscFeeAmtField {
  val TagId = 137  
  def apply(value: String) = try {
    new MiscFeeAmtField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MiscFeeAmt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MiscFeeAmtField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MiscFeeAmtField]
  }

  def decode(a: Any) : Option[MiscFeeAmtField] = a match {
    case v: String => Some(MiscFeeAmtField(v))
    case v: Float => Some(MiscFeeAmtField(v))
    case v: Double => Some(MiscFeeAmtField(v.toFloat))
    case v: Int => Some(MiscFeeAmtField(v.toFloat))
    case v: MiscFeeAmtField => Some(v)
    case _ => scala.Option.empty[MiscFeeAmtField]
  } 
}
