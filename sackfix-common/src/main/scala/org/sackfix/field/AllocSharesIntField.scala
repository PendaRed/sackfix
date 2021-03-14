package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class AllocSharesIntField(override val value: Int) extends SfFieldInt(80, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(80)AllocSharesInt=(").append(value).append(")")
}

object AllocSharesIntField {
  val TagId = 80  
  def apply(value: String) = try {
    new AllocSharesIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocSharesInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocSharesIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocSharesIntField]
  }

  def decode(a: Any) : Option[AllocSharesIntField] = a match {
    case v: String => Some(AllocSharesIntField(v))
    case v: Int => Some(AllocSharesIntField(v))
    case v: AllocSharesIntField => Some(v)
    case _ => scala.Option.empty[AllocSharesIntField]
  } 
}
