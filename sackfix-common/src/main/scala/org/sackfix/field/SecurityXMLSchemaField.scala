package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class SecurityXMLSchemaField(override val value: String) extends SfFieldString(1186, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1186)SecurityXMLSchema=(").append(value).append(")")
}

object SecurityXMLSchemaField {
  val TagId = 1186  
  def decode(a: Option[Any]) : Option[SecurityXMLSchemaField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityXMLSchemaField]
  }

  def decode(a: Any) : Option[SecurityXMLSchemaField] = a match {
    case v: String => Some(SecurityXMLSchemaField(v))
    case v: SecurityXMLSchemaField => Some(v)
    case _ => scala.Option.empty[SecurityXMLSchemaField]
  } 
}
