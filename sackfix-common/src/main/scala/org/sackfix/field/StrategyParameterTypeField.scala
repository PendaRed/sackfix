package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class StrategyParameterTypeField(override val value: Int) extends SfFieldInt(959, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(959)StrategyParameterType=(").append(value).append(")").append(StrategyParameterTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object StrategyParameterTypeField {
  val TagId = 959 
  val Int=1
  val Length=2
  val Numingroup=3
  val Seqnum=4
  val Tagnum=5
  val Float=6
  val Qty=7
  val Price=8
  val Priceoffset=9
  val Amt=10
  val Percentage=11
  val Char=12
  val Boolean=13
  val String=14
  val Multiplecharvalue=15
  val Currency=16
  val Exchange=17
  val MonthYear=18
  val Utctimestamp=19
  val Utctimeonly=20
  val Localmkttime=21
  val Utcdate=22
  val Data=23
  val Multiplestringvalue=24
  lazy val fixDescriptionByValue = Map(1->"INT",2->"LENGTH",
    3->"NUMINGROUP",4->"SEQNUM",5->"TAGNUM",
    6->"FLOAT",7->"QTY",8->"PRICE",
    9->"PRICEOFFSET",10->"AMT",11->"PERCENTAGE",
    12->"CHAR",13->"BOOLEAN",14->"STRING",
    15->"MULTIPLECHARVALUE",16->"CURRENCY",17->"EXCHANGE",
    18->"MONTH_YEAR",19->"UTCTIMESTAMP",20->"UTCTIMEONLY",
    21->"LOCALMKTTIME",22->"UTCDATE",23->"DATA",
    24->"MULTIPLESTRINGVALUE")
 
  def apply(value: String) = try {
    new StrategyParameterTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StrategyParameterType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StrategyParameterTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrategyParameterTypeField]
  }

  def decode(a: Any) : Option[StrategyParameterTypeField] = a match {
    case v: String => Some(StrategyParameterTypeField(v))
    case v: Int => Some(StrategyParameterTypeField(v))
    case v: StrategyParameterTypeField => Some(v)
    case _ => scala.Option.empty[StrategyParameterTypeField]
  } 
}
