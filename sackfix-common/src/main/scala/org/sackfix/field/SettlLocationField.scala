package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SettlLocationField(override val value: String) extends SfFieldString(166, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(166)SettlLocation=(").append(value).append(")").append(SettlLocationField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlLocationField {
  val TagId = 166 
  val Cedel="CED"
  val DepositoryTrustCompany="DTC"
  val Euroclear="EUR"
  val FederalBookEntry="FED"
  val LocalMarketSettleLocation="ISO"
  val Physical="PNY"
  val ParticipantTrustCompany="PTC"
  lazy val fixDescriptionByValue = Map("CED"->"CEDEL","DTC"->"DEPOSITORY_TRUST_COMPANY",
    "EUR"->"EUROCLEAR","FED"->"FEDERAL_BOOK_ENTRY","ISO"->"LOCAL_MARKET_SETTLE_LOCATION",
    "PNY"->"PHYSICAL","PTC"->"PARTICIPANT_TRUST_COMPANY")
 
  def decode(a: Option[Any]) : Option[SettlLocationField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlLocationField]
  }

  def decode(a: Any) : Option[SettlLocationField] = a match {
    case v: String => Some(SettlLocationField(v))
    case v: SettlLocationField => Some(v)
    case _ => scala.Option.empty[SettlLocationField]
  } 
}
