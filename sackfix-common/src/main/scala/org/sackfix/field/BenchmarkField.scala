package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class BenchmarkField(override val value: String) extends SfFieldString(219, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(219)Benchmark=(").append(value).append(")").append(BenchmarkField.fixDescriptionByValue.getOrElse(value,""))
}

object BenchmarkField {
  val TagId = 219 
  val Curve="1"
  val Fiveyr="2"
  val Old5="3"
  val Tenyr="4"
  val Old10="5"
  val Thirtyyr="6"
  val Old30="7"
  val Threemolibor="8"
  val Sixmolibor="9"
  lazy val fixDescriptionByValue = Map("1"->"CURVE","2"->"FIVEYR",
    "3"->"OLD5","4"->"TENYR","5"->"OLD10",
    "6"->"THIRTYYR","7"->"OLD30","8"->"THREEMOLIBOR",
    "9"->"SIXMOLIBOR")
 
  def decode(a: Option[Any]) : Option[BenchmarkField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BenchmarkField]
  }

  def decode(a: Any) : Option[BenchmarkField] = a match {
    case v: String => Some(BenchmarkField(v))
    case v: Char => Some(BenchmarkField(v.toString))
    case v: BenchmarkField => Some(v)
    case _ => scala.Option.empty[BenchmarkField]
  } 
}
