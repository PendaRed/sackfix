package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class BenchmarkCurvePointField(override val value: String) extends SfFieldString(222, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(222)BenchmarkCurvePoint=(").append(value).append(")")
}

object BenchmarkCurvePointField {
  val TagId = 222  
  def decode(a: Option[Any]) : Option[BenchmarkCurvePointField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BenchmarkCurvePointField]
  }

  def decode(a: Any) : Option[BenchmarkCurvePointField] = a match {
    case v: String => Some(BenchmarkCurvePointField(v))
    case v: BenchmarkCurvePointField => Some(v)
    case _ => scala.Option.empty[BenchmarkCurvePointField]
  } 
}
