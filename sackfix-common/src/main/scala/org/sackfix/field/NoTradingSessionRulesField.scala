package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoTradingSessionRulesField(override val value: Int) extends SfNumInGroup(1309, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1309)NoTradingSessionRules=(").append(value).append(")")
}

object NoTradingSessionRulesField {
  val TagId = 1309  
  def apply(value: String) = try {
    new NoTradingSessionRulesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoTradingSessionRules("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoTradingSessionRulesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoTradingSessionRulesField]
  }

  def decode(a: Any) : Option[NoTradingSessionRulesField] = a match {
    case v: String => Some(NoTradingSessionRulesField(v))
    case v: Int => Some(NoTradingSessionRulesField(v))
    case v: NoTradingSessionRulesField => Some(v)
    case _ => scala.Option.empty[NoTradingSessionRulesField]
  } 
}
