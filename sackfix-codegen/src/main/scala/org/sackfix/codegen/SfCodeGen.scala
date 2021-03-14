package org.sackfix.codegen

import com.typesafe.config.ConfigFactory
import org.sackfix.codegen.SfSettings.GenerateDetail

import java.io.{File, PrintWriter}
import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

/**
  * Created by Jonathan during 2016.
  *
  * Scala.xml is now seperate and I expect soon to die, but lets run with it still
  * https://bcomposes.wordpress.com/2012/05/04/basic-xml-processing-with-scala/
  */
object SfCodeGen extends App {
  var msgCnt = 1
  val MAX_GEN = 500000000

  //  if (args.length!=4) {
  //    usage()
  //    System.exit(1)
  //  }
  val config = SfSettings(ConfigFactory.load())

  // Mapped by the field number
  val fieldByUpperNameToField = scala.collection.mutable.Map.empty[String, FixFieldDetail]
  val fieldByUpperNameAndSpecName = scala.collection.mutable.Map.empty[String, FixFieldDetail]

  // the fields should be generated from the most recent fix spec
  config.versionsToGenerate.filter(_.fixVersionName == config.generateFieldsFirstFrom).toList match {
    case Nil => throw new RuntimeException(s"Bad config: ${config.generateFieldsFirstFrom} does not match a config in the list")
    case _ => // thats fine then
  }
  config.versionsToGenerate.zipWithIndex.foreach { case (details, index) =>
    val overwritePreviousFieldDetails: Boolean = details.fixVersionName == config.generateFieldsFirstFrom
    populateFieldLookup(details, overwritePreviousFieldDetails)
  }
  generateFieldFiles(config.fieldsBaseOutputDir, config.fieldsPackage)

  val resortedDetails = ArrayBuffer.empty[GenerateDetail]
  resortedDetails ++= config.versionsToGenerate.filter(d => d.fixVersionName == config.generateFieldsFirstFrom)
  resortedDetails ++= config.versionsToGenerate.filter(d => d.fixVersionName != config.generateFieldsFirstFrom)


  resortedDetails.zipWithIndex.foreach { case (details, index) =>
    val deleteFieldsAndRegenerate: Boolean = details.fixVersionName == config.generateFieldsFirstFrom
    generateFixCodeFiles(config.fieldsPackage, details, deleteFieldsAndRegenerate)
  }

  @tailrec
  private def addFieldToLookup(fieldDetail: FixFieldDetail, overwritePreviousFieldDetails: Boolean): FixFieldDetail = {
    // ie assign it to its current value, unless it has none, in which case give it a new value
    // but, there is a preferred spec - which should be the latest one, use that field defn in preference
    val upperFieldName = fieldDetail.name.toUpperCase
    fieldByUpperNameToField.get(upperFieldName) match {
      case None =>
        fieldByUpperNameToField(upperFieldName) = fieldDetail
        fieldDetail
      case Some(alreadyExists) =>
        // If the type is the same can reuse the key
        val newFieldType = SfCodeGeneratorField.generateFieldType(fieldDetail)
        val existingFieldType = SfCodeGeneratorField.generateFieldType(alreadyExists)
        if (existingFieldType == newFieldType) {
          if (overwritePreviousFieldDetails) {
            // Sadly the FIX folks changed the TYPE of fields over different versions, for instance
            // NoLegSecurityAltIDField used to be a string and is now a count for a group.
            fieldByUpperNameToField(upperFieldName) = fieldDetail
          } else {
            fieldByUpperNameToField(upperFieldName) = fieldByUpperNameToField.getOrElse(upperFieldName, fieldDetail)
          }
          fieldByUpperNameToField(upperFieldName)
        } else {
          addFieldToLookup(generateRenamedFieldDetails(fieldDetail, newFieldType), overwritePreviousFieldDetails)
        }
    }
  }


  /**
    * Different versions of fix can change the case of the field name, and also the type of the field name!
    */
  def populateFieldLookup(details: GenerateDetail,
                          overwritePreviousFieldDetails: Boolean): Unit = {
    val dictionary = new SfFixDictionaryReader
    dictionary.read(details.inputFile)

    dictionary.fields.foreach(fieldDetail => {
      val revisedFieldDetail = addFieldToLookup(fieldDetail, overwritePreviousFieldDetails)

      // We now map the old name to the new field details for this version of fix.
      val upperFieldName = fieldDetail.name.toUpperCase
      val key = upperFieldName + "_" + details.fixVersionName
      // So, now we want to map the fieldName in upper case, combined with the fix spec name to the
      // field, BUT, its a field with potentially a new name which includes the type
      fieldByUpperNameAndSpecName(key) = revisedFieldDetail
    })
  }

  def camelCase(nm: String): String = {
    nm.substring(0, 1).toUpperCase() + nm.substring(1).toLowerCase
  }

  def generateRenamedFieldDetails(fieldDetail: FixFieldDetail, newFieldType: String): FixFieldDetail = {
    // The type is difference, so change the name
    val postFix = camelCase(newFieldType)
    new FixFieldDetail(fieldDetail.number, fieldDetail.name + postFix,
      fieldDetail.fieldType, fieldDetail.allowOtherValues)
  }

  def generateFieldFiles(baseoutputDir: String, fieldsPackageName: String): Unit = {
    generateAllFieldsFiles(baseoutputDir, fieldsPackageName, fieldByUpperNameToField.values, deleteExisting = true)
  }

  def generateFixCodeFiles(fieldsPackageName: String, details: GenerateDetail, deleteExistingFieldClasses: Boolean): Unit = {
    val dictionary = new SfFixDictionaryReader
    dictionary.read(details.inputFile)

    generateAllMessageFiles(details.fixVersionName, details.inputFile, details.outputBaseDir, fieldsPackageName, details.genPackage, dictionary.messages)
    generateAllComponentFiles(details.fixVersionName, details.inputFile, details.outputBaseDir, fieldsPackageName, details.genPackage, dictionary.components)

    generateFieldConverter(details.inputFile, config.fieldsBaseOutputDir, fieldsPackageName,
      dictionary.fields, deleteExistingFieldClasses)

    // Actually, couldn't find a use for this:
    //generateGroupConverter(details.inputFile, details.outputBaseDir, fieldsPackageName, details.genPackage,
    //  dictionary.groups.values, deleteExistingFieldClasses)
    generateMessageFactory(details.inputFile, details.outputBaseDir, fieldsPackageName, details.genPackage,
      dictionary.messages, deleteExisting = true)

    // A one off hack to generate the header message, which I then manually edited to give me the
    // header message.
    //    val temp = new ArrayBuffer[FixMessageDef]
    //    temp += {
    //      val t1 = new FixMessageDef("header","1","app")
    //      dictionary.headerObj.subElements.foreach(t1.addSubElement(_))
    //      t1
    //    }
    //    generateAllMessageFiles(details.inputFile, config.fieldsBaseOutputDir, fieldsPackageName, "org.sackfix.message", temp)
  }

  /**
    * Only deletes a previous file if deleteExisting is true, otherwise it doesn't
    * regenerate
    */
  def generateAllFieldsFiles(outputDir: String, packageName: String,
                             fields: Iterable[FixFieldDetail], deleteExisting: Boolean): Unit = {
    val baseDir = createDir(outputDir, packageName)

    fields.foreach(fieldDetSpec => {
      try {
        // IOIid was renamed to IOIID, so generate the field from the central definition
        fieldByUpperNameToField.get(fieldDetSpec.name.toUpperCase()) match {
          case Some(fieldDet) =>
            val classFile = new File(baseDir, fieldDet.name + "Field.scala")
            if (!classFile.exists() || (classFile.exists() && deleteExisting)) {
              classFile.delete()

              val codeGen = new SfCodeGeneratorField(packageName, fieldDet)
              val pw = new PrintWriter(classFile)
              pw.print(codeGen.generateFieldClassStr)
              pw.close()
            }
          case None => throw new RuntimeException(s"Bug: could not find field in the lookup map [$fieldDetSpec]")
        }
      } catch {
        case ex: Throwable =>
          throw new Exception(s"Failed generating field [$fieldDetSpec]", ex)
      }
    }
    )
  }

  /**
    * Only deletes a previous file if deleteExisting is true, otherwise it doesn't
    * regenerate
    */
  def generateFieldConverter(sourceXmlSpenFileName: String, outputDir: String, packageName: String,
                             fields: ArrayBuffer[FixFieldDetail], deleteExisting: Boolean): Unit = {

    val baseDir = createDir(outputDir, packageName)
    val classFile = new File(baseDir, "SfFieldFactory.scala")
    if (!classFile.exists() || (classFile.exists() && deleteExisting)) {
      classFile.delete()

      val codeGen = new SfCodeGeneratorFieldFactory(sourceXmlSpenFileName, packageName, "SfFieldFactory",
        fields)
      val pw = new PrintWriter(classFile)

      pw.print(codeGen.generateClassStr)
      pw.close()
    }
  }

  /**
    * Generate a factory, that given the tag ID for the NoXXXX  sub repeating group will
    * give you the instance of the SfFixGroup which follows.
    * This has to be per fix version, and cannot be shared over all versions.
    */
  def generateGroupConverter(sourceXmlSpenFileName: String, outputDir: String,
                             fieldsPackageName: String, packageName: String,
                             groups: Iterable[FixGroupDef], deleteExisting: Boolean): Unit = {
    val baseDir = createDir(outputDir, packageName)
    val classFile = new File(baseDir, "SfGroupFactory.scala")
    if (!classFile.exists() || (classFile.exists() && deleteExisting)) {
      classFile.delete()

      val codeGen = new SfCodeGeneratorGroupFactory(sourceXmlSpenFileName, fieldsPackageName, packageName, "SfGroupFactory",
        groups)
      val pw = new PrintWriter(classFile)

      pw.print(codeGen.generateClassStr)
      pw.close()
    }
  }

  def generateMessageFactory(sourceXmlSpenFileName: String, outputDir: String,
                             fieldsPackageName: String, packageName: String,
                             messages: Iterable[FixMessageDef], deleteExisting: Boolean): Unit = {
    val baseDir = createDir(outputDir, packageName)
    val classFile = new File(baseDir, "SfMessageFactory.scala")
    if (!classFile.exists() || (classFile.exists() && deleteExisting)) {
      classFile.delete()

      val codeGen = new SfCodeGeneratorMessageFactory(sourceXmlSpenFileName, fieldsPackageName, packageName, "SfMessageFactory",
        messages)
      val pw = new PrintWriter(classFile)

      pw.print(codeGen.generateClassStr)
      pw.close()
    }
  }


  /**
    * @param fieldsPackageName Where the fields exist
    * @param packageName       Where this load of messages should be created
    */
  def generateAllMessageFiles(fixVersionName: String,
                              sourceXmlSpenFileName: String, outputDir: String,
                              fieldsPackageName: String,
                              packageName: String,
                              messages: ArrayBuffer[FixMessageDef]): Unit = {
    val baseDir = createDir(outputDir, packageName)

    messages.foreach(msg => {
      createClassFile(fixVersionName, baseDir, sourceXmlSpenFileName, fieldsPackageName, packageName, msg.generatedClassName, "SfFixMessageBody", Some("\"" + msg.msgType + "\""), "SfFixMessageDecoder", msg)
    })
  }

  /**
    * @param fieldsPackageName Where the fields exist
    * @param packageName       Where this load of components should be created
    */
  def generateAllComponentFiles(fixVersionName: String,
                                sourceXmlSpenFileName: String, outputDir: String,
                                fieldsPackageName: String,
                                packageName: String,
                                components: ArrayBuffer[FixComponentDetail]): Unit = {
    val baseDir = createDir(outputDir, packageName)

    components.foreach(c => {
      createClassFile(fixVersionName, baseDir, sourceXmlSpenFileName, fieldsPackageName, packageName, c.generatedClassName, "SfFixComponent", None, "SfFixDecoder", c)
    })
  }

  /**
    * @param superClassParams For messages this is a message type string, like "AA"
    */
  private def createClassFile(fixVersionName: String, baseDir: File, sourceXmlSpenFileName: String, fieldsPackageName: String,
                              packageName: String, generatedClassName: String, superClassName: String,
                              superClassParams: Option[String], decoderSuperClass: String,
                              nodeDef: FixNodeDef): Unit = {
    msgCnt = msgCnt + 1
    if (msgCnt < MAX_GEN) {
      val classFile = new File(baseDir, generatedClassName + ".scala")
      if (classFile.exists()) classFile.delete

      val codeGen = new SfCodeGeneratorMessage(fixVersionName, sourceXmlSpenFileName, fieldsPackageName,
        packageName, generatedClassName, superClassName, superClassParams, decoderSuperClass, nodeDef,
        fieldByUpperNameAndSpecName)
      //use in dev    if (codeGen.hasSubComponents && codeGen.hasSubGroups) {
      val pw = new PrintWriter(classFile)
      pw.print(codeGen.generateClassFile)
      pw.close()

      generateNestedGroups(fixVersionName, baseDir, sourceXmlSpenFileName, fieldsPackageName, packageName,
        generatedClassName, nodeDef)
      //    }
    }
  }

  /**
    * Components could be stucck into their own pacakge to differentiate them,
    * but my preference is to name them Component, and Group as group and Message as Message
    */
  private def generateComponent(fixVersionName: String, baseDir: File, sourceXmlSpenFileName: String, fieldsPackageName: String,
                                packageName: String, classNamePrefix: String, parentNode: FixNodeDef): Unit = {
    parentNode.subElements.zipWithIndex.foreach {
      case (component: FixComponentDef, i) =>
        createClassFile(fixVersionName, baseDir, sourceXmlSpenFileName, fieldsPackageName, packageName, component.generatedClassName, "SfFixComponent", None, "SfFixDecoder", component)
      case _ =>
    }
  }


  /**
    * A group is a collection of fields in order, and it is prefixed by a count of how many
    * times the group repeats.  If any field in the group is mandatory then the count is mandatory.
    * If the group is present then the first element of the group must always be present as it acts
    * as a delimiter
    */
  private def generateNestedGroups(fixVersionName: String, baseDir: File, sourceXmlSpenFileName: String, fieldsPackageName: String,
                                   packageName: String, classNamePrefix: String, parentNode: FixNodeDef): Unit = {
    parentNode.subElements.zipWithIndex.foreach {
      case (subGroup: FixGroupDef, i) =>
        createClassFile(fixVersionName, baseDir, sourceXmlSpenFileName, fieldsPackageName, packageName, subGroup.generatedClassName, "SfFixGroup", None, "SfGroupDecoder", subGroup)
      case _ =>
    }
  }

  def createDir(outputDir: String, packageName: String): File = {
    val baseDir: File = new File(getPackageDir(outputDir, packageName))
    if (!baseDir.exists()) {
      baseDir.mkdirs()
    }
    baseDir
  }

  def getPackageDir(outputDir: String, packageName: String): String = {
    val localisedOutputDir = outputDir.replace('\\', File.separatorChar)
    val subDir = packageName.replace('.', File.separatorChar)
    localisedOutputDir + (if (!outputDir.endsWith(File.pathSeparator)) File.separator else "") + subDir
  }

  //  SfCodeGenerator.generate(args(1), args(2))


  def usage(): Unit = {
    println(
      """Usage:  SfCodeGen filename outputdir fieldspackage messagesPackage
        |   where filename        : full path to quickfix4j fix xml defn
        |         outputdir       : The base directory to generate the classes
        |         fieldspackage   : the package to generate the field classes in
        |         messagespackage : the package to generate the messages classes in
        |
        |   e.g.  SfCodeGen /java/org.quickfixj-1.6.0/etc/FIX44.xml /all_dev/scala/sackfix/sackfixcodegen/src/generated org.sackfix org.sackfix.fix44
      """.stripMargin)
  }
}
