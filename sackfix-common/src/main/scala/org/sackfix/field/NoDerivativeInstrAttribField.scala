package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoDerivativeInstrAttribField(override val value: Int) extends SfNumInGroup(1311, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1311)NoDerivativeInstrAttrib=(").append(value).append(")")
}

object NoDerivativeInstrAttribField {
  val TagId = 1311  
  def apply(value: String) = try {
    new NoDerivativeInstrAttribField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoDerivativeInstrAttrib("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoDerivativeInstrAttribField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoDerivativeInstrAttribField]
  }

  def decode(a: Any) : Option[NoDerivativeInstrAttribField] = a match {
    case v: String => Some(NoDerivativeInstrAttribField(v))
    case v: Int => Some(NoDerivativeInstrAttribField(v))
    case v: NoDerivativeInstrAttribField => Some(v)
    case _ => scala.Option.empty[NoDerivativeInstrAttribField]
  } 
}
