package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class ShortSaleReasonField(override val value: Int) extends SfFieldInt(853, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(853)ShortSaleReason=(").append(value).append(")").append(ShortSaleReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object ShortSaleReasonField {
  val TagId = 853 
  val DealerSoldShort=0
  val DealerSoldShortExempt=1
  val SellingCustomerSoldShort=2
  val SellingCustomerSoldShortExempt=3
  val QualifedServiceRepresentativeOrAutomaticGiveupContraSideSoldShort=4
  val QsrOrAguContraSideSoldShortExempt=5
  lazy val fixDescriptionByValue = Map(0->"DEALER_SOLD_SHORT",1->"DEALER_SOLD_SHORT_EXEMPT",
    2->"SELLING_CUSTOMER_SOLD_SHORT",3->"SELLING_CUSTOMER_SOLD_SHORT_EXEMPT",4->"QUALIFED_SERVICE_REPRESENTATIVE_OR_AUTOMATIC_GIVEUP_CONTRA_SIDE_SOLD_SHORT",
    5->"QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT")
 
  def apply(value: String) = try {
    new ShortSaleReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ShortSaleReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ShortSaleReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ShortSaleReasonField]
  }

  def decode(a: Any) : Option[ShortSaleReasonField] = a match {
    case v: String => Some(ShortSaleReasonField(v))
    case v: Int => Some(ShortSaleReasonField(v))
    case v: ShortSaleReasonField => Some(v)
    case _ => scala.Option.empty[ShortSaleReasonField]
  } 
}
