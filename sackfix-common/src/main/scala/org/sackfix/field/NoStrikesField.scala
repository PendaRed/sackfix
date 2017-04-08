package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoStrikesField(override val value: Int) extends SfNumInGroup(428, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(428)NoStrikes=(").append(value).append(")")
}

object NoStrikesField {
  val TagId = 428  
  def apply(value: String) = try {
    new NoStrikesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoStrikes("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoStrikesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoStrikesField]
  }

  def decode(a: Any) : Option[NoStrikesField] = a match {
    case v: String => Some(NoStrikesField(v))
    case v: Int => Some(NoStrikesField(v))
    case v: NoStrikesField => Some(v)
    case _ => scala.Option.empty[NoStrikesField]
  } 
}
