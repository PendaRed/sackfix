package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class SharesField(override val value: Int) extends SfFieldInt(53, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(53)Shares=(").append(value).append(")")
}

object SharesField {
  val TagId = 53  
  def apply(value: String) = try {
    new SharesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Shares("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SharesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SharesField]
  }

  def decode(a: Any) : Option[SharesField] = a match {
    case v: String => Some(SharesField(v))
    case v: Int => Some(SharesField(v))
    case v: SharesField => Some(v)
    case _ => scala.Option.empty[SharesField]
  } 
}
