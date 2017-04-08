package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocAcctIDSourceField(override val value: Int) extends SfFieldInt(661, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(661)AllocAcctIDSource=(").append(value).append(")")
}

object AllocAcctIDSourceField {
  val TagId = 661  
  def apply(value: String) = try {
    new AllocAcctIDSourceField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocAcctIDSource("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocAcctIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocAcctIDSourceField]
  }

  def decode(a: Any) : Option[AllocAcctIDSourceField] = a match {
    case v: String => Some(AllocAcctIDSourceField(v))
    case v: Int => Some(AllocAcctIDSourceField(v))
    case v: AllocAcctIDSourceField => Some(v)
    case _ => scala.Option.empty[AllocAcctIDSourceField]
  } 
}
