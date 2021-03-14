package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class PaymentRemitterIDField(override val value: String) extends SfFieldString(505, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(505)PaymentRemitterID=(").append(value).append(")")
}

object PaymentRemitterIDField {
  val TagId = 505  
  def decode(a: Option[Any]) : Option[PaymentRemitterIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PaymentRemitterIDField]
  }

  def decode(a: Any) : Option[PaymentRemitterIDField] = a match {
    case v: String => Some(PaymentRemitterIDField(v))
    case v: PaymentRemitterIDField => Some(v)
    case _ => scala.Option.empty[PaymentRemitterIDField]
  } 
}
