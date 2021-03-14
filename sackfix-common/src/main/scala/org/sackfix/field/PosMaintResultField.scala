package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class PosMaintResultField(override val value: Int) extends SfFieldInt(723, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(723)PosMaintResult=(").append(value).append(")").append(PosMaintResultField.fixDescriptionByValue.getOrElse(value,""))
}

object PosMaintResultField {
  val TagId = 723 
  val SuccessfulCompletionNoWarningsOrErrors=0
  val Rejected=1
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"SUCCESSFUL_COMPLETION_NO_WARNINGS_OR_ERRORS",1->"REJECTED",
    99->"OTHER")
 
  def apply(value: String) = try {
    new PosMaintResultField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PosMaintResult("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PosMaintResultField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosMaintResultField]
  }

  def decode(a: Any) : Option[PosMaintResultField] = a match {
    case v: String => Some(PosMaintResultField(v))
    case v: Int => Some(PosMaintResultField(v))
    case v: PosMaintResultField => Some(v)
    case _ => scala.Option.empty[PosMaintResultField]
  } 
}
