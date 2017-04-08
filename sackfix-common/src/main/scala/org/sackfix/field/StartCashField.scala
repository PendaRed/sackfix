package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class StartCashField(override val value: Float) extends SfFieldFloat(921, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(921)StartCash=(").append(value).append(")")
}

object StartCashField {
  val TagId = 921  
  def apply(value: String) = try {
    new StartCashField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StartCash("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StartCashField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StartCashField]
  }

  def decode(a: Any) : Option[StartCashField] = a match {
    case v: String => Some(StartCashField(v))
    case v: Float => Some(StartCashField(v))
    case v: Double => Some(StartCashField(v.toFloat))
    case v: Int => Some(StartCashField(v.toFloat))
    case v: StartCashField => Some(v)
    case _ => scala.Option.empty[StartCashField]
  } 
}
