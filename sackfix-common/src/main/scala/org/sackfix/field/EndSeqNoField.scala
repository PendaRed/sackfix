package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class EndSeqNoField(override val value: Int) extends SfFieldInt(16, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(16)EndSeqNo=(").append(value).append(")")
}

object EndSeqNoField {
  val TagId = 16  
  def apply(value: String) = try {
    new EndSeqNoField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EndSeqNo("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EndSeqNoField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EndSeqNoField]
  }

  def decode(a: Any) : Option[EndSeqNoField] = a match {
    case v: String => Some(EndSeqNoField(v))
    case v: Int => Some(EndSeqNoField(v))
    case v: EndSeqNoField => Some(v)
    case _ => scala.Option.empty[EndSeqNoField]
  } 
}
