package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class DerivativeNTPositionLimitField(override val value: Int) extends SfFieldInt(1274, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1274)DerivativeNTPositionLimit=(").append(value).append(")")
}

object DerivativeNTPositionLimitField {
  val TagId = 1274  
  def apply(value: String) = try {
    new DerivativeNTPositionLimitField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DerivativeNTPositionLimit("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DerivativeNTPositionLimitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeNTPositionLimitField]
  }

  def decode(a: Any) : Option[DerivativeNTPositionLimitField] = a match {
    case v: String => Some(DerivativeNTPositionLimitField(v))
    case v: Int => Some(DerivativeNTPositionLimitField(v))
    case v: DerivativeNTPositionLimitField => Some(v)
    case _ => scala.Option.empty[DerivativeNTPositionLimitField]
  } 
}
