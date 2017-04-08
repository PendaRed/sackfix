package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExpirationCycleField(override val value: Int) extends SfFieldInt(827, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(827)ExpirationCycle=(").append(value).append(")").append(ExpirationCycleField.fixDescriptionByValue.getOrElse(value,""))
}

object ExpirationCycleField {
  val TagId = 827 
  val ExpireOnTradingSessionClose=0
  val ExpireOnTradingSessionOpen=1
  lazy val fixDescriptionByValue = Map(0->"EXPIRE_ON_TRADING_SESSION_CLOSE",1->"EXPIRE_ON_TRADING_SESSION_OPEN")
 
  def apply(value: String) = try {
    new ExpirationCycleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExpirationCycle("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExpirationCycleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExpirationCycleField]
  }

  def decode(a: Any) : Option[ExpirationCycleField] = a match {
    case v: String => Some(ExpirationCycleField(v))
    case v: Int => Some(ExpirationCycleField(v))
    case v: ExpirationCycleField => Some(v)
    case _ => scala.Option.empty[ExpirationCycleField]
  } 
}
