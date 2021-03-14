package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class NestedInstrAttribTypeField(override val value: Int) extends SfFieldInt(1210, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1210)NestedInstrAttribType=(").append(value).append(")")
}

object NestedInstrAttribTypeField {
  val TagId = 1210  
  def apply(value: String) = try {
    new NestedInstrAttribTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NestedInstrAttribType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NestedInstrAttribTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NestedInstrAttribTypeField]
  }

  def decode(a: Any) : Option[NestedInstrAttribTypeField] = a match {
    case v: String => Some(NestedInstrAttribTypeField(v))
    case v: Int => Some(NestedInstrAttribTypeField(v))
    case v: NestedInstrAttribTypeField => Some(v)
    case _ => scala.Option.empty[NestedInstrAttribTypeField]
  } 
}
