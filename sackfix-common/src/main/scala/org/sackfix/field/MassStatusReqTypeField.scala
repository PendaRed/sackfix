package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class MassStatusReqTypeField(override val value: Int) extends SfFieldInt(585, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(585)MassStatusReqType=(").append(value).append(")").append(MassStatusReqTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object MassStatusReqTypeField {
  val TagId = 585 
  val StatusForOrdersForASecurity=1
  val StatusForOrdersForAnUnderlyingSecurity=2
  val StatusForOrdersForAProduct=3
  val StatusForOrdersForACficode=4
  val StatusForOrdersForASecuritytype=5
  val StatusForOrdersForATradingSession=6
  val StatusForAllOrders=7
  val StatusForOrdersForAPartyid=8
  lazy val fixDescriptionByValue = Map(1->"STATUS_FOR_ORDERS_FOR_A_SECURITY",2->"STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY",
    3->"STATUS_FOR_ORDERS_FOR_A_PRODUCT",4->"STATUS_FOR_ORDERS_FOR_A_CFICODE",5->"STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE",
    6->"STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION",7->"STATUS_FOR_ALL_ORDERS",8->"STATUS_FOR_ORDERS_FOR_A_PARTYID")
 
  def apply(value: String) = try {
    new MassStatusReqTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MassStatusReqType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MassStatusReqTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MassStatusReqTypeField]
  }

  def decode(a: Any) : Option[MassStatusReqTypeField] = a match {
    case v: String => Some(MassStatusReqTypeField(v))
    case v: Int => Some(MassStatusReqTypeField(v))
    case v: MassStatusReqTypeField => Some(v)
    case _ => scala.Option.empty[MassStatusReqTypeField]
  } 
}
