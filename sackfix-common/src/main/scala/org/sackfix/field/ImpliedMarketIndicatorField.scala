package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class ImpliedMarketIndicatorField(override val value: Int) extends SfFieldInt(1144, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1144)ImpliedMarketIndicator=(").append(value).append(")").append(ImpliedMarketIndicatorField.fixDescriptionByValue.getOrElse(value,""))
}

object ImpliedMarketIndicatorField {
  val TagId = 1144 
  val NotImplied=0
  val ImpliedInTheExistenceOfAMultiLegInstrumentIsImpliedByTheLegsOfThatInstrument=1
  val ImpliedOutTheExistenceOfTheUnderlyingLegsAreImpliedByTheMultiLegInstrument=2
  val BothImpliedInAndImpliedOut=3
  lazy val fixDescriptionByValue = Map(0->"NOT_IMPLIED",1->"IMPLIED_IN_THE_EXISTENCE_OF_A_MULTI_LEG_INSTRUMENT_IS_IMPLIED_BY_THE_LEGS_OF_THAT_INSTRUMENT",
    2->"IMPLIED_OUT_THE_EXISTENCE_OF_THE_UNDERLYING_LEGS_ARE_IMPLIED_BY_THE_MULTI_LEG_INSTRUMENT",3->"BOTH_IMPLIED_IN_AND_IMPLIED_OUT")
 
  def apply(value: String) = try {
    new ImpliedMarketIndicatorField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ImpliedMarketIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ImpliedMarketIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ImpliedMarketIndicatorField]
  }

  def decode(a: Any) : Option[ImpliedMarketIndicatorField] = a match {
    case v: String => Some(ImpliedMarketIndicatorField(v))
    case v: Int => Some(ImpliedMarketIndicatorField(v))
    case v: ImpliedMarketIndicatorField => Some(v)
    case _ => scala.Option.empty[ImpliedMarketIndicatorField]
  } 
}
