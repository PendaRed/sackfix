package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingRepurchaseTermField(override val value: Int) extends SfFieldInt(244, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(244)UnderlyingRepurchaseTerm=(").append(value).append(")")
}

object UnderlyingRepurchaseTermField {
  val TagId = 244  
  def apply(value: String) = try {
    new UnderlyingRepurchaseTermField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingRepurchaseTerm("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingRepurchaseTermField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingRepurchaseTermField]
  }

  def decode(a: Any) : Option[UnderlyingRepurchaseTermField] = a match {
    case v: String => Some(UnderlyingRepurchaseTermField(v))
    case v: Int => Some(UnderlyingRepurchaseTermField(v))
    case v: UnderlyingRepurchaseTermField => Some(v)
    case _ => scala.Option.empty[UnderlyingRepurchaseTermField]
  } 
}
