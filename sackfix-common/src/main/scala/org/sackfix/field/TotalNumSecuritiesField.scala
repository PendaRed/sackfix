package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class TotalNumSecuritiesField(override val value: Int) extends SfFieldInt(393, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(393)TotalNumSecurities=(").append(value).append(")")
}

object TotalNumSecuritiesField {
  val TagId = 393  
  def apply(value: String) = try {
    new TotalNumSecuritiesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotalNumSecurities("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotalNumSecuritiesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotalNumSecuritiesField]
  }

  def decode(a: Any) : Option[TotalNumSecuritiesField] = a match {
    case v: String => Some(TotalNumSecuritiesField(v))
    case v: Int => Some(TotalNumSecuritiesField(v))
    case v: TotalNumSecuritiesField => Some(v)
    case _ => scala.Option.empty[TotalNumSecuritiesField]
  } 
}
