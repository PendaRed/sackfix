package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class TestReqIDField(override val value: String) extends SfFieldString(112, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(112)TestReqID=(").append(value).append(")")
}

object TestReqIDField {
  val TagId = 112  
  def decode(a: Option[Any]) : Option[TestReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TestReqIDField]
  }

  def decode(a: Any) : Option[TestReqIDField] = a match {
    case v: String => Some(TestReqIDField(v))
    case v: TestReqIDField => Some(v)
    case _ => scala.Option.empty[TestReqIDField]
  } 
}
