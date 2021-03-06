package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class IncTaxIndField(override val value: Int) extends SfFieldInt(416, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(416)IncTaxInd=(").append(value).append(")").append(IncTaxIndField.fixDescriptionByValue.getOrElse(value,""))
}

object IncTaxIndField {
  val TagId = 416 
  val Net=1
  val Gross=2
  lazy val fixDescriptionByValue = Map(1->"NET",2->"GROSS")
 
  def apply(value: String) = try {
    new IncTaxIndField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new IncTaxInd("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[IncTaxIndField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IncTaxIndField]
  }

  def decode(a: Any) : Option[IncTaxIndField] = a match {
    case v: String => Some(IncTaxIndField(v))
    case v: Int => Some(IncTaxIndField(v))
    case v: IncTaxIndField => Some(v)
    case _ => scala.Option.empty[IncTaxIndField]
  } 
}
