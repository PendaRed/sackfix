package org.sackfix.codegen

import SfSettings.GenerateDetail
import com.typesafe.config.Config

object SfSettings {
  case class GenerateDetail(fixVersionName:String, inputFile:String, outputBaseDir:String,
                       genPackage:String)
}

/**
  * Created by Jonathan during 2016.
  */
case class SfSettings(config:Config) {

  import scala.jdk.CollectionConverters._
  // Config resolve is automatically called for config.load, should be
  // called at least once and is a no-op if called more than once.
  config.resolve()

  val quickfixresourcedir: String = config.getString("quickfixresourcedir")

  val fieldsPackage: String = config.getString("codegen.generate.fields.package")

  val fieldsBaseOutputDir: String = config.getString("codegen.generate.fields.basedir")

  val generateFieldsFirstFrom: String = config.getString("codegen.generate.fields.firstfrom")

  // A list of the things to generate
  val versionsToGenerate: collection.Set[GenerateDetail] =
    // HOCON can either get a flat rendition, or a tree of ConfigObject s
    config.getObject("codegen.generate.messages").asScala.keySet.map( (fixVersion:String) => {
      val inputFile = config.getString(s"codegen.generate.messages.$fixVersion.input")
      val outputBaseDir = config.getString(s"codegen.generate.messages.$fixVersion.output")
      val genPackage = config.getString(s"codegen.generate.messages.$fixVersion.package")

      GenerateDetail(fixVersion, inputFile, outputBaseDir, genPackage)
    })
}
