package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class SideQtyField(override val value: Int) extends SfFieldInt(1009, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1009)SideQty=(").append(value).append(")")
}

object SideQtyField {
  val TagId = 1009  
  def apply(value: String) = try {
    new SideQtyField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SideQty("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SideQtyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideQtyField]
  }

  def decode(a: Any) : Option[SideQtyField] = a match {
    case v: String => Some(SideQtyField(v))
    case v: Int => Some(SideQtyField(v))
    case v: SideQtyField => Some(v)
    case _ => scala.Option.empty[SideQtyField]
  } 
}
