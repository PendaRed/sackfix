package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class CardHolderNameField(override val value: String) extends SfFieldString(488, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(488)CardHolderName=(").append(value).append(")")
}

object CardHolderNameField {
  val TagId = 488  
  def decode(a: Option[Any]) : Option[CardHolderNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CardHolderNameField]
  }

  def decode(a: Any) : Option[CardHolderNameField] = a match {
    case v: String => Some(CardHolderNameField(v))
    case v: CardHolderNameField => Some(v)
    case _ => scala.Option.empty[CardHolderNameField]
  } 
}
