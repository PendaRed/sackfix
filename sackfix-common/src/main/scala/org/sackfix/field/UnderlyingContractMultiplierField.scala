package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20210314
  */
case class UnderlyingContractMultiplierField(override val value: Float) extends SfFieldFloat(436, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(436)UnderlyingContractMultiplier=(").append(value).append(")")
}

object UnderlyingContractMultiplierField {
  val TagId = 436  
  def apply(value: String) = try {
    new UnderlyingContractMultiplierField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingContractMultiplier("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingContractMultiplierField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingContractMultiplierField]
  }

  def decode(a: Any) : Option[UnderlyingContractMultiplierField] = a match {
    case v: String => Some(UnderlyingContractMultiplierField(v))
    case v: Float => Some(UnderlyingContractMultiplierField(v))
    case v: Double => Some(UnderlyingContractMultiplierField(v.toFloat))
    case v: Int => Some(UnderlyingContractMultiplierField(v.toFloat))
    case v: UnderlyingContractMultiplierField => Some(v)
    case _ => scala.Option.empty[UnderlyingContractMultiplierField]
  } 
}
