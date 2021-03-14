package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class QuotePriceTypeField(override val value: Int) extends SfFieldInt(692, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(692)QuotePriceType=(").append(value).append(")").append(QuotePriceTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object QuotePriceTypeField {
  val TagId = 692 
  val Percent=1
  val PerShare=2
  val FixedAmount=3
  val Discount=4
  val Premium=5
  val BasisPointsRelativeToBenchmark=6
  val TedPrice=7
  val TedYield=8
  val YieldSpread=9
  val Yield=10
  lazy val fixDescriptionByValue = Map(1->"PERCENT",2->"PER_SHARE",
    3->"FIXED_AMOUNT",4->"DISCOUNT",5->"PREMIUM",
    6->"BASIS_POINTS_RELATIVE_TO_BENCHMARK",7->"TED_PRICE",8->"TED_YIELD",
    9->"YIELD_SPREAD",10->"YIELD")
 
  def apply(value: String) = try {
    new QuotePriceTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuotePriceType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuotePriceTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuotePriceTypeField]
  }

  def decode(a: Any) : Option[QuotePriceTypeField] = a match {
    case v: String => Some(QuotePriceTypeField(v))
    case v: Int => Some(QuotePriceTypeField(v))
    case v: QuotePriceTypeField => Some(v)
    case _ => scala.Option.empty[QuotePriceTypeField]
  } 
}
