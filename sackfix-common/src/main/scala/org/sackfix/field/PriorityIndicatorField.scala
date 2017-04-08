package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class PriorityIndicatorField(override val value: Int) extends SfFieldInt(638, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(638)PriorityIndicator=(").append(value).append(")").append(PriorityIndicatorField.fixDescriptionByValue.getOrElse(value,""))
}

object PriorityIndicatorField {
  val TagId = 638 
  val PriorityUnchanged=0
  val LostPriorityAsResultOfOrderChange=1
  lazy val fixDescriptionByValue = Map(0->"PRIORITY_UNCHANGED",1->"LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE")
 
  def apply(value: String) = try {
    new PriorityIndicatorField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PriorityIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PriorityIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriorityIndicatorField]
  }

  def decode(a: Any) : Option[PriorityIndicatorField] = a match {
    case v: String => Some(PriorityIndicatorField(v))
    case v: Int => Some(PriorityIndicatorField(v))
    case v: PriorityIndicatorField => Some(v)
    case _ => scala.Option.empty[PriorityIndicatorField]
  } 
}
