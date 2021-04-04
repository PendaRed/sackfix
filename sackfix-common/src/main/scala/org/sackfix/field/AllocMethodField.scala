package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class AllocMethodField(override val value: Int) extends SfFieldInt(1002, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1002)AllocMethod=(").append(value).append(")").append(AllocMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object AllocMethodField {
  val TagId = 1002 
  val Automatic=1
  val Guarantor=2
  val Manual=3
  lazy val fixDescriptionByValue = Map(1->"AUTOMATIC",2->"GUARANTOR",
    3->"MANUAL")
 
  def apply(value: String) = try {
    new AllocMethodField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocMethod("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocMethodField]
  }

  def decode(a: Any) : Option[AllocMethodField] = a match {
    case v: String => Some(AllocMethodField(v))
    case v: Int => Some(AllocMethodField(v))
    case v: AllocMethodField => Some(v)
    case _ => scala.Option.empty[AllocMethodField]
  } 
}
