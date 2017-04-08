package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocAccruedInterestAmtField(override val value: Float) extends SfFieldFloat(742, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(742)AllocAccruedInterestAmt=(").append(value).append(")")
}

object AllocAccruedInterestAmtField {
  val TagId = 742  
  def apply(value: String) = try {
    new AllocAccruedInterestAmtField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocAccruedInterestAmt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocAccruedInterestAmtField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocAccruedInterestAmtField]
  }

  def decode(a: Any) : Option[AllocAccruedInterestAmtField] = a match {
    case v: String => Some(AllocAccruedInterestAmtField(v))
    case v: Float => Some(AllocAccruedInterestAmtField(v))
    case v: Double => Some(AllocAccruedInterestAmtField(v.toFloat))
    case v: Int => Some(AllocAccruedInterestAmtField(v.toFloat))
    case v: AllocAccruedInterestAmtField => Some(v)
    case _ => scala.Option.empty[AllocAccruedInterestAmtField]
  } 
}