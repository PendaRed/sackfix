package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class AvgPxIndicatorField(override val value: Int) extends SfFieldInt(819, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(819)AvgPxIndicator=(").append(value).append(")").append(AvgPxIndicatorField.fixDescriptionByValue.getOrElse(value,""))
}

object AvgPxIndicatorField {
  val TagId = 819 
  val NoAveragePricing=0
  val TradeIsPartOfAnAveragePriceGroupIdentifiedByTheTradelinkid=1
  val LastTradeInTheAveragePriceGroupIdentifiedByTheTradelinkid=2
  lazy val fixDescriptionByValue = Map(0->"NO_AVERAGE_PRICING",1->"TRADE_IS_PART_OF_AN_AVERAGE_PRICE_GROUP_IDENTIFIED_BY_THE_TRADELINKID",
    2->"LAST_TRADE_IN_THE_AVERAGE_PRICE_GROUP_IDENTIFIED_BY_THE_TRADELINKID")
 
  def apply(value: String) = try {
    new AvgPxIndicatorField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AvgPxIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AvgPxIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AvgPxIndicatorField]
  }

  def decode(a: Any) : Option[AvgPxIndicatorField] = a match {
    case v: String => Some(AvgPxIndicatorField(v))
    case v: Int => Some(AvgPxIndicatorField(v))
    case v: AvgPxIndicatorField => Some(v)
    case _ => scala.Option.empty[AvgPxIndicatorField]
  } 
}
