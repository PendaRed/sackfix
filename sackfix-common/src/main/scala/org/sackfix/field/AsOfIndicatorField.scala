package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class AsOfIndicatorField(override val value: String) extends SfFieldString(1015, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1015)AsOfIndicator=(").append(value).append(")").append(AsOfIndicatorField.fixDescriptionByValue.getOrElse(value,""))
}

object AsOfIndicatorField {
  val TagId = 1015 
  val False="0"
  val True="1"
  lazy val fixDescriptionByValue = Map("0"->"FALSE","1"->"TRUE")
 
  def decode(a: Option[Any]) : Option[AsOfIndicatorField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AsOfIndicatorField]
  }

  def decode(a: Any) : Option[AsOfIndicatorField] = a match {
    case v: String => Some(AsOfIndicatorField(v))
    case v: Char => Some(AsOfIndicatorField(v.toString))
    case v: AsOfIndicatorField => Some(v)
    case _ => scala.Option.empty[AsOfIndicatorField]
  } 
}