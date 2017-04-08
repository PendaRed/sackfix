package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class CustomerOrFirmField(override val value: Int) extends SfFieldInt(204, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(204)CustomerOrFirm=(").append(value).append(")").append(CustomerOrFirmField.fixDescriptionByValue.getOrElse(value,""))
}

object CustomerOrFirmField {
  val TagId = 204 
  val Customer=0
  val Firm=1
  lazy val fixDescriptionByValue = Map(0->"CUSTOMER",1->"FIRM")
 
  def apply(value: String) = try {
    new CustomerOrFirmField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CustomerOrFirm("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CustomerOrFirmField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CustomerOrFirmField]
  }

  def decode(a: Any) : Option[CustomerOrFirmField] = a match {
    case v: String => Some(CustomerOrFirmField(v))
    case v: Int => Some(CustomerOrFirmField(v))
    case v: CustomerOrFirmField => Some(v)
    case _ => scala.Option.empty[CustomerOrFirmField]
  } 
}
