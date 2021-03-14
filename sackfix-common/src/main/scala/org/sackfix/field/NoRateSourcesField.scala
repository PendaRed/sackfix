package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoRateSourcesField(override val value: Int) extends SfNumInGroup(1445, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1445)NoRateSources=(").append(value).append(")")
}

object NoRateSourcesField {
  val TagId = 1445  
  def apply(value: String) = try {
    new NoRateSourcesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoRateSources("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoRateSourcesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoRateSourcesField]
  }

  def decode(a: Any) : Option[NoRateSourcesField] = a match {
    case v: String => Some(NoRateSourcesField(v))
    case v: Int => Some(NoRateSourcesField(v))
    case v: NoRateSourcesField => Some(v)
    case _ => scala.Option.empty[NoRateSourcesField]
  } 
}
