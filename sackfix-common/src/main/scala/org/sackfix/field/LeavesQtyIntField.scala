package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class LeavesQtyIntField(override val value: Int) extends SfFieldInt(151, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(151)LeavesQtyInt=(").append(value).append(")")
}

object LeavesQtyIntField {
  val TagId = 151  
  def apply(value: String) = try {
    new LeavesQtyIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LeavesQtyInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LeavesQtyIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LeavesQtyIntField]
  }

  def decode(a: Any) : Option[LeavesQtyIntField] = a match {
    case v: String => Some(LeavesQtyIntField(v))
    case v: Int => Some(LeavesQtyIntField(v))
    case v: LeavesQtyIntField => Some(v)
    case _ => scala.Option.empty[LeavesQtyIntField]
  } 
}
