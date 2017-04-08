package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class MaturityMonthYearIncrementField(override val value: Int) extends SfFieldInt(1229, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1229)MaturityMonthYearIncrement=(").append(value).append(")")
}

object MaturityMonthYearIncrementField {
  val TagId = 1229  
  def apply(value: String) = try {
    new MaturityMonthYearIncrementField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MaturityMonthYearIncrement("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MaturityMonthYearIncrementField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MaturityMonthYearIncrementField]
  }

  def decode(a: Any) : Option[MaturityMonthYearIncrementField] = a match {
    case v: String => Some(MaturityMonthYearIncrementField(v))
    case v: Int => Some(MaturityMonthYearIncrementField(v))
    case v: MaturityMonthYearIncrementField => Some(v)
    case _ => scala.Option.empty[MaturityMonthYearIncrementField]
  } 
}
