package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoStatsIndicatorsField(override val value: Int) extends SfNumInGroup(1175, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1175)NoStatsIndicators=(").append(value).append(")")
}

object NoStatsIndicatorsField {
  val TagId = 1175  
  def apply(value: String) = try {
    new NoStatsIndicatorsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoStatsIndicators("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoStatsIndicatorsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoStatsIndicatorsField]
  }

  def decode(a: Any) : Option[NoStatsIndicatorsField] = a match {
    case v: String => Some(NoStatsIndicatorsField(v))
    case v: Int => Some(NoStatsIndicatorsField(v))
    case v: NoStatsIndicatorsField => Some(v)
    case _ => scala.Option.empty[NoStatsIndicatorsField]
  } 
}
