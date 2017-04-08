package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class RepurchaseTermField(override val value: Int) extends SfFieldInt(226, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(226)RepurchaseTerm=(").append(value).append(")")
}

object RepurchaseTermField {
  val TagId = 226  
  def apply(value: String) = try {
    new RepurchaseTermField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RepurchaseTerm("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RepurchaseTermField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RepurchaseTermField]
  }

  def decode(a: Any) : Option[RepurchaseTermField] = a match {
    case v: String => Some(RepurchaseTermField(v))
    case v: Int => Some(RepurchaseTermField(v))
    case v: RepurchaseTermField => Some(v)
    case _ => scala.Option.empty[RepurchaseTermField]
  } 
}
