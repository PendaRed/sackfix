package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class YieldTypeField(override val value: String) extends SfFieldString(235, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(235)YieldType=(").append(value).append(")").append(YieldTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object YieldTypeField {
  val TagId = 235 
  val AfterTaxYield="AFTERTAX"
  val AnnualYield="ANNUAL"
  val YieldAtIssue="ATISSUE"
  val YieldToAverageMaturity="AVGMATURITY"
  val BookYield="BOOK"
  val YieldToNextCall="CALL"
  val YieldChangeSinceClose="CHANGE"
  val ClosingYield="CLOSE"
  val CompoundYield="COMPOUND"
  val CurrentYield="CURRENT"
  val GovernmentEquivalentYield="GOVTEQUIV"
  val TrueGrossYield="GROSS"
  val YieldWithInflationAssumption="INFLATION"
  val InverseFloaterBondYield="INVERSEFLOATER"
  val MostRecentClosingYield="LASTCLOSE"
  val ClosingYieldMostRecentMonth="LASTMONTH"
  val ClosingYieldMostRecentQuarter="LASTQUARTER"
  val ClosingYieldMostRecentYear="LASTYEAR"
  val YieldToLongestAverageLife="LONGAVGLIFE"
  val MarkToMarketYield="MARK"
  val YieldToMaturity="MATURITY"
  val YieldToNextRefund="NEXTREFUND"
  val OpenAverageYield="OPENAVG"
  val PreviousCloseYield="PREVCLOSE"
  val ProceedsYield="PROCEEDS"
  val YieldToNextPut="PUT"
  val SemiAnnualYield="SEMIANNUAL"
  val YieldToShortestAverageLife="SHORTAVGLIFE"
  val SimpleYield="SIMPLE"
  val TaxEquivalentYield="TAXEQUIV"
  val YieldToTenderDate="TENDER"
  val TrueYield="TRUE"
  val YieldValueOf132="VALUE1_32"
  val YieldToWorst="WORST"
  lazy val fixDescriptionByValue = Map("AFTERTAX"->"AFTER_TAX_YIELD","ANNUAL"->"ANNUAL_YIELD",
    "ATISSUE"->"YIELD_AT_ISSUE","AVGMATURITY"->"YIELD_TO_AVERAGE_MATURITY","BOOK"->"BOOK_YIELD",
    "CALL"->"YIELD_TO_NEXT_CALL","CHANGE"->"YIELD_CHANGE_SINCE_CLOSE","CLOSE"->"CLOSING_YIELD",
    "COMPOUND"->"COMPOUND_YIELD","CURRENT"->"CURRENT_YIELD","GOVTEQUIV"->"GOVERNMENT_EQUIVALENT_YIELD",
    "GROSS"->"TRUE_GROSS_YIELD","INFLATION"->"YIELD_WITH_INFLATION_ASSUMPTION","INVERSEFLOATER"->"INVERSE_FLOATER_BOND_YIELD",
    "LASTCLOSE"->"MOST_RECENT_CLOSING_YIELD","LASTMONTH"->"CLOSING_YIELD_MOST_RECENT_MONTH","LASTQUARTER"->"CLOSING_YIELD_MOST_RECENT_QUARTER",
    "LASTYEAR"->"CLOSING_YIELD_MOST_RECENT_YEAR","LONGAVGLIFE"->"YIELD_TO_LONGEST_AVERAGE_LIFE","MARK"->"MARK_TO_MARKET_YIELD",
    "MATURITY"->"YIELD_TO_MATURITY","NEXTREFUND"->"YIELD_TO_NEXT_REFUND","OPENAVG"->"OPEN_AVERAGE_YIELD",
    "PREVCLOSE"->"PREVIOUS_CLOSE_YIELD","PROCEEDS"->"PROCEEDS_YIELD","PUT"->"YIELD_TO_NEXT_PUT",
    "SEMIANNUAL"->"SEMI_ANNUAL_YIELD","SHORTAVGLIFE"->"YIELD_TO_SHORTEST_AVERAGE_LIFE","SIMPLE"->"SIMPLE_YIELD",
    "TAXEQUIV"->"TAX_EQUIVALENT_YIELD","TENDER"->"YIELD_TO_TENDER_DATE","TRUE"->"TRUE_YIELD",
    "VALUE1_32"->"YIELD_VALUE_OF_1_32","WORST"->"YIELD_TO_WORST")
 
  def decode(a: Option[Any]) : Option[YieldTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[YieldTypeField]
  }

  def decode(a: Any) : Option[YieldTypeField] = a match {
    case v: String => Some(YieldTypeField(v))
    case v: YieldTypeField => Some(v)
    case _ => scala.Option.empty[YieldTypeField]
  } 
}
