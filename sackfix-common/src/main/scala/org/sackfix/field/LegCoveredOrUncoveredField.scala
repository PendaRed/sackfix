package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class LegCoveredOrUncoveredField(override val value: Int) extends SfFieldInt(565, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(565)LegCoveredOrUncovered=(").append(value).append(")")
}

object LegCoveredOrUncoveredField {
  val TagId = 565  
  def apply(value: String) = try {
    new LegCoveredOrUncoveredField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegCoveredOrUncovered("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegCoveredOrUncoveredField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegCoveredOrUncoveredField]
  }

  def decode(a: Any) : Option[LegCoveredOrUncoveredField] = a match {
    case v: String => Some(LegCoveredOrUncoveredField(v))
    case v: Int => Some(LegCoveredOrUncoveredField(v))
    case v: LegCoveredOrUncoveredField => Some(v)
    case _ => scala.Option.empty[LegCoveredOrUncoveredField]
  } 
}
