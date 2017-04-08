package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class RefAllocIDIntField(override val value: Int) extends SfFieldInt(72, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(72)RefAllocIDInt=(").append(value).append(")")
}

object RefAllocIDIntField {
  val TagId = 72  
  def apply(value: String) = try {
    new RefAllocIDIntField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RefAllocIDInt("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RefAllocIDIntField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefAllocIDIntField]
  }

  def decode(a: Any) : Option[RefAllocIDIntField] = a match {
    case v: String => Some(RefAllocIDIntField(v))
    case v: Int => Some(RefAllocIDIntField(v))
    case v: RefAllocIDIntField => Some(v)
    case _ => scala.Option.empty[RefAllocIDIntField]
  } 
}
