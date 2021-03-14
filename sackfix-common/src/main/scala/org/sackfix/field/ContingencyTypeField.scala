package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20210314
  */
case class ContingencyTypeField(override val value: Int) extends SfFieldInt(1385, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1385)ContingencyType=(").append(value).append(")").append(ContingencyTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ContingencyTypeField {
  val TagId = 1385 
  val OneCancelsTheOther=1
  val OneTriggersTheOther=2
  val OneUpdatesTheOtherAbsoluteQuantityReduction=3
  val OneUpdatesTheOtherProportionalQuantityReduction=4
  lazy val fixDescriptionByValue = Map(1->"ONE_CANCELS_THE_OTHER",2->"ONE_TRIGGERS_THE_OTHER",
    3->"ONE_UPDATES_THE_OTHER_ABSOLUTE_QUANTITY_REDUCTION",4->"ONE_UPDATES_THE_OTHER_PROPORTIONAL_QUANTITY_REDUCTION")
 
  def apply(value: String) = try {
    new ContingencyTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContingencyType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContingencyTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContingencyTypeField]
  }

  def decode(a: Any) : Option[ContingencyTypeField] = a match {
    case v: String => Some(ContingencyTypeField(v))
    case v: Int => Some(ContingencyTypeField(v))
    case v: ContingencyTypeField => Some(v)
    case _ => scala.Option.empty[ContingencyTypeField]
  } 
}
