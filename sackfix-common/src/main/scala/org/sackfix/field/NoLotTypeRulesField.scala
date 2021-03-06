package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoLotTypeRulesField(override val value: Int) extends SfNumInGroup(1234, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1234)NoLotTypeRules=(").append(value).append(")")
}

object NoLotTypeRulesField {
  val TagId = 1234  
  def apply(value: String) = try {
    new NoLotTypeRulesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoLotTypeRules("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoLotTypeRulesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoLotTypeRulesField]
  }

  def decode(a: Any) : Option[NoLotTypeRulesField] = a match {
    case v: String => Some(NoLotTypeRulesField(v))
    case v: Int => Some(NoLotTypeRulesField(v))
    case v: NoLotTypeRulesField => Some(v)
    case _ => scala.Option.empty[NoLotTypeRulesField]
  } 
}
