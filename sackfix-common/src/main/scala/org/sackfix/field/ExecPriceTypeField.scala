package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class ExecPriceTypeField(override val value: String) extends SfFieldString(484, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(484)ExecPriceType=(").append(value).append(")").append(ExecPriceTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ExecPriceTypeField {
  val TagId = 484 
  val BidPrice="B"
  val CreationPrice="C"
  val CreationPricePlusAdjustmentPercent="D"
  val CreationPricePlusAdjustmentAmount="E"
  val OfferPrice="O"
  val OfferPriceMinusAdjustmentPercent="P"
  val OfferPriceMinusAdjustmentAmount="Q"
  val SinglePrice="S"
  lazy val fixDescriptionByValue = Map("B"->"BID_PRICE","C"->"CREATION_PRICE",
    "D"->"CREATION_PRICE_PLUS_ADJUSTMENT_PERCENT","E"->"CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT","O"->"OFFER_PRICE",
    "P"->"OFFER_PRICE_MINUS_ADJUSTMENT_PERCENT","Q"->"OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT","S"->"SINGLE_PRICE")
 
  def decode(a: Option[Any]) : Option[ExecPriceTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExecPriceTypeField]
  }

  def decode(a: Any) : Option[ExecPriceTypeField] = a match {
    case v: String => Some(ExecPriceTypeField(v))
    case v: Char => Some(ExecPriceTypeField(v.toString))
    case v: ExecPriceTypeField => Some(v)
    case _ => scala.Option.empty[ExecPriceTypeField]
  } 
}
