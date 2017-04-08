package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class AllocTypeField(override val value: Int) extends SfFieldInt(626, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(626)AllocType=(").append(value).append(")").append(AllocTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object AllocTypeField {
  val TagId = 626 
  val Calculated=1
  val Preliminary=2
  val SellsideCalculatedUsingPreliminary=3
  val SellsideCalculatedWithoutPreliminary=4
  val ReadyToBookSingleOrder=5
  val BuysideReadyToBook=6
  val WarehouseInstruction=7
  val RequestToIntermediary=8
  val Accept=9
  val Reject=10
  val AcceptPending=11
  val IncompleteGroup=12
  val CompleteGroup=13
  val ReversalPending=14
  lazy val fixDescriptionByValue = Map(1->"CALCULATED",2->"PRELIMINARY",
    3->"SELLSIDE_CALCULATED_USING_PRELIMINARY",4->"SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY",5->"READY_TO_BOOK_SINGLE_ORDER",
    6->"BUYSIDE_READY_TO_BOOK",7->"WAREHOUSE_INSTRUCTION",8->"REQUEST_TO_INTERMEDIARY",
    9->"ACCEPT",10->"REJECT",11->"ACCEPT_PENDING",
    12->"INCOMPLETE_GROUP",13->"COMPLETE_GROUP",14->"REVERSAL_PENDING")
 
  def apply(value: String) = try {
    new AllocTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AllocType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AllocTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocTypeField]
  }

  def decode(a: Any) : Option[AllocTypeField] = a match {
    case v: String => Some(AllocTypeField(v))
    case v: Int => Some(AllocTypeField(v))
    case v: AllocTypeField => Some(v)
    case _ => scala.Option.empty[AllocTypeField]
  } 
}
