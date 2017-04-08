package org.sackfix.codegen

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
  * Created by Jonathan during 2016.
  */
class SfCodeGeneratorMessageFactory(val sourceXmlSpenFileName: String,
                                    val fieldsPackageName: String, val packageName: String,
                                    val cname: String,
                                    messages: Iterable[FixMessageDef]) {

  /**
    * For a field definition this generates the full class file.
    */
  def generateClassStr: String = {
    generateFileHeader + generateMessageCreator
  }

  private def generateMessageCreator: String = {
    s"""object $cname {
        |  def getMessage(msgType:String):Option[SfFixMessageDecoder] = msgType match {
        |${
      messages.map(msgDef => {
        s"""    case "${msgDef.msgType}" => Some(${msgDef.generatedClassName})"""
      }).mkString("\n")
    }
        |    case _ => None
        |  }
        |}
        |""".stripMargin
  }

  private def generateFileHeader: String = {
    s"""package $packageName
        |
        |import org.sackfix.common.validated.fields.SfFixMessageDecoder
        |
        |/**
        |  * Generated by SackFix code generator on ${DateTimeFormatter.BASIC_ISO_DATE.format(LocalDateTime.now())}
        |  * Source specification was read from:
        |  *   $sourceXmlSpenFileName
        |  */
        |""".stripMargin
  }

}