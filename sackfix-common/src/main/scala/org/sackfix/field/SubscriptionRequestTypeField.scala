package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class SubscriptionRequestTypeField(override val value: String) extends SfFieldString(263, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(263)SubscriptionRequestType=(").append(value).append(")").append(SubscriptionRequestTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SubscriptionRequestTypeField {
  val TagId = 263 
  val Snapshot="0"
  val SnapshotPlusUpdates="1"
  val DisablePreviousSnapshotPlusUpdateRequest="2"
  lazy val fixDescriptionByValue = Map("0"->"SNAPSHOT","1"->"SNAPSHOT_PLUS_UPDATES",
    "2"->"DISABLE_PREVIOUS_SNAPSHOT_PLUS_UPDATE_REQUEST")
 
  def decode(a: Option[Any]) : Option[SubscriptionRequestTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SubscriptionRequestTypeField]
  }

  def decode(a: Any) : Option[SubscriptionRequestTypeField] = a match {
    case v: String => Some(SubscriptionRequestTypeField(v))
    case v: Char => Some(SubscriptionRequestTypeField(v.toString))
    case v: SubscriptionRequestTypeField => Some(v)
    case _ => scala.Option.empty[SubscriptionRequestTypeField]
  } 
}
