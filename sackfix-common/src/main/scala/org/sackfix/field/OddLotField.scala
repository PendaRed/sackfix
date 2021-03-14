package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20170521
  */
case class OddLotField(override val value: Boolean) extends SfFieldBoolean(575, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(575)OddLot=(").append({if (value) "Y" else "N"}).append(")")
}

object OddLotField {
  val TagId = 575  
  def apply(value: String) = try {
    new OddLotField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("OddLot.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OddLot("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OddLotField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OddLotField]
  }

  def decode(a: Any) : Option[OddLotField] = a match {
    case v: String => Some(OddLotField(v))
    case v: Boolean => Some(OddLotField(v))
    case v: OddLotField => Some(v)
    case _ => scala.Option.empty[OddLotField]
  } 
}
