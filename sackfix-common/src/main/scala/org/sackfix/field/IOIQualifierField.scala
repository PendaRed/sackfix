package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class IOIQualifierField(override val value: String) extends SfFieldString(104, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(104)IOIQualifier=(").append(value).append(")").append(IOIQualifierField.fixDescriptionByValue.getOrElse(value,""))
}

object IOIQualifierField {
  val TagId = 104 
  val AllOrNone="A"
  val MarketOnClose="B"
  val AtTheClose="C"
  val Vwap="D"
  val InTouchWith="I"
  val Limit="L"
  val MoreBehind="M"
  val AtTheOpen="O"
  val TakingAPosition="P"
  val AtTheMarket="Q"
  val ReadyToTrade="R"
  val PortfolioShown="S"
  val ThroughTheDay="T"
  val Versus="V"
  val IndicationWorkingAway="W"
  val CrossingOpportunity="X"
  val AtTheMidpoint="Y"
  val PreOpen="Z"
  lazy val fixDescriptionByValue = Map("A"->"ALL_OR_NONE","B"->"MARKET_ON_CLOSE",
    "C"->"AT_THE_CLOSE","D"->"VWAP","I"->"IN_TOUCH_WITH",
    "L"->"LIMIT","M"->"MORE_BEHIND","O"->"AT_THE_OPEN",
    "P"->"TAKING_A_POSITION","Q"->"AT_THE_MARKET","R"->"READY_TO_TRADE",
    "S"->"PORTFOLIO_SHOWN","T"->"THROUGH_THE_DAY","V"->"VERSUS",
    "W"->"INDICATION_WORKING_AWAY","X"->"CROSSING_OPPORTUNITY","Y"->"AT_THE_MIDPOINT",
    "Z"->"PRE_OPEN")
 
  def decode(a: Option[Any]) : Option[IOIQualifierField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IOIQualifierField]
  }

  def decode(a: Any) : Option[IOIQualifierField] = a match {
    case v: String => Some(IOIQualifierField(v))
    case v: Char => Some(IOIQualifierField(v.toString))
    case v: IOIQualifierField => Some(v)
    case _ => scala.Option.empty[IOIQualifierField]
  } 
}
