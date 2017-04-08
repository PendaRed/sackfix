package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class StrikeExerciseStyleField(override val value: Int) extends SfFieldInt(1304, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1304)StrikeExerciseStyle=(").append(value).append(")")
}

object StrikeExerciseStyleField {
  val TagId = 1304  
  def apply(value: String) = try {
    new StrikeExerciseStyleField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StrikeExerciseStyle("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StrikeExerciseStyleField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrikeExerciseStyleField]
  }

  def decode(a: Any) : Option[StrikeExerciseStyleField] = a match {
    case v: String => Some(StrikeExerciseStyleField(v))
    case v: Int => Some(StrikeExerciseStyleField(v))
    case v: StrikeExerciseStyleField => Some(v)
    case _ => scala.Option.empty[StrikeExerciseStyleField]
  } 
}
