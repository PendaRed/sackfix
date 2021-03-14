package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class AdjustmentTypeField(override val value: Int) extends SfFieldInt(718, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(718)AdjustmentType=(").append(value).append(")").append(AdjustmentTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object AdjustmentTypeField {
  val TagId = 718 
  val ProcessRequestAsMarginDisposition=0
  val DeltaPlus=1
  val DeltaMinus=2
  val Final=3
  lazy val fixDescriptionByValue = Map(0->"PROCESS_REQUEST_AS_MARGIN_DISPOSITION",1->"DELTA_PLUS",
    2->"DELTA_MINUS",3->"FINAL")
 
  def apply(value: String) = try {
    new AdjustmentTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new AdjustmentType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[AdjustmentTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AdjustmentTypeField]
  }

  def decode(a: Any) : Option[AdjustmentTypeField] = a match {
    case v: String => Some(AdjustmentTypeField(v))
    case v: Int => Some(AdjustmentTypeField(v))
    case v: AdjustmentTypeField => Some(v)
    case _ => scala.Option.empty[AdjustmentTypeField]
  } 
}
