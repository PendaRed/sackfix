package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class PegMoveTypeField(override val value: Int) extends SfFieldInt(835, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(835)PegMoveType=(").append(value).append(")").append(PegMoveTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PegMoveTypeField {
  val TagId = 835 
  val Floating=0
  val Fixed=1
  lazy val fixDescriptionByValue = Map(0->"FLOATING",1->"FIXED")
 
  def apply(value: String) = try {
    new PegMoveTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PegMoveType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PegMoveTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PegMoveTypeField]
  }

  def decode(a: Any) : Option[PegMoveTypeField] = a match {
    case v: String => Some(PegMoveTypeField(v))
    case v: Int => Some(PegMoveTypeField(v))
    case v: PegMoveTypeField => Some(v)
    case _ => scala.Option.empty[PegMoveTypeField]
  } 
}
