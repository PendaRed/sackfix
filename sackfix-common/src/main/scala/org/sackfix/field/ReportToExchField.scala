package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170521
  */
case class ReportToExchField(override val value: Boolean) extends SfFieldBoolean(113, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(113)ReportToExch=(").append({if (value) "Y" else "N"}).append(")")
}

object ReportToExchField {
  val TagId = 113  
  def apply(value: String) = try {
    new ReportToExchField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("ReportToExch.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ReportToExch("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ReportToExchField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ReportToExchField]
  }

  def decode(a: Any) : Option[ReportToExchField] = a match {
    case v: String => Some(ReportToExchField(v))
    case v: Boolean => Some(ReportToExchField(v))
    case v: ReportToExchField => Some(v)
    case _ => scala.Option.empty[ReportToExchField]
  } 
}
