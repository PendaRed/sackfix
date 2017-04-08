package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class OpenCloseSettlFlagField(override val value: String) extends SfFieldString(286, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(286)OpenCloseSettlFlag=(").append(value).append(")").append(OpenCloseSettlFlagField.fixDescriptionByValue.getOrElse(value,""))
}

object OpenCloseSettlFlagField {
  val TagId = 286 
  val DailyOpenCloseSettlementEntry="0"
  val SessionOpenCloseSettlementEntry="1"
  val DeliverySettlementEntry="2"
  val ExpectedEntry="3"
  val EntryFromPreviousBusinessDay="4"
  val TheoreticalPriceValue="5"
  lazy val fixDescriptionByValue = Map("0"->"DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY","1"->"SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY",
    "2"->"DELIVERY_SETTLEMENT_ENTRY","3"->"EXPECTED_ENTRY","4"->"ENTRY_FROM_PREVIOUS_BUSINESS_DAY",
    "5"->"THEORETICAL_PRICE_VALUE")
 
  def decode(a: Option[Any]) : Option[OpenCloseSettlFlagField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OpenCloseSettlFlagField]
  }

  def decode(a: Any) : Option[OpenCloseSettlFlagField] = a match {
    case v: String => Some(OpenCloseSettlFlagField(v))
    case v: OpenCloseSettlFlagField => Some(v)
    case _ => scala.Option.empty[OpenCloseSettlFlagField]
  } 
}
