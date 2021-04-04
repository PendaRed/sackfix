package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class PosTypeField(override val value: String) extends SfFieldString(703, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(703)PosType=(").append(value).append(")").append(PosTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PosTypeField {
  val TagId = 703 
  val TransactionQuantity="TQ"
  val IntraSpreadQty="IAS"
  val InterSpreadQty="IES"
  val EndOfDayQty="FIN"
  val StartOfDayQty="SOD"
  val OptionExerciseQty="EX"
  val OptionAssignment="AS"
  val TransactionFromExercise="TX"
  val TransactionFromAssignment="TA"
  val PitTradeQty="PIT"
  val TransferTradeQty="TRF"
  val ElectronicTradeQty="ETR"
  val AllocationTradeQty="ALC"
  val AdjustmentQty="PA"
  val AsOfTradeQty="ASF"
  val DeliveryQty="DLV"
  val TotalTransactionQty="TOT"
  val CrossMarginQty="XM"
  val IntegralSplit="SPL"
  val ReceiveQuantity="RCV"
  val CorporateActionAdjustment="CAA"
  val DeliveryNoticeQty="DN"
  val ExchangeForPhysicalQty="EP"
  lazy val fixDescriptionByValue = Map("TQ"->"TRANSACTION_QUANTITY","IAS"->"INTRA_SPREAD_QTY",
    "IES"->"INTER_SPREAD_QTY","FIN"->"END_OF_DAY_QTY","SOD"->"START_OF_DAY_QTY",
    "EX"->"OPTION_EXERCISE_QTY","AS"->"OPTION_ASSIGNMENT","TX"->"TRANSACTION_FROM_EXERCISE",
    "TA"->"TRANSACTION_FROM_ASSIGNMENT","PIT"->"PIT_TRADE_QTY","TRF"->"TRANSFER_TRADE_QTY",
    "ETR"->"ELECTRONIC_TRADE_QTY","ALC"->"ALLOCATION_TRADE_QTY","PA"->"ADJUSTMENT_QTY",
    "ASF"->"AS_OF_TRADE_QTY","DLV"->"DELIVERY_QTY","TOT"->"TOTAL_TRANSACTION_QTY",
    "XM"->"CROSS_MARGIN_QTY","SPL"->"INTEGRAL_SPLIT","RCV"->"RECEIVE_QUANTITY",
    "CAA"->"CORPORATE_ACTION_ADJUSTMENT","DN"->"DELIVERY_NOTICE_QTY","EP"->"EXCHANGE_FOR_PHYSICAL_QTY")
 
  def decode(a: Option[Any]) : Option[PosTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosTypeField]
  }

  def decode(a: Any) : Option[PosTypeField] = a match {
    case v: String => Some(PosTypeField(v))
    case v: PosTypeField => Some(v)
    case _ => scala.Option.empty[PosTypeField]
  } 
}
