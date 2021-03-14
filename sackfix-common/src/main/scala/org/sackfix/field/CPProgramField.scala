package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class CPProgramField(override val value: Int) extends SfFieldInt(875, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(875)CPProgram=(").append(value).append(")").append(CPProgramField.fixDescriptionByValue.getOrElse(value,""))
}

object CPProgramField {
  val TagId = 875 
  val _3A=1
  val _42=2
  val Other=99
  lazy val fixDescriptionByValue = Map(1->"_3_A",2->"_4_2",
    99->"OTHER")
 
  def apply(value: String) = try {
    new CPProgramField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CPProgram("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CPProgramField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CPProgramField]
  }

  def decode(a: Any) : Option[CPProgramField] = a match {
    case v: String => Some(CPProgramField(v))
    case v: Int => Some(CPProgramField(v))
    case v: CPProgramField => Some(v)
    case _ => scala.Option.empty[CPProgramField]
  } 
}
