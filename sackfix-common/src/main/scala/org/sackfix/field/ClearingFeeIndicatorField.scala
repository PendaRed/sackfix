package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ClearingFeeIndicatorField(override val value: String) extends SfFieldString(635, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(635)ClearingFeeIndicator=(").append(value).append(")").append(ClearingFeeIndicatorField.fixDescriptionByValue.getOrElse(value,""))
}

object ClearingFeeIndicatorField {
  val TagId = 635 
  val CboeMember="B"
  val NonMemberAndCustomer="C"
  val EquityMemberAndClearingMember="E"
  val FullAndAssociateMemberTradingForOwnAccountAndAsFloorBrokers="F"
  val Firms106hAnd106j="H"
  val GimIdemAndComMembershipInterestHolders="I"
  val LesseeAnd106fEmployees="L"
  val AllOtherOwnershipTypes="M"
  val _1stYearDelegateTradingForOwnAccount="1"
  val _2ndYearDelegateTradingForOwnAccount="2"
  val _3rdYearDelegateTradingForOwnAccount="3"
  val _4thYearDelegateTradingForOwnAccount="4"
  val _5thYearDelegateTradingForOwnAccount="5"
  val _6thYearDelegateTradingForOwnAccount="9"
  lazy val fixDescriptionByValue = Map("B"->"CBOE_MEMBER","C"->"NON_MEMBER_AND_CUSTOMER",
    "E"->"EQUITY_MEMBER_AND_CLEARING_MEMBER","F"->"FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS","H"->"FIRMS_106H_AND_106J",
    "I"->"GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS","L"->"LESSEE_AND_106F_EMPLOYEES","M"->"ALL_OTHER_OWNERSHIP_TYPES",
    "1"->"_1ST_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT","2"->"_2ND_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT","3"->"_3RD_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT",
    "4"->"_4TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT","5"->"_5TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT","9"->"_6TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT")
 
  def decode(a: Option[Any]) : Option[ClearingFeeIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClearingFeeIndicatorField]
  }

  def decode(a: Any) : Option[ClearingFeeIndicatorField] = a match {
    case v: String => Some(ClearingFeeIndicatorField(v))
    case v: ClearingFeeIndicatorField => Some(v)
    case _ => scala.Option.empty[ClearingFeeIndicatorField]
  } 
}
