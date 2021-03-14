package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class DistribPaymentMethodField(override val value: Int) extends SfFieldInt(477, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(477)DistribPaymentMethod=(").append(value).append(")").append(DistribPaymentMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object DistribPaymentMethodField {
  val TagId = 477 
  val Crest=1
  val Nscc=2
  val Euroclear=3
  val Clearstream=4
  val Cheque=5
  val TelegraphicTransfer=6
  val Fedwire=7
  val DirectCredit=8
  val AchCredit=9
  val Bpay=10
  val HighValueClearingSystemHvacs=11
  val ReinvestInFund=12
  lazy val fixDescriptionByValue = Map(1->"CREST",2->"NSCC",
    3->"EUROCLEAR",4->"CLEARSTREAM",5->"CHEQUE",
    6->"TELEGRAPHIC_TRANSFER",7->"FEDWIRE",8->"DIRECT_CREDIT",
    9->"ACH_CREDIT",10->"BPAY",11->"HIGH_VALUE_CLEARING_SYSTEM_HVACS",
    12->"REINVEST_IN_FUND")
 
  def apply(value: String) = try {
    new DistribPaymentMethodField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DistribPaymentMethod("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DistribPaymentMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DistribPaymentMethodField]
  }

  def decode(a: Any) : Option[DistribPaymentMethodField] = a match {
    case v: String => Some(DistribPaymentMethodField(v))
    case v: Int => Some(DistribPaymentMethodField(v))
    case v: DistribPaymentMethodField => Some(v)
    case _ => scala.Option.empty[DistribPaymentMethodField]
  } 
}
