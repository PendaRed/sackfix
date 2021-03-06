package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoUsernamesField(override val value: Int) extends SfNumInGroup(809, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(809)NoUsernames=(").append(value).append(")")
}

object NoUsernamesField {
  val TagId = 809  
  def apply(value: String) = try {
    new NoUsernamesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoUsernames("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoUsernamesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoUsernamesField]
  }

  def decode(a: Any) : Option[NoUsernamesField] = a match {
    case v: String => Some(NoUsernamesField(v))
    case v: Int => Some(NoUsernamesField(v))
    case v: NoUsernamesField => Some(v)
    case _ => scala.Option.empty[NoUsernamesField]
  } 
}
