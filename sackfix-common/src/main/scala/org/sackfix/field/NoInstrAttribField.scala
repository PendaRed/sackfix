package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoInstrAttribField(override val value: Int) extends SfNumInGroup(870, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(870)NoInstrAttrib=(").append(value).append(")")
}

object NoInstrAttribField {
  val TagId = 870  
  def apply(value: String) = try {
    new NoInstrAttribField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoInstrAttrib("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoInstrAttribField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoInstrAttribField]
  }

  def decode(a: Any) : Option[NoInstrAttribField] = a match {
    case v: String => Some(NoInstrAttribField(v))
    case v: Int => Some(NoInstrAttribField(v))
    case v: NoInstrAttribField => Some(v)
    case _ => scala.Option.empty[NoInstrAttribField]
  } 
}
