package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20210314
  */
case class NoBidComponentsField(override val value: Int) extends SfNumInGroup(420, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(420)NoBidComponents=(").append(value).append(")")
}

object NoBidComponentsField {
  val TagId = 420  
  def apply(value: String) = try {
    new NoBidComponentsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoBidComponents("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoBidComponentsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoBidComponentsField]
  }

  def decode(a: Any) : Option[NoBidComponentsField] = a match {
    case v: String => Some(NoBidComponentsField(v))
    case v: Int => Some(NoBidComponentsField(v))
    case v: NoBidComponentsField => Some(v)
    case _ => scala.Option.empty[NoBidComponentsField]
  } 
}
