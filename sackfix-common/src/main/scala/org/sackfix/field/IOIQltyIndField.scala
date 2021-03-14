package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class IOIQltyIndField(override val value: String) extends SfFieldString(25, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(25)IOIQltyInd=(").append(value).append(")").append(IOIQltyIndField.fixDescriptionByValue.getOrElse(value,""))
}

object IOIQltyIndField {
  val TagId = 25 
  val Low="L"
  val Medium="M"
  val High="H"
  lazy val fixDescriptionByValue = Map("L"->"LOW","M"->"MEDIUM",
    "H"->"HIGH")
 
  def decode(a: Option[Any]) : Option[IOIQltyIndField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[IOIQltyIndField]
  }

  def decode(a: Any) : Option[IOIQltyIndField] = a match {
    case v: String => Some(IOIQltyIndField(v))
    case v: Char => Some(IOIQltyIndField(v.toString))
    case v: IOIQltyIndField => Some(v)
    case _ => scala.Option.empty[IOIQltyIndField]
  } 
}
