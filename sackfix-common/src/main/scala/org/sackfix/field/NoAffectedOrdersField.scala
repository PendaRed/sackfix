package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoAffectedOrdersField(override val value: Int) extends SfFieldInt(534, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(534)NoAffectedOrders=(").append(value).append(")")
}

object NoAffectedOrdersField {
  val TagId = 534  
  def apply(value: String) = try {
    new NoAffectedOrdersField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoAffectedOrders("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoAffectedOrdersField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoAffectedOrdersField]
  }

  def decode(a: Any) : Option[NoAffectedOrdersField] = a match {
    case v: String => Some(NoAffectedOrdersField(v))
    case v: Int => Some(NoAffectedOrdersField(v))
    case v: NoAffectedOrdersField => Some(v)
    case _ => scala.Option.empty[NoAffectedOrdersField]
  } 
}
