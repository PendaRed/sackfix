package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class RefApplReqIDField(override val value: String) extends SfFieldString(1433, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1433)RefApplReqID=(").append(value).append(")")
}

object RefApplReqIDField {
  val TagId = 1433  
  def decode(a: Option[Any]) : Option[RefApplReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefApplReqIDField]
  }

  def decode(a: Any) : Option[RefApplReqIDField] = a match {
    case v: String => Some(RefApplReqIDField(v))
    case v: RefApplReqIDField => Some(v)
    case _ => scala.Option.empty[RefApplReqIDField]
  } 
}
