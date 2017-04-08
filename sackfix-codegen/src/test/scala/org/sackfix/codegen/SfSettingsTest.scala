package org.sackfix.codegen

import java.lang.{Boolean, Double, Long}
import java.time.Duration
import java.util
import java.util.Map.Entry
import java.util.concurrent.TimeUnit

import com.typesafe.config.{ConfigMemorySize, ConfigObject, ConfigResolveOptions, _}
import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfSettingsTest extends FlatSpec {
  behavior of "SfSettings"

  it should "load the configs" in {
    val c = ConfigFactory.parseString(
      """
        |quickfixresourcedir=quickfix1.6.0
        |codegen.generate.fields.package=org.sackfix.field
        |codegen.generate.fields.basedir=./sackfix-common/src/main/scala
        |codegen.generate.fields.firstfrom=fix50
        |
        |codegen.generate.messages {
        |  fix44 {
        |    input=quickfix1.6.0/FIX44.xml
        |    output=./sackfix-messages-fix44/src/main/scala
        |    package=org.sackfix.fix44
        |  }
        |  fix50 {
        |    input=quickfix1.6.0/FIX50SP2.modified.xml
        |    output=./sackfix-messages-fix50sp2/src/main/scala
        |    package=org.sackfix.fix50sp2
        |  }
        |}
      """.stripMargin)
    val conf = SfSettings(c)

    assert(conf.fieldsPackage=="org.sackfix.field")
    assert(conf.quickfixresourcedir=="quickfix1.6.0")
  }
}
