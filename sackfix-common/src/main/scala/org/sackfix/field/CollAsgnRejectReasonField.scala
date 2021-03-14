package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class CollAsgnRejectReasonField(override val value: Int) extends SfFieldInt(906, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(906)CollAsgnRejectReason=(").append(value).append(")").append(CollAsgnRejectReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object CollAsgnRejectReasonField {
  val TagId = 906 
  val UnknownDeal=0
  val UnknownOrInvalidInstrument=1
  val UnauthorizedTransaction=2
  val InsufficientCollateral=3
  val InvalidTypeOfCollateral=4
  val ExcessiveSubstitution=5
  val Other=99
  lazy val fixDescriptionByValue = Map(0->"UNKNOWN_DEAL",1->"UNKNOWN_OR_INVALID_INSTRUMENT",
    2->"UNAUTHORIZED_TRANSACTION",3->"INSUFFICIENT_COLLATERAL",4->"INVALID_TYPE_OF_COLLATERAL",
    5->"EXCESSIVE_SUBSTITUTION",99->"OTHER")
 
  def apply(value: String) = try {
    new CollAsgnRejectReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CollAsgnRejectReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CollAsgnRejectReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollAsgnRejectReasonField]
  }

  def decode(a: Any) : Option[CollAsgnRejectReasonField] = a match {
    case v: String => Some(CollAsgnRejectReasonField(v))
    case v: Int => Some(CollAsgnRejectReasonField(v))
    case v: CollAsgnRejectReasonField => Some(v)
    case _ => scala.Option.empty[CollAsgnRejectReasonField]
  } 
}
