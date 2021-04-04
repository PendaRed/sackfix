package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoRootPartySubIDsField(override val value: Int) extends SfNumInGroup(1120, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1120)NoRootPartySubIDs=(").append(value).append(")")
}

object NoRootPartySubIDsField {
  val TagId = 1120  
  def apply(value: String) = try {
    new NoRootPartySubIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoRootPartySubIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoRootPartySubIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoRootPartySubIDsField]
  }

  def decode(a: Any) : Option[NoRootPartySubIDsField] = a match {
    case v: String => Some(NoRootPartySubIDsField(v))
    case v: Int => Some(NoRootPartySubIDsField(v))
    case v: NoRootPartySubIDsField => Some(v)
    case _ => scala.Option.empty[NoRootPartySubIDsField]
  } 
}
