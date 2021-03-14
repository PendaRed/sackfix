package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoOrdTypeRulesField(override val value: Int) extends SfNumInGroup(1237, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1237)NoOrdTypeRules=(").append(value).append(")")
}

object NoOrdTypeRulesField {
  val TagId = 1237  
  def apply(value: String) = try {
    new NoOrdTypeRulesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoOrdTypeRules("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoOrdTypeRulesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoOrdTypeRulesField]
  }

  def decode(a: Any) : Option[NoOrdTypeRulesField] = a match {
    case v: String => Some(NoOrdTypeRulesField(v))
    case v: Int => Some(NoOrdTypeRulesField(v))
    case v: NoOrdTypeRulesField => Some(v)
    case _ => scala.Option.empty[NoOrdTypeRulesField]
  } 
}
