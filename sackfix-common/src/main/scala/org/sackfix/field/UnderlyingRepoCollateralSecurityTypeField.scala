package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170521
  */
case class UnderlyingRepoCollateralSecurityTypeField(override val value: String) extends SfFieldString(243, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(243)UnderlyingRepoCollateralSecurityType=(").append(value).append(")")
}

object UnderlyingRepoCollateralSecurityTypeField {
  val TagId = 243  
  def decode(a: Option[Any]) : Option[UnderlyingRepoCollateralSecurityTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingRepoCollateralSecurityTypeField]
  }

  def decode(a: Any) : Option[UnderlyingRepoCollateralSecurityTypeField] = a match {
    case v: String => Some(UnderlyingRepoCollateralSecurityTypeField(v))
    case v: UnderlyingRepoCollateralSecurityTypeField => Some(v)
    case _ => scala.Option.empty[UnderlyingRepoCollateralSecurityTypeField]
  } 
}
