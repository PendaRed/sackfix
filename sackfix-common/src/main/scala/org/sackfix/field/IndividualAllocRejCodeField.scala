package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class IndividualAllocRejCodeField(override val value: Int) extends SfFieldInt(776, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(776)IndividualAllocRejCode=(").append(value).append(")")
}

object IndividualAllocRejCodeField {
  val TagId = 776  
  def apply(value: String) = try {
    new IndividualAllocRejCodeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new IndividualAllocRejCode("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[IndividualAllocRejCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IndividualAllocRejCodeField]
  }

  def decode(a: Any) : Option[IndividualAllocRejCodeField] = a match {
    case v: String => Some(IndividualAllocRejCodeField(v))
    case v: Int => Some(IndividualAllocRejCodeField(v))
    case v: IndividualAllocRejCodeField => Some(v)
    case _ => scala.Option.empty[IndividualAllocRejCodeField]
  } 
}
