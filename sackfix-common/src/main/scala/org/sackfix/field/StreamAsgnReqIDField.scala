package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class StreamAsgnReqIDField(override val value: String) extends SfFieldString(1497, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1497)StreamAsgnReqID=(").append(value).append(")")
}

object StreamAsgnReqIDField {
  val TagId = 1497  
  def decode(a: Option[Any]) : Option[StreamAsgnReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StreamAsgnReqIDField]
  }

  def decode(a: Any) : Option[StreamAsgnReqIDField] = a match {
    case v: String => Some(StreamAsgnReqIDField(v))
    case v: StreamAsgnReqIDField => Some(v)
    case _ => scala.Option.empty[StreamAsgnReqIDField]
  } 
}
