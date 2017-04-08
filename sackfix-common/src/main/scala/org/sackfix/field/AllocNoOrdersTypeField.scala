package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocNoOrdersTypeField(override val value: Int) extends SfFieldInt(857, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(857)AllocNoOrdersType=(").append(value).append(")").append(AllocNoOrdersTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object AllocNoOrdersTypeField {
  val TagId = 857 
  val NotSpecified=0
  val ExplicitListProvided=1
  lazy val fixDescriptionByValue = Map(0->"NOT_SPECIFIED",1->"EXPLICIT_LIST_PROVIDED")
 
  def apply(value: String) = try {
    new AllocNoOrdersTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocNoOrdersType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocNoOrdersTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocNoOrdersTypeField]
  }

  def decode(a: Any) : Option[AllocNoOrdersTypeField] = a match {
    case v: String => Some(AllocNoOrdersTypeField(v))
    case v: Int => Some(AllocNoOrdersTypeField(v))
    case v: AllocNoOrdersTypeField => Some(v)
    case _ => scala.Option.empty[AllocNoOrdersTypeField]
  } 
}
