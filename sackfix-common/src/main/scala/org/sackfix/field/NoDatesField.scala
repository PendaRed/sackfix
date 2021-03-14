package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoDatesField(override val value: Int) extends SfFieldInt(580, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(580)NoDates=(").append(value).append(")")
}

object NoDatesField {
  val TagId = 580  
  def apply(value: String) = try {
    new NoDatesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDates("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDatesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDatesField]
  }

  def decode(a: Any) : Option[NoDatesField] = a match {
    case v: String => Some(NoDatesField(v))
    case v: Int => Some(NoDatesField(v))
    case v: NoDatesField => Some(v)
    case _ => scala.Option.empty[NoDatesField]
  } 
}
