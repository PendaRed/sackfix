package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class NumDaysInterestField(override val value: Int) extends SfFieldInt(157, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(157)NumDaysInterest=(").append(value).append(")")
}

object NumDaysInterestField {
  val TagId = 157  
  def apply(value: String) = try {
    new NumDaysInterestField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NumDaysInterest("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NumDaysInterestField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NumDaysInterestField]
  }

  def decode(a: Any) : Option[NumDaysInterestField] = a match {
    case v: String => Some(NumDaysInterestField(v))
    case v: Int => Some(NumDaysInterestField(v))
    case v: NumDaysInterestField => Some(v)
    case _ => scala.Option.empty[NumDaysInterestField]
  } 
}
