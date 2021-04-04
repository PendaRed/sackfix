package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoRegistDtlsField(override val value: Int) extends SfNumInGroup(473, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(473)NoRegistDtls=(").append(value).append(")")
}

object NoRegistDtlsField {
  val TagId = 473  
  def apply(value: String) = try {
    new NoRegistDtlsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoRegistDtls("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoRegistDtlsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoRegistDtlsField]
  }

  def decode(a: Any) : Option[NoRegistDtlsField] = a match {
    case v: String => Some(NoRegistDtlsField(v))
    case v: Int => Some(NoRegistDtlsField(v))
    case v: NoRegistDtlsField => Some(v)
    case _ => scala.Option.empty[NoRegistDtlsField]
  } 
}
