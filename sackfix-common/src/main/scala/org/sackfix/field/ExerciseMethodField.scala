package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ExerciseMethodField(override val value: String) extends SfFieldString(747, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(747)ExerciseMethod=(").append(value).append(")").append(ExerciseMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object ExerciseMethodField {
  val TagId = 747 
  val Automatic="A"
  val Manual="M"
  lazy val fixDescriptionByValue = Map("A"->"AUTOMATIC","M"->"MANUAL")
 
  def decode(a: Option[Any]) : Option[ExerciseMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExerciseMethodField]
  }

  def decode(a: Any) : Option[ExerciseMethodField] = a match {
    case v: String => Some(ExerciseMethodField(v))
    case v: Char => Some(ExerciseMethodField(v.toString))
    case v: ExerciseMethodField => Some(v)
    case _ => scala.Option.empty[ExerciseMethodField]
  } 
}
