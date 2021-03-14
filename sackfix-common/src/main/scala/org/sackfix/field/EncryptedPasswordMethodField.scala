package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class EncryptedPasswordMethodField(override val value: Int) extends SfFieldInt(1400, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1400)EncryptedPasswordMethod=(").append(value).append(")")
}

object EncryptedPasswordMethodField {
  val TagId = 1400  
  def apply(value: String) = try {
    new EncryptedPasswordMethodField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncryptedPasswordMethod("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncryptedPasswordMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncryptedPasswordMethodField]
  }

  def decode(a: Any) : Option[EncryptedPasswordMethodField] = a match {
    case v: String => Some(EncryptedPasswordMethodField(v))
    case v: Int => Some(EncryptedPasswordMethodField(v))
    case v: EncryptedPasswordMethodField => Some(v)
    case _ => scala.Option.empty[EncryptedPasswordMethodField]
  } 
}
