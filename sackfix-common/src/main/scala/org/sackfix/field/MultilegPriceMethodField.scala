package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class MultilegPriceMethodField(override val value: Int) extends SfFieldInt(1378, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1378)MultilegPriceMethod=(").append(value).append(")").append(MultilegPriceMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object MultilegPriceMethodField {
  val TagId = 1378 
  val NetPrice=0
  val ReversedNetPrice=1
  val YieldDifference=2
  val Individual=3
  val ContractWeightedAveragePrice=4
  val MultipliedPrice=5
  lazy val fixDescriptionByValue = Map(0->"NET_PRICE",1->"REVERSED_NET_PRICE",
    2->"YIELD_DIFFERENCE",3->"INDIVIDUAL",4->"CONTRACT_WEIGHTED_AVERAGE_PRICE",
    5->"MULTIPLIED_PRICE")
 
  def apply(value: String) = try {
    new MultilegPriceMethodField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MultilegPriceMethod("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MultilegPriceMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MultilegPriceMethodField]
  }

  def decode(a: Any) : Option[MultilegPriceMethodField] = a match {
    case v: String => Some(MultilegPriceMethodField(v))
    case v: Int => Some(MultilegPriceMethodField(v))
    case v: MultilegPriceMethodField => Some(v)
    case _ => scala.Option.empty[MultilegPriceMethodField]
  } 
}
