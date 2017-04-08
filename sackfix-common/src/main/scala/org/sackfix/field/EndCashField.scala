package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class EndCashField(override val value: Float) extends SfFieldFloat(922, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(922)EndCash=(").append(value).append(")")
}

object EndCashField {
  val TagId = 922  
  def apply(value: String) = try {
    new EndCashField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EndCash("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EndCashField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EndCashField]
  }

  def decode(a: Any) : Option[EndCashField] = a match {
    case v: String => Some(EndCashField(v))
    case v: Float => Some(EndCashField(v))
    case v: Double => Some(EndCashField(v.toFloat))
    case v: Int => Some(EndCashField(v.toFloat))
    case v: EndCashField => Some(v)
    case _ => scala.Option.empty[EndCashField]
  } 
}
