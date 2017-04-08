package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class TrdRegTimestampOriginField(override val value: String) extends SfFieldString(771, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(771)TrdRegTimestampOrigin=(").append(value).append(")")
}

object TrdRegTimestampOriginField {
  val TagId = 771  
  def decode(a: Option[Any]) : Option[TrdRegTimestampOriginField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TrdRegTimestampOriginField]
  }

  def decode(a: Any) : Option[TrdRegTimestampOriginField] = a match {
    case v: String => Some(TrdRegTimestampOriginField(v))
    case v: TrdRegTimestampOriginField => Some(v)
    case _ => scala.Option.empty[TrdRegTimestampOriginField]
  } 
}