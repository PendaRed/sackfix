package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class RefSeqNumField(override val value: Int) extends SfFieldInt(45, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(45)RefSeqNum=(").append(value).append(")")
}

object RefSeqNumField {
  val TagId = 45  
  def apply(value: String) = try {
    new RefSeqNumField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RefSeqNum("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RefSeqNumField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefSeqNumField]
  }

  def decode(a: Any) : Option[RefSeqNumField] = a match {
    case v: String => Some(RefSeqNumField(v))
    case v: Int => Some(RefSeqNumField(v))
    case v: RefSeqNumField => Some(v)
    case _ => scala.Option.empty[RefSeqNumField]
  } 
}
