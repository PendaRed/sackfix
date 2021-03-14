package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class DiscretionOffsetTypeField(override val value: Int) extends SfFieldInt(842, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(842)DiscretionOffsetType=(").append(value).append(")").append(DiscretionOffsetTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object DiscretionOffsetTypeField {
  val TagId = 842 
  val Price=0
  val BasisPoints=1
  val Ticks=2
  val PriceTierLevel=3
  lazy val fixDescriptionByValue = Map(0->"PRICE",1->"BASIS_POINTS",
    2->"TICKS",3->"PRICE_TIER_LEVEL")
 
  def apply(value: String) = try {
    new DiscretionOffsetTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DiscretionOffsetType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DiscretionOffsetTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DiscretionOffsetTypeField]
  }

  def decode(a: Any) : Option[DiscretionOffsetTypeField] = a match {
    case v: String => Some(DiscretionOffsetTypeField(v))
    case v: Int => Some(DiscretionOffsetTypeField(v))
    case v: DiscretionOffsetTypeField => Some(v)
    case _ => scala.Option.empty[DiscretionOffsetTypeField]
  } 
}
