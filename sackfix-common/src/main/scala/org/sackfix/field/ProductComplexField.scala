package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ProductComplexField(override val value: String) extends SfFieldString(1227, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1227)ProductComplex=(").append(value).append(")")
}

object ProductComplexField {
  val TagId = 1227  
  def decode(a: Option[Any]) : Option[ProductComplexField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ProductComplexField]
  }

  def decode(a: Any) : Option[ProductComplexField] = a match {
    case v: String => Some(ProductComplexField(v))
    case v: ProductComplexField => Some(v)
    case _ => scala.Option.empty[ProductComplexField]
  } 
}
