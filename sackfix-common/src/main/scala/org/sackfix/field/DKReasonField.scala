package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class DKReasonField(override val value: String) extends SfFieldString(127, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(127)DKReason=(").append(value).append(")").append(DKReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object DKReasonField {
  val TagId = 127 
  val UnknownSymbol="A"
  val WrongSide="B"
  val QuantityExceedsOrder="C"
  val NoMatchingOrder="D"
  val PriceExceedsLimit="E"
  val CalculationDifference="F"
  val Other="Z"
  lazy val fixDescriptionByValue = Map("A"->"UNKNOWN_SYMBOL","B"->"WRONG_SIDE",
    "C"->"QUANTITY_EXCEEDS_ORDER","D"->"NO_MATCHING_ORDER","E"->"PRICE_EXCEEDS_LIMIT",
    "F"->"CALCULATION_DIFFERENCE","Z"->"OTHER")
 
  def decode(a: Option[Any]) : Option[DKReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DKReasonField]
  }

  def decode(a: Any) : Option[DKReasonField] = a match {
    case v: String => Some(DKReasonField(v))
    case v: Char => Some(DKReasonField(v.toString))
    case v: DKReasonField => Some(v)
    case _ => scala.Option.empty[DKReasonField]
  } 
}
