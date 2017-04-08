package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class ContractMultiplierUnitField(override val value: Int) extends SfFieldInt(1435, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1435)ContractMultiplierUnit=(").append(value).append(")").append(ContractMultiplierUnitField.fixDescriptionByValue.getOrElse(value,""))
}

object ContractMultiplierUnitField {
  val TagId = 1435 
  val Shares=0
  val Hours=1
  val Days=2
  lazy val fixDescriptionByValue = Map(0->"SHARES",1->"HOURS",
    2->"DAYS")
 
  def apply(value: String) = try {
    new ContractMultiplierUnitField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContractMultiplierUnit("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContractMultiplierUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContractMultiplierUnitField]
  }

  def decode(a: Any) : Option[ContractMultiplierUnitField] = a match {
    case v: String => Some(ContractMultiplierUnitField(v))
    case v: Int => Some(ContractMultiplierUnitField(v))
    case v: ContractMultiplierUnitField => Some(v)
    case _ => scala.Option.empty[ContractMultiplierUnitField]
  } 
}
