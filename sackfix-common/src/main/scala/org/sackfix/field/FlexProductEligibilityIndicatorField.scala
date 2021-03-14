package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170521
  */
case class FlexProductEligibilityIndicatorField(override val value: Boolean) extends SfFieldBoolean(1242, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1242)FlexProductEligibilityIndicator=(").append({if (value) "Y" else "N"}).append(")")
}

object FlexProductEligibilityIndicatorField {
  val TagId = 1242  
  def apply(value: String) = try {
    new FlexProductEligibilityIndicatorField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("FlexProductEligibilityIndicator.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new FlexProductEligibilityIndicator("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[FlexProductEligibilityIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FlexProductEligibilityIndicatorField]
  }

  def decode(a: Any) : Option[FlexProductEligibilityIndicatorField] = a match {
    case v: String => Some(FlexProductEligibilityIndicatorField(v))
    case v: Boolean => Some(FlexProductEligibilityIndicatorField(v))
    case v: FlexProductEligibilityIndicatorField => Some(v)
    case _ => scala.Option.empty[FlexProductEligibilityIndicatorField]
  } 
}
