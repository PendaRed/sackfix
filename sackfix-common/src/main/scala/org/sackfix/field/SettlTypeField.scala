package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class SettlTypeField(override val value: String) extends SfFieldString(63, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(63)SettlType=(").append(value).append(")").append(SettlTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SettlTypeField {
  val TagId = 63 
  val Regular="0"
  val Cash="1"
  val NextDay="2"
  val TPlus2="3"
  val TPlus3="4"
  val TPlus4="5"
  val Future="6"
  val WhenAndIfIssued="7"
  val SellersOption="8"
  val TPlus5="9"
  val FxSpotNextSettlement="C"
  val BrokenDate="B"
  lazy val fixDescriptionByValue = Map("0"->"REGULAR","1"->"CASH",
    "2"->"NEXT_DAY","3"->"T_PLUS_2","4"->"T_PLUS_3",
    "5"->"T_PLUS_4","6"->"FUTURE","7"->"WHEN_AND_IF_ISSUED",
    "8"->"SELLERS_OPTION","9"->"T_PLUS_5","C"->"FX_SPOT_NEXT_SETTLEMENT",
    "B"->"BROKEN_DATE")
 
  def decode(a: Option[Any]) : Option[SettlTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlTypeField]
  }

  def decode(a: Any) : Option[SettlTypeField] = a match {
    case v: String => Some(SettlTypeField(v))
    case v: SettlTypeField => Some(v)
    case _ => scala.Option.empty[SettlTypeField]
  } 
}
