package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class SideMultiLegReportingTypeField(override val value: Int) extends SfFieldInt(752, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(752)SideMultiLegReportingType=(").append(value).append(")").append(SideMultiLegReportingTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SideMultiLegReportingTypeField {
  val TagId = 752 
  val SingleSecurity=1
  val IndividualLegOfAMultiLegSecurity=2
  val MultiLegSecurity=3
  lazy val fixDescriptionByValue = Map(1->"SINGLE_SECURITY",2->"INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY",
    3->"MULTI_LEG_SECURITY")
 
  def apply(value: String) = try {
    new SideMultiLegReportingTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SideMultiLegReportingType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SideMultiLegReportingTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SideMultiLegReportingTypeField]
  }

  def decode(a: Any) : Option[SideMultiLegReportingTypeField] = a match {
    case v: String => Some(SideMultiLegReportingTypeField(v))
    case v: Int => Some(SideMultiLegReportingTypeField(v))
    case v: SideMultiLegReportingTypeField => Some(v)
    case _ => scala.Option.empty[SideMultiLegReportingTypeField]
  } 
}
