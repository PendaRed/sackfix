package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class MDUpdateTypeField(override val value: Int) extends SfFieldInt(265, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(265)MDUpdateType=(").append(value).append(")").append(MDUpdateTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object MDUpdateTypeField {
  val TagId = 265 
  val FullRefresh=0
  val IncrementalRefresh=1
  lazy val fixDescriptionByValue = Map(0->"FULL_REFRESH",1->"INCREMENTAL_REFRESH")
 
  def apply(value: String) = try {
    new MDUpdateTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDUpdateType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDUpdateTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDUpdateTypeField]
  }

  def decode(a: Any) : Option[MDUpdateTypeField] = a match {
    case v: String => Some(MDUpdateTypeField(v))
    case v: Int => Some(MDUpdateTypeField(v))
    case v: MDUpdateTypeField => Some(v)
    case _ => scala.Option.empty[MDUpdateTypeField]
  } 
}
