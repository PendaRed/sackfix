package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class MsgTypeField(override val value: String) extends SfFieldString(35, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(35)MsgType=(").append(value).append(")").append(MsgTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object MsgTypeField {
  val TagId = 35 
  val Heartbeat="0"
  val TestRequest="1"
  val ResendRequest="2"
  val Reject="3"
  val SequenceReset="4"
  val Logout="5"
  val IndicationOfInterest="6"
  val Advertisement="7"
  val ExecutionReport="8"
  val OrderCancelReject="9"
  val Logon="A"
  val News="B"
  val Email="C"
  val OrderSingle="D"
  val OrderList="E"
  val OrderCancelRequest="F"
  val OrderCancelReplaceRequest="G"
  val OrderStatusRequest="H"
  val AllocationInstruction="J"
  val ListCancelRequest="K"
  val ListExecute="L"
  val ListStatusRequest="M"
  val ListStatus="N"
  val AllocationInstructionAck="P"
  val DontKnowTrade="Q"
  val QuoteRequest="R"
  val Quote="S"
  val SettlementInstructions="T"
  val MarketDataRequest="V"
  val MarketDataSnapshotFullRefresh="W"
  val MarketDataIncrementalRefresh="X"
  val MarketDataRequestReject="Y"
  val QuoteCancel="Z"
  val QuoteStatusRequest="a"
  val MassQuoteAcknowledgement="b"
  val SecurityDefinitionRequest="c"
  val SecurityDefinition="d"
  val SecurityStatusRequest="e"
  val SecurityStatus="f"
  val TradingSessionStatusRequest="g"
  val TradingSessionStatus="h"
  val MassQuote="i"
  val BusinessMessageReject="j"
  val BidRequest="k"
  val BidResponse="l"
  val ListStrikePrice="m"
  val XmlMessage="n"
  val RegistrationInstructions="o"
  val RegistrationInstructionsResponse="p"
  val OrderMassCancelRequest="q"
  val OrderMassCancelReport="r"
  val NewOrderCross="s"
  val CrossOrderCancelReplaceRequest="t"
  val CrossOrderCancelRequest="u"
  val SecurityTypeRequest="v"
  val SecurityTypes="w"
  val SecurityListRequest="x"
  val SecurityList="y"
  val DerivativeSecurityListRequest="z"
  val DerivativeSecurityList="AA"
  val NewOrderMultileg="AB"
  val MultilegOrderCancelReplace="AC"
  val TradeCaptureReportRequest="AD"
  val TradeCaptureReport="AE"
  val OrderMassStatusRequest="AF"
  val QuoteRequestReject="AG"
  val RfqRequest="AH"
  val QuoteStatusReport="AI"
  val QuoteResponse="AJ"
  val Confirmation="AK"
  val PositionMaintenanceRequest="AL"
  val PositionMaintenanceReport="AM"
  val RequestForPositions="AN"
  val RequestForPositionsAck="AO"
  val PositionReport="AP"
  val TradeCaptureReportRequestAck="AQ"
  val TradeCaptureReportAck="AR"
  val AllocationReport="AS"
  val AllocationReportAck="AT"
  val ConfirmationAck="AU"
  val SettlementInstructionRequest="AV"
  val AssignmentReport="AW"
  val CollateralRequest="AX"
  val CollateralAssignment="AY"
  val CollateralResponse="AZ"
  val CollateralReport="BA"
  val CollateralInquiry="BB"
  val NetworkStatusRequest="BC"
  val NetworkStatusResponse="BD"
  val UserRequest="BE"
  val UserResponse="BF"
  val CollateralInquiryAck="BG"
  val ConfirmationRequest="BH"
  val TradingSessionListRequest="BI"
  val TradingSessionList="BJ"
  val SecurityListUpdateReport="BK"
  val AdjustedPositionReport="BL"
  val AllocationInstructionAlert="BM"
  val ExecutionAcknowledgement="BN"
  val ContraryIntentionReport="BO"
  val SecurityDefinitionUpdateReport="BP"
  lazy val fixDescriptionByValue = Map("0"->"HEARTBEAT","1"->"TEST_REQUEST",
    "2"->"RESEND_REQUEST","3"->"REJECT","4"->"SEQUENCE_RESET",
    "5"->"LOGOUT","6"->"INDICATION_OF_INTEREST","7"->"ADVERTISEMENT",
    "8"->"EXECUTION_REPORT","9"->"ORDER_CANCEL_REJECT","A"->"LOGON",
    "B"->"NEWS","C"->"EMAIL","D"->"ORDER_SINGLE",
    "E"->"ORDER_LIST","F"->"ORDER_CANCEL_REQUEST","G"->"ORDER_CANCEL_REPLACE_REQUEST",
    "H"->"ORDER_STATUS_REQUEST","J"->"ALLOCATION_INSTRUCTION","K"->"LIST_CANCEL_REQUEST",
    "L"->"LIST_EXECUTE","M"->"LIST_STATUS_REQUEST","N"->"LIST_STATUS",
    "P"->"ALLOCATION_INSTRUCTION_ACK","Q"->"DONT_KNOW_TRADE","R"->"QUOTE_REQUEST",
    "S"->"QUOTE","T"->"SETTLEMENT_INSTRUCTIONS","V"->"MARKET_DATA_REQUEST",
    "W"->"MARKET_DATA_SNAPSHOT_FULL_REFRESH","X"->"MARKET_DATA_INCREMENTAL_REFRESH","Y"->"MARKET_DATA_REQUEST_REJECT",
    "Z"->"QUOTE_CANCEL","a"->"QUOTE_STATUS_REQUEST","b"->"MASS_QUOTE_ACKNOWLEDGEMENT",
    "c"->"SECURITY_DEFINITION_REQUEST","d"->"SECURITY_DEFINITION","e"->"SECURITY_STATUS_REQUEST",
    "f"->"SECURITY_STATUS","g"->"TRADING_SESSION_STATUS_REQUEST","h"->"TRADING_SESSION_STATUS",
    "i"->"MASS_QUOTE","j"->"BUSINESS_MESSAGE_REJECT","k"->"BID_REQUEST",
    "l"->"BID_RESPONSE","m"->"LIST_STRIKE_PRICE","n"->"XML_MESSAGE",
    "o"->"REGISTRATION_INSTRUCTIONS","p"->"REGISTRATION_INSTRUCTIONS_RESPONSE","q"->"ORDER_MASS_CANCEL_REQUEST",
    "r"->"ORDER_MASS_CANCEL_REPORT","s"->"NEW_ORDER_CROSS","t"->"CROSS_ORDER_CANCEL_REPLACE_REQUEST",
    "u"->"CROSS_ORDER_CANCEL_REQUEST","v"->"SECURITY_TYPE_REQUEST","w"->"SECURITY_TYPES",
    "x"->"SECURITY_LIST_REQUEST","y"->"SECURITY_LIST","z"->"DERIVATIVE_SECURITY_LIST_REQUEST",
    "AA"->"DERIVATIVE_SECURITY_LIST","AB"->"NEW_ORDER_MULTILEG","AC"->"MULTILEG_ORDER_CANCEL_REPLACE",
    "AD"->"TRADE_CAPTURE_REPORT_REQUEST","AE"->"TRADE_CAPTURE_REPORT","AF"->"ORDER_MASS_STATUS_REQUEST",
    "AG"->"QUOTE_REQUEST_REJECT","AH"->"RFQ_REQUEST","AI"->"QUOTE_STATUS_REPORT",
    "AJ"->"QUOTE_RESPONSE","AK"->"CONFIRMATION","AL"->"POSITION_MAINTENANCE_REQUEST",
    "AM"->"POSITION_MAINTENANCE_REPORT","AN"->"REQUEST_FOR_POSITIONS","AO"->"REQUEST_FOR_POSITIONS_ACK",
    "AP"->"POSITION_REPORT","AQ"->"TRADE_CAPTURE_REPORT_REQUEST_ACK","AR"->"TRADE_CAPTURE_REPORT_ACK",
    "AS"->"ALLOCATION_REPORT","AT"->"ALLOCATION_REPORT_ACK","AU"->"CONFIRMATION_ACK",
    "AV"->"SETTLEMENT_INSTRUCTION_REQUEST","AW"->"ASSIGNMENT_REPORT","AX"->"COLLATERAL_REQUEST",
    "AY"->"COLLATERAL_ASSIGNMENT","AZ"->"COLLATERAL_RESPONSE","BA"->"COLLATERAL_REPORT",
    "BB"->"COLLATERAL_INQUIRY","BC"->"NETWORK_STATUS_REQUEST","BD"->"NETWORK_STATUS_RESPONSE",
    "BE"->"USER_REQUEST","BF"->"USER_RESPONSE","BG"->"COLLATERAL_INQUIRY_ACK",
    "BH"->"CONFIRMATION_REQUEST","BI"->"TRADING_SESSION_LIST_REQUEST","BJ"->"TRADING_SESSION_LIST",
    "BK"->"SECURITY_LIST_UPDATE_REPORT","BL"->"ADJUSTED_POSITION_REPORT","BM"->"ALLOCATION_INSTRUCTION_ALERT",
    "BN"->"EXECUTION_ACKNOWLEDGEMENT","BO"->"CONTRARY_INTENTION_REPORT","BP"->"SECURITY_DEFINITION_UPDATE_REPORT")
 
  def decode(a: Option[Any]) : Option[MsgTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MsgTypeField]
  }

  def decode(a: Any) : Option[MsgTypeField] = a match {
    case v: String => Some(MsgTypeField(v))
    case v: MsgTypeField => Some(v)
    case _ => scala.Option.empty[MsgTypeField]
  } 
}
