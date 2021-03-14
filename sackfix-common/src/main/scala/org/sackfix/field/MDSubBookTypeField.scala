package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class MDSubBookTypeField(override val value: Int) extends SfFieldInt(1173, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1173)MDSubBookType=(").append(value).append(")")
}

object MDSubBookTypeField {
  val TagId = 1173  
  def apply(value: String) = try {
    new MDSubBookTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MDSubBookType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MDSubBookTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MDSubBookTypeField]
  }

  def decode(a: Any) : Option[MDSubBookTypeField] = a match {
    case v: String => Some(MDSubBookTypeField(v))
    case v: Int => Some(MDSubBookTypeField(v))
    case v: MDSubBookTypeField => Some(v)
    case _ => scala.Option.empty[MDSubBookTypeField]
  } 
}
