package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class MatchTypeField(override val value: String) extends SfFieldString(574, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(574)MatchType=(").append(value).append(")").append(MatchTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object MatchTypeField {
  val TagId = 574 
  val OnePartyTradeReport="1"
  val TwoPartyTradeReport="2"
  val ConfirmedTradeReport="3"
  val AutoMatch="4"
  val CrossAuction="5"
  val CounterOrderSelection="6"
  val CallAuction="7"
  val ExactPlusFourBadgesAndExecutionTime="A1"
  val ExactPlusFourBadges="A2"
  val ExactPlusTwoBadgesAndExecutionTime="A3"
  val ExactPlusTwoBadges="A4"
  val ExactPlusExecutionTime="A5"
  val ActAcceptedTrade="M3"
  val ActDefaultTrade="M4"
  val ActDefaultAfterM2="M5"
  val ActM6Match="M6"
  val ComparedRecordsResultingFromStampedAdvisoriesOrSpecialistAcceptsPairOffs="AQ"
  val ExactMatchOnTradeDateStockSymbolQuantityPriceTradeTypeAndSpecialTradeIndicatorMinusBadgesAndTimesActM1Match="M1"
  val SummarizedMatchMinusBadgesAndTimesActM2Match="M2"
  val OcsLockedInNonAct="MT"
  val SummarizedMatchUsingA1ExactMatchCriteriaExceptQuantityIsSummaried="S1"
  val SummarizedMatchUsingA2ExactMatchCriteriaExceptQuantityIsSummarized="S2"
  val SummarizedMatchUsingA3ExactMatchCriteriaExceptQuantityIsSummarized="S3"
  val SummarizedMatchUsingA4ExactMatchCriteriaExceptQuantityIsSummarized="S4"
  val SummarizedMatchUsingA5ExactMatchCriteriaExceptQuantityIsSummarized="S5"
  val OnePartyPrivatelyNegotiatedTradeReport="60"
  val TwoPartyPrivatelyNegotiatedTradeReport="61"
  val ContinuousAutoMatch="62"
  val CrossAuction2="63"
  val CounterOrderSelection2="64"
  val CallAuction2="65"
  lazy val fixDescriptionByValue = Map("1"->"ONE_PARTY_TRADE_REPORT","2"->"TWO_PARTY_TRADE_REPORT",
    "3"->"CONFIRMED_TRADE_REPORT","4"->"AUTO_MATCH","5"->"CROSS_AUCTION",
    "6"->"COUNTER_ORDER_SELECTION","7"->"CALL_AUCTION","A1"->"EXACT_PLUS_FOUR_BADGES_AND_EXECUTION_TIME",
    "A2"->"EXACT_PLUS_FOUR_BADGES","A3"->"EXACT_PLUS_TWO_BADGES_AND_EXECUTION_TIME","A4"->"EXACT_PLUS_TWO_BADGES",
    "A5"->"EXACT_PLUS_EXECUTION_TIME","M3"->"ACT_ACCEPTED_TRADE","M4"->"ACT_DEFAULT_TRADE",
    "M5"->"ACT_DEFAULT_AFTER_M2","M6"->"ACT_M6_MATCH","AQ"->"COMPARED_RECORDS_RESULTING_FROM_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS_PAIR_OFFS",
    "M1"->"EXACT_MATCH_ON_TRADE_DATE_STOCK_SYMBOL_QUANTITY_PRICE_TRADE_TYPE_AND_SPECIAL_TRADE_INDICATOR_MINUS_BADGES_AND_TIMES_ACT_M1_MATCH","M2"->"SUMMARIZED_MATCH_MINUS_BADGES_AND_TIMES_ACT_M2_MATCH","MT"->"OCS_LOCKED_IN_NON_ACT",
    "S1"->"SUMMARIZED_MATCH_USING_A1_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIED","S2"->"SUMMARIZED_MATCH_USING_A2_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED","S3"->"SUMMARIZED_MATCH_USING_A3_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED",
    "S4"->"SUMMARIZED_MATCH_USING_A4_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED","S5"->"SUMMARIZED_MATCH_USING_A5_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED","60"->"ONE_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT",
    "61"->"TWO_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT","62"->"CONTINUOUS_AUTO_MATCH","63"->"CROSS_AUCTION2",
    "64"->"COUNTER_ORDER_SELECTION2","65"->"CALL_AUCTION2")
 
  def decode(a: Option[Any]) : Option[MatchTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MatchTypeField]
  }

  def decode(a: Any) : Option[MatchTypeField] = a match {
    case v: String => Some(MatchTypeField(v))
    case v: MatchTypeField => Some(v)
    case _ => scala.Option.empty[MatchTypeField]
  } 
}
