package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170404
  */
case class PossDupFlagField(override val value: Boolean) extends SfFieldBoolean(43, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(43)PossDupFlag=(").append({if (value) "Y" else "N"}).append(")")
}

object PossDupFlagField {
  val TagId = 43  
  def apply(value: String) = try {
    new PossDupFlagField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("PossDupFlag.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PossDupFlag("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PossDupFlagField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PossDupFlagField]
  }

  def decode(a: Any) : Option[PossDupFlagField] = a match {
    case v: String => Some(PossDupFlagField(v))
    case v: Boolean => Some(PossDupFlagField(v))
    case v: PossDupFlagField => Some(v)
    case _ => scala.Option.empty[PossDupFlagField]
  } 
}
