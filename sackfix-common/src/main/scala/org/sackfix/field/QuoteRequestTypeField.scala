package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class QuoteRequestTypeField(override val value: Int) extends SfFieldInt(303, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(303)QuoteRequestType=(").append(value).append(")").append(QuoteRequestTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object QuoteRequestTypeField {
  val TagId = 303 
  val Manual=1
  val Automatic=2
  lazy val fixDescriptionByValue = Map(1->"MANUAL",2->"AUTOMATIC")
 
  def apply(value: String) = try {
    new QuoteRequestTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuoteRequestType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuoteRequestTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteRequestTypeField]
  }

  def decode(a: Any) : Option[QuoteRequestTypeField] = a match {
    case v: String => Some(QuoteRequestTypeField(v))
    case v: Int => Some(QuoteRequestTypeField(v))
    case v: QuoteRequestTypeField => Some(v)
    case _ => scala.Option.empty[QuoteRequestTypeField]
  } 
}
