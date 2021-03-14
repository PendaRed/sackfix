package org.sackfix.common.config

import java.net.InetAddress

import com.typesafe.config.Config
import com.typesafe.config.ConfigException.BadValue

/**
  * Created by Jonathan during 2016.
  */
object SfConfigUtils {
  def toBooleanFromYN(config: Config, configItemName: String): Boolean = config.getString(configItemName) match {
    case "Y" => true
    case _ => false
  }

  def toInetAddress(config: Config, configItemName: String): InetAddress = {
    val strVal = config.getString(configItemName)
    try {
      InetAddress.getByName(strVal)
    } catch {
      case ex:Exception => throw new BadValue(configItemName, s"Failed to convert value [$strVal] to an InetAddress", ex)
    }
  }

  def getOptionalInetAddressList(config: Config, configItemName: String): Option[List[InetAddress]] = {
    if (config hasPath configItemName) Some(config.getString(configItemName).split(",").map( str => toInetAddress(config, str.trim)).toList)
    else None
  }
  def getOptionalString(config: Config, configItemName: String): Option[String] = {
    if (config hasPath configItemName) Some(config.getString(configItemName)) else None
  }

  def getOptionalInt(config: Config, configItemName: String): Option[Int] = {
    if (config hasPath configItemName) Some(config.getInt(configItemName)) else None
  }

  def getOptionalYN(config: Config, configItemName: String): Option[Boolean] = {
    if (config hasPath configItemName) Some(toBooleanFromYN(config, configItemName)) else None
  }

  def getOptionalInetAddress(config: Config, configItemName: String): Option[InetAddress] = {
    if (config hasPath configItemName) Some(toInetAddress(config, configItemName)) else None
  }
}
