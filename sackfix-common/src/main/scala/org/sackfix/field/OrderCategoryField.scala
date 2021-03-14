package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class OrderCategoryField(override val value: String) extends SfFieldString(1115, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1115)OrderCategory=(").append(value).append(")").append(OrderCategoryField.fixDescriptionByValue.getOrElse(value,""))
}

object OrderCategoryField {
  val TagId = 1115 
  val Order="1"
  val Quote="2"
  val PrivatelyNegotiatedTrade="3"
  val MultilegOrder="4"
  val LinkedOrder="5"
  val QuoteRequest="6"
  val ImpliedOrder="7"
  val CrossOrder="8"
  lazy val fixDescriptionByValue = Map("1"->"ORDER","2"->"QUOTE",
    "3"->"PRIVATELY_NEGOTIATED_TRADE","4"->"MULTILEG_ORDER","5"->"LINKED_ORDER",
    "6"->"QUOTE_REQUEST","7"->"IMPLIED_ORDER","8"->"CROSS_ORDER")
 
  def decode(a: Option[Any]) : Option[OrderCategoryField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrderCategoryField]
  }

  def decode(a: Any) : Option[OrderCategoryField] = a match {
    case v: String => Some(OrderCategoryField(v))
    case v: Char => Some(OrderCategoryField(v.toString))
    case v: OrderCategoryField => Some(v)
    case _ => scala.Option.empty[OrderCategoryField]
  } 
}
