package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideField(override val value: String) extends SfFieldString(54, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(54)Side=(").append(value).append(")").append(SideField.fixDescriptionByValue.getOrElse(value,""))
}

object SideField {
  val TagId = 54 
  val Buy="1"
  val Sell="2"
  val BuyMinus="3"
  val SellPlus="4"
  val SellShort="5"
  val SellShortExempt="6"
  val Undisclosed="7"
  val Cross="8"
  val CrossShort="9"
  val CrossShortExempt="A"
  val AsDefined="B"
  val Opposite="C"
  val Subscribe="D"
  val Redeem="E"
  val Lend="F"
  val Borrow="G"
  lazy val fixDescriptionByValue = Map("1"->"BUY","2"->"SELL",
    "3"->"BUY_MINUS","4"->"SELL_PLUS","5"->"SELL_SHORT",
    "6"->"SELL_SHORT_EXEMPT","7"->"UNDISCLOSED","8"->"CROSS",
    "9"->"CROSS_SHORT","A"->"CROSS_SHORT_EXEMPT","B"->"AS_DEFINED",
    "C"->"OPPOSITE","D"->"SUBSCRIBE","E"->"REDEEM",
    "F"->"LEND","G"->"BORROW")
 
  def decode(a: Option[Any]) : Option[SideField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideField]
  }

  def decode(a: Any) : Option[SideField] = a match {
    case v: String => Some(SideField(v))
    case v: Char => Some(SideField(v.toString))
    case v: SideField => Some(v)
    case _ => scala.Option.empty[SideField]
  } 
}
