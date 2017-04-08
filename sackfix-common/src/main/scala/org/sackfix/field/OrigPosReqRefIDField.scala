package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class OrigPosReqRefIDField(override val value: String) extends SfFieldString(713, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(713)OrigPosReqRefID=(").append(value).append(")")
}

object OrigPosReqRefIDField {
  val TagId = 713  
  def decode(a: Option[Any]) : Option[OrigPosReqRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OrigPosReqRefIDField]
  }

  def decode(a: Any) : Option[OrigPosReqRefIDField] = a match {
    case v: String => Some(OrigPosReqRefIDField(v))
    case v: OrigPosReqRefIDField => Some(v)
    case _ => scala.Option.empty[OrigPosReqRefIDField]
  } 
}
