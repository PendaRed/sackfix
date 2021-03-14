package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoSettlDetailsField(override val value: Int) extends SfNumInGroup(1158, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1158)NoSettlDetails=(").append(value).append(")")
}

object NoSettlDetailsField {
  val TagId = 1158  
  def apply(value: String) = try {
    new NoSettlDetailsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoSettlDetails("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoSettlDetailsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoSettlDetailsField]
  }

  def decode(a: Any) : Option[NoSettlDetailsField] = a match {
    case v: String => Some(NoSettlDetailsField(v))
    case v: Int => Some(NoSettlDetailsField(v))
    case v: NoSettlDetailsField => Some(v)
    case _ => scala.Option.empty[NoSettlDetailsField]
  } 
}
