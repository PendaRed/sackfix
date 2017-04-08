package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class LastLiquidityIndField(override val value: Int) extends SfFieldInt(851, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(851)LastLiquidityInd=(").append(value).append(")").append(LastLiquidityIndField.fixDescriptionByValue.getOrElse(value,""))
}

object LastLiquidityIndField {
  val TagId = 851 
  val AddedLiquidity=1
  val RemovedLiquidity=2
  val LiquidityRoutedOut=3
  lazy val fixDescriptionByValue = Map(1->"ADDED_LIQUIDITY",2->"REMOVED_LIQUIDITY",
    3->"LIQUIDITY_ROUTED_OUT")
 
  def apply(value: String) = try {
    new LastLiquidityIndField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastLiquidityInd("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastLiquidityIndField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastLiquidityIndField]
  }

  def decode(a: Any) : Option[LastLiquidityIndField] = a match {
    case v: String => Some(LastLiquidityIndField(v))
    case v: Int => Some(LastLiquidityIndField(v))
    case v: LastLiquidityIndField => Some(v)
    case _ => scala.Option.empty[LastLiquidityIndField]
  } 
}
