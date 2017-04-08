package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoOfSecSizesField(override val value: Int) extends SfNumInGroup(1177, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1177)NoOfSecSizes=(").append(value).append(")")
}

object NoOfSecSizesField {
  val TagId = 1177  
  def apply(value: String) = try {
    new NoOfSecSizesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoOfSecSizes("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoOfSecSizesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoOfSecSizesField]
  }

  def decode(a: Any) : Option[NoOfSecSizesField] = a match {
    case v: String => Some(NoOfSecSizesField(v))
    case v: Int => Some(NoOfSecSizesField(v))
    case v: NoOfSecSizesField => Some(v)
    case _ => scala.Option.empty[NoOfSecSizesField]
  } 
}
