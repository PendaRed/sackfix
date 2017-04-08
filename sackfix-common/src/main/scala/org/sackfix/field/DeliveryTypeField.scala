package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class DeliveryTypeField(override val value: Int) extends SfFieldInt(919, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(919)DeliveryType=(").append(value).append(")").append(DeliveryTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object DeliveryTypeField {
  val TagId = 919 
  val VersusPayment=0
  val Free=1
  val TriParty=2
  val HoldInCustody=3
  lazy val fixDescriptionByValue = Map(0->"VERSUS_PAYMENT",1->"FREE",
    2->"TRI_PARTY",3->"HOLD_IN_CUSTODY")
 
  def apply(value: String) = try {
    new DeliveryTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DeliveryType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DeliveryTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeliveryTypeField]
  }

  def decode(a: Any) : Option[DeliveryTypeField] = a match {
    case v: String => Some(DeliveryTypeField(v))
    case v: Int => Some(DeliveryTypeField(v))
    case v: DeliveryTypeField => Some(v)
    case _ => scala.Option.empty[DeliveryTypeField]
  } 
}