package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170521
  */
case class NoCompIDsField(override val value: Int) extends SfNumInGroup(936, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(936)NoCompIDs=(").append(value).append(")")
}

object NoCompIDsField {
  val TagId = 936  
  def apply(value: String) = try {
    new NoCompIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoCompIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoCompIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoCompIDsField]
  }

  def decode(a: Any) : Option[NoCompIDsField] = a match {
    case v: String => Some(NoCompIDsField(v))
    case v: Int => Some(NoCompIDsField(v))
    case v: NoCompIDsField => Some(v)
    case _ => scala.Option.empty[NoCompIDsField]
  } 
}
