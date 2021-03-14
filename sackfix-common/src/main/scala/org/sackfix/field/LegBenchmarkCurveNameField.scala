package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class LegBenchmarkCurveNameField(override val value: String) extends SfFieldString(677, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(677)LegBenchmarkCurveName=(").append(value).append(")")
}

object LegBenchmarkCurveNameField {
  val TagId = 677  
  def decode(a: Option[Any]) : Option[LegBenchmarkCurveNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegBenchmarkCurveNameField]
  }

  def decode(a: Any) : Option[LegBenchmarkCurveNameField] = a match {
    case v: String => Some(LegBenchmarkCurveNameField(v))
    case v: LegBenchmarkCurveNameField => Some(v)
    case _ => scala.Option.empty[LegBenchmarkCurveNameField]
  } 
}
