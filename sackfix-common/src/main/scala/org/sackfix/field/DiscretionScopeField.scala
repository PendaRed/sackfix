package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class DiscretionScopeField(override val value: Int) extends SfFieldInt(846, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(846)DiscretionScope=(").append(value).append(")").append(DiscretionScopeField.fixDescriptionByValue.getOrElse(value,""))
}

object DiscretionScopeField {
  val TagId = 846 
  val Local=1
  val National=2
  val Global=3
  val NationalExcludingLocal=4
  lazy val fixDescriptionByValue = Map(1->"LOCAL",2->"NATIONAL",
    3->"GLOBAL",4->"NATIONAL_EXCLUDING_LOCAL")
 
  def apply(value: String) = try {
    new DiscretionScopeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DiscretionScope("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DiscretionScopeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DiscretionScopeField]
  }

  def decode(a: Any) : Option[DiscretionScopeField] = a match {
    case v: String => Some(DiscretionScopeField(v))
    case v: Int => Some(DiscretionScopeField(v))
    case v: DiscretionScopeField => Some(v)
    case _ => scala.Option.empty[DiscretionScopeField]
  } 
}
