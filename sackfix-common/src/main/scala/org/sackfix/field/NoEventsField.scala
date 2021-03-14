package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoEventsField(override val value: Int) extends SfNumInGroup(864, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(864)NoEvents=(").append(value).append(")")
}

object NoEventsField {
  val TagId = 864  
  def apply(value: String) = try {
    new NoEventsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoEvents("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoEventsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoEventsField]
  }

  def decode(a: Any) : Option[NoEventsField] = a match {
    case v: String => Some(NoEventsField(v))
    case v: Int => Some(NoEventsField(v))
    case v: NoEventsField => Some(v)
    case _ => scala.Option.empty[NoEventsField]
  } 
}
