package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoNestedPartyIDsField(override val value: Int) extends SfNumInGroup(539, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(539)NoNestedPartyIDs=(").append(value).append(")")
}

object NoNestedPartyIDsField {
  val TagId = 539  
  def apply(value: String) = try {
    new NoNestedPartyIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoNestedPartyIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoNestedPartyIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoNestedPartyIDsField]
  }

  def decode(a: Any) : Option[NoNestedPartyIDsField] = a match {
    case v: String => Some(NoNestedPartyIDsField(v))
    case v: Int => Some(NoNestedPartyIDsField(v))
    case v: NoNestedPartyIDsField => Some(v)
    case _ => scala.Option.empty[NoNestedPartyIDsField]
  } 
}
