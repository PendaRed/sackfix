package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoLegSecurityAltIDField(override val value: Int) extends SfNumInGroup(604, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(604)NoLegSecurityAltID=(").append(value).append(")")
}

object NoLegSecurityAltIDField {
  val TagId = 604  
  def apply(value: String) = try {
    new NoLegSecurityAltIDField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoLegSecurityAltID("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoLegSecurityAltIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoLegSecurityAltIDField]
  }

  def decode(a: Any) : Option[NoLegSecurityAltIDField] = a match {
    case v: String => Some(NoLegSecurityAltIDField(v))
    case v: Int => Some(NoLegSecurityAltIDField(v))
    case v: NoLegSecurityAltIDField => Some(v)
    case _ => scala.Option.empty[NoLegSecurityAltIDField]
  } 
}
