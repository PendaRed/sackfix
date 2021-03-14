package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170521
  */
case class UserStatusField(override val value: Int) extends SfFieldInt(926, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(926)UserStatus=(").append(value).append(")").append(UserStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object UserStatusField {
  val TagId = 926 
  val LoggedIn=1
  val NotLoggedIn=2
  val UserNotRecognised=3
  val PasswordIncorrect=4
  val PasswordChanged=5
  val Other=6
  lazy val fixDescriptionByValue = Map(1->"LOGGED_IN",2->"NOT_LOGGED_IN",
    3->"USER_NOT_RECOGNISED",4->"PASSWORD_INCORRECT",5->"PASSWORD_CHANGED",
    6->"OTHER")
 
  def apply(value: String) = try {
    new UserStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UserStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UserStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UserStatusField]
  }

  def decode(a: Any) : Option[UserStatusField] = a match {
    case v: String => Some(UserStatusField(v))
    case v: Int => Some(UserStatusField(v))
    case v: UserStatusField => Some(v)
    case _ => scala.Option.empty[UserStatusField]
  } 
}
