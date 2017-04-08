package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class BenchmarkCurveCurrencyField(override val value: String) extends SfFieldString(220, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(220)BenchmarkCurveCurrency=(").append(value).append(")")
}

object BenchmarkCurveCurrencyField {
  val TagId = 220  
  def decode(a: Option[Any]) : Option[BenchmarkCurveCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BenchmarkCurveCurrencyField]
  }

  def decode(a: Any) : Option[BenchmarkCurveCurrencyField] = a match {
    case v: String => Some(BenchmarkCurveCurrencyField(v))
    case v: BenchmarkCurveCurrencyField => Some(v)
    case _ => scala.Option.empty[BenchmarkCurveCurrencyField]
  } 
}
