package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class StandInstDbIDField(override val value: String) extends SfFieldString(171, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(171)StandInstDbID=(").append(value).append(")")
}

object StandInstDbIDField {
  val TagId = 171  
  def decode(a: Option[Any]) : Option[StandInstDbIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StandInstDbIDField]
  }

  def decode(a: Any) : Option[StandInstDbIDField] = a match {
    case v: String => Some(StandInstDbIDField(v))
    case v: StandInstDbIDField => Some(v)
    case _ => scala.Option.empty[StandInstDbIDField]
  } 
}
