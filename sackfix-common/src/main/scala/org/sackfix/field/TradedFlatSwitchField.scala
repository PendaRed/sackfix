package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20210314
  */
case class TradedFlatSwitchField(override val value: Boolean) extends SfFieldBoolean(258, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(258)TradedFlatSwitch=(").append({if (value) "Y" else "N"}).append(")")
}

object TradedFlatSwitchField {
  val TagId = 258  
  def apply(value: String) = try {
    new TradedFlatSwitchField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("TradedFlatSwitch.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradedFlatSwitch("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradedFlatSwitchField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradedFlatSwitchField]
  }

  def decode(a: Any) : Option[TradedFlatSwitchField] = a match {
    case v: String => Some(TradedFlatSwitchField(v))
    case v: Boolean => Some(TradedFlatSwitchField(v))
    case v: TradedFlatSwitchField => Some(v)
    case _ => scala.Option.empty[TradedFlatSwitchField]
  } 
}
