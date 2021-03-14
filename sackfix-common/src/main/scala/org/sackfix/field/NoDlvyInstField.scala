package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoDlvyInstField(override val value: Int) extends SfNumInGroup(85, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(85)NoDlvyInst=(").append(value).append(")")
}

object NoDlvyInstField {
  val TagId = 85  
  def apply(value: String) = try {
    new NoDlvyInstField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDlvyInst("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDlvyInstField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDlvyInstField]
  }

  def decode(a: Any) : Option[NoDlvyInstField] = a match {
    case v: String => Some(NoDlvyInstField(v))
    case v: Int => Some(NoDlvyInstField(v))
    case v: NoDlvyInstField => Some(v)
    case _ => scala.Option.empty[NoDlvyInstField]
  } 
}
