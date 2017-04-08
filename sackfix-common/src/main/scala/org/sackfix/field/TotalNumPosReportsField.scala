package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class TotalNumPosReportsField(override val value: Int) extends SfFieldInt(727, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(727)TotalNumPosReports=(").append(value).append(")")
}

object TotalNumPosReportsField {
  val TagId = 727  
  def apply(value: String) = try {
    new TotalNumPosReportsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotalNumPosReports("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotalNumPosReportsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotalNumPosReportsField]
  }

  def decode(a: Any) : Option[TotalNumPosReportsField] = a match {
    case v: String => Some(TotalNumPosReportsField(v))
    case v: Int => Some(TotalNumPosReportsField(v))
    case v: TotalNumPosReportsField => Some(v)
    case _ => scala.Option.empty[TotalNumPosReportsField]
  } 
}