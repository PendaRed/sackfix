package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SecondaryIndividualAllocIDField(override val value: String) extends SfFieldString(989, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(989)SecondaryIndividualAllocID=(").append(value).append(")")
}

object SecondaryIndividualAllocIDField {
  val TagId = 989  
  def decode(a: Option[Any]) : Option[SecondaryIndividualAllocIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecondaryIndividualAllocIDField]
  }

  def decode(a: Any) : Option[SecondaryIndividualAllocIDField] = a match {
    case v: String => Some(SecondaryIndividualAllocIDField(v))
    case v: SecondaryIndividualAllocIDField => Some(v)
    case _ => scala.Option.empty[SecondaryIndividualAllocIDField]
  } 
}
