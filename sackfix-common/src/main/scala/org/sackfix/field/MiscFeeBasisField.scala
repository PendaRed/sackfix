package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class MiscFeeBasisField(override val value: Int) extends SfFieldInt(891, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(891)MiscFeeBasis=(").append(value).append(")").append(MiscFeeBasisField.fixDescriptionByValue.getOrElse(value,""))
}

object MiscFeeBasisField {
  val TagId = 891 
  val Absolute=0
  val PerUnit=1
  val Percentage=2
  lazy val fixDescriptionByValue = Map(0->"ABSOLUTE",1->"PER_UNIT",
    2->"PERCENTAGE")
 
  def apply(value: String) = try {
    new MiscFeeBasisField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MiscFeeBasis("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MiscFeeBasisField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MiscFeeBasisField]
  }

  def decode(a: Any) : Option[MiscFeeBasisField] = a match {
    case v: String => Some(MiscFeeBasisField(v))
    case v: Int => Some(MiscFeeBasisField(v))
    case v: MiscFeeBasisField => Some(v)
    case _ => scala.Option.empty[MiscFeeBasisField]
  } 
}
