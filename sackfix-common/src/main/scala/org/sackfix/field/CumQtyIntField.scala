package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class CumQtyIntField(override val value: Int) extends SfFieldInt(14, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(14)CumQtyInt=(").append(value).append(")")
}

object CumQtyIntField {
  val TagId = 14  
  def apply(value: String) = try {
    new CumQtyIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CumQtyInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CumQtyIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CumQtyIntField]
  }

  def decode(a: Any) : Option[CumQtyIntField] = a match {
    case v: String => Some(CumQtyIntField(v))
    case v: Int => Some(CumQtyIntField(v))
    case v: CumQtyIntField => Some(v)
    case _ => scala.Option.empty[CumQtyIntField]
  } 
}
