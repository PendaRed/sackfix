package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoTradingSessionsField(override val value: Int) extends SfNumInGroup(386, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(386)NoTradingSessions=(").append(value).append(")")
}

object NoTradingSessionsField {
  val TagId = 386  
  def apply(value: String) = try {
    new NoTradingSessionsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoTradingSessions("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoTradingSessionsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoTradingSessionsField]
  }

  def decode(a: Any) : Option[NoTradingSessionsField] = a match {
    case v: String => Some(NoTradingSessionsField(v))
    case v: Int => Some(NoTradingSessionsField(v))
    case v: NoTradingSessionsField => Some(v)
    case _ => scala.Option.empty[NoTradingSessionsField]
  } 
}
