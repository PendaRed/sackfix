package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class DlvyInstTypeField(override val value: String) extends SfFieldString(787, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(787)DlvyInstType=(").append(value).append(")").append(DlvyInstTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object DlvyInstTypeField {
  val TagId = 787 
  val Securities="S"
  val Cash="C"
  lazy val fixDescriptionByValue = Map("S"->"SECURITIES","C"->"CASH")
 
  def decode(a: Option[Any]) : Option[DlvyInstTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DlvyInstTypeField]
  }

  def decode(a: Any) : Option[DlvyInstTypeField] = a match {
    case v: String => Some(DlvyInstTypeField(v))
    case v: Char => Some(DlvyInstTypeField(v.toString))
    case v: DlvyInstTypeField => Some(v)
    case _ => scala.Option.empty[DlvyInstTypeField]
  } 
}
