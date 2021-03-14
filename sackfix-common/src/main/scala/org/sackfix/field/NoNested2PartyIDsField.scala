package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoNested2PartyIDsField(override val value: Int) extends SfNumInGroup(756, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(756)NoNested2PartyIDs=(").append(value).append(")")
}

object NoNested2PartyIDsField {
  val TagId = 756  
  def apply(value: String) = try {
    new NoNested2PartyIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoNested2PartyIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoNested2PartyIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoNested2PartyIDsField]
  }

  def decode(a: Any) : Option[NoNested2PartyIDsField] = a match {
    case v: String => Some(NoNested2PartyIDsField(v))
    case v: Int => Some(NoNested2PartyIDsField(v))
    case v: NoNested2PartyIDsField => Some(v)
    case _ => scala.Option.empty[NoNested2PartyIDsField]
  } 
}
