package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class IOINaturalFlagStringField(override val value: String) extends SfFieldString(130, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(130)IOINaturalFlagString=(").append(value).append(")")
}

object IOINaturalFlagStringField {
  val TagId = 130  
  def decode(a: Option[Any]) : Option[IOINaturalFlagStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IOINaturalFlagStringField]
  }

  def decode(a: Any) : Option[IOINaturalFlagStringField] = a match {
    case v: String => Some(IOINaturalFlagStringField(v))
    case v: IOINaturalFlagStringField => Some(v)
    case _ => scala.Option.empty[IOINaturalFlagStringField]
  } 
}
