package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170404
  */
case class GapFillFlagField(override val value: Boolean) extends SfFieldBoolean(123, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(123)GapFillFlag=(").append({if (value) "Y" else "N"}).append(")")
}

object GapFillFlagField {
  val TagId = 123  
  def apply(value: String) = try {
    new GapFillFlagField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("GapFillFlag.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new GapFillFlag("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[GapFillFlagField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[GapFillFlagField]
  }

  def decode(a: Any) : Option[GapFillFlagField] = a match {
    case v: String => Some(GapFillFlagField(v))
    case v: Boolean => Some(GapFillFlagField(v))
    case v: GapFillFlagField => Some(v)
    case _ => scala.Option.empty[GapFillFlagField]
  } 
}
