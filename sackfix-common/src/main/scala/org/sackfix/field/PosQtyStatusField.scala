package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class PosQtyStatusField(override val value: Int) extends SfFieldInt(706, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(706)PosQtyStatus=(").append(value).append(")").append(PosQtyStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object PosQtyStatusField {
  val TagId = 706 
  val Submitted=0
  val Accepted=1
  val Rejected=2
  lazy val fixDescriptionByValue = Map(0->"SUBMITTED",1->"ACCEPTED",
    2->"REJECTED")
 
  def apply(value: String) = try {
    new PosQtyStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PosQtyStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PosQtyStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosQtyStatusField]
  }

  def decode(a: Any) : Option[PosQtyStatusField] = a match {
    case v: String => Some(PosQtyStatusField(v))
    case v: Int => Some(PosQtyStatusField(v))
    case v: PosQtyStatusField => Some(v)
    case _ => scala.Option.empty[PosQtyStatusField]
  } 
}
