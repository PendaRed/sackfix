package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20210314
  */
case class ExDestinationIDSourceField(override val value: String) extends SfFieldString(1133, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1133)ExDestinationIDSource=(").append(value).append(")").append(ExDestinationIDSourceField.fixDescriptionByValue.getOrElse(value,""))
}

object ExDestinationIDSourceField {
  val TagId = 1133 
  val Bic="B"
  val GenerallyAcceptedMarketParticipantIdentifier="C"
  val Proprietary="D"
  val IsoCountryCode="E"
  val Mic="G"
  lazy val fixDescriptionByValue = Map("B"->"BIC","C"->"GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER",
    "D"->"PROPRIETARY","E"->"ISO_COUNTRY_CODE","G"->"MIC")
 
  def decode(a: Option[Any]) : Option[ExDestinationIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExDestinationIDSourceField]
  }

  def decode(a: Any) : Option[ExDestinationIDSourceField] = a match {
    case v: String => Some(ExDestinationIDSourceField(v))
    case v: Char => Some(ExDestinationIDSourceField(v.toString))
    case v: ExDestinationIDSourceField => Some(v)
    case _ => scala.Option.empty[ExDestinationIDSourceField]
  } 
}
