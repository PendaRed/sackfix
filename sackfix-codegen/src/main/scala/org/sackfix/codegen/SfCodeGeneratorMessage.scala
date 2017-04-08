package org.sackfix.codegen

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.sackfix.common.validated.fields.SfFixRenderable

import scala.collection.mutable.StringBuilder

/**
  * Created by Jonathan during 2016.
  */
object SfCodeGeneratorMessage {
  def paramName(v:String) = {
    ""+v.charAt(0).toLower+v.substring(1)
  }
  def getMessageClassName(nm: String) : String = {
    nm+"Message"
  }
  // parent class name is always "", but maybe some fix version will overload the same name and this will be
  // needed... the fix spec is a bit loose about repeating groups.
  def getGroupClassName(parentClassName:String, noGroupsFieldName:String) : String = {
    if (noGroupsFieldName.startsWith("No")) {
      parentClassName+noGroupsFieldName.substring(2) +"Group"
    }
    else parentClassName+noGroupsFieldName +"Group"
  }
  def getComponentClassName(nm: String) : String = {
    nm+"Component"
  }
  def getFieldClassName(nm: String) : String = {
    nm+"Field"
  }

  def getFieldClassName(f:FixNodeDef, fixSpecName:String,
                        allFieldByUpperNameAndFixVersionMap: scala.collection.mutable.Map[String, FixFieldDetail]) : String = {
    // This is horrible - from Fix44 to Fix5 they change IOIid to IOIID, so I try here to
    // get the single value, which will work for everything.
    val key = f.name.toUpperCase()+"_"+fixSpecName

    allFieldByUpperNameAndFixVersionMap.get(key) match {
      case Some(fieldDetail) =>
        fieldDetail.generatedClassName
      case None => f.generatedClassName
    }
  }
}

/**
  * Generates the code for Messages and also for nested groups
  *
  * @param packageName Is added to the end of the package name
  */
class SfCodeGeneratorMessage(val fixVersionName:String,
                             val sourceXmlSpenFileName:String, val fieldsPackageName:String, val packageName:String,
                             val generatedClassName:String,
                             val superClassName:String,
                             val superClassParams:Option[String],
                             val decoderSuperClass:String,
                             val msgDef: FixNodeDef,
                             val fieldByUpperNameAndSpecName: scala.collection.mutable.Map[String, FixFieldDetail]) {

  def generateClassFile : String= {
    s"""$generateHeader
       |$generateCtor
       |$generateObject
     """.stripMargin
  }

  def generateHeader :String= {
    s"""package $packageName
        |
        |$generateImports
        |/**
        |  * Generated by SackFix code generator on ${DateTimeFormatter.BASIC_ISO_DATE.format(LocalDateTime.now())}
        |  * Source specification was read from:
        |  *   $sourceXmlSpenFileName
        |  */""".stripMargin
  }
  def generateImports :String= {
    s"""import $fieldsPackageName._
        |import org.sackfix.common.validated.fields.{$superClassName, $decoderSuperClass, SfFixFieldsToAscii, SfFixRenderable}
        |import org.sackfix.common.message.SfRepeatingGroupCountException
        |import scala.annotation.tailrec
        |import scala.collection.immutable.HashSet
        |import scala.collection.mutable.ArrayBuffer
        |
        |"""
//    +
//    {if (hasSubGroups) "import scala.collection.mutable.ArrayBuffer\n" else ""}
  }
  def generateCtor:String = {
    val padding = pad(s"case class $generatedClassName".length+1)
    s"""case class $generatedClassName${generateCtorParams(padding)} extends $superClassName${superClassParams match {
      case Some(params)=>s"($params)"
      case None =>""
    }}  with SfFixRenderable with SfFixFieldsToAscii {
       |$generateToMsgBodyStr
       |}
     """.stripMargin
  }

  def hasSubGroups : Boolean = msgDef.subElements.exists(_.isInstanceOf[FixGroupDef])
  def hasSubComponents : Boolean = msgDef.subElements.exists(_.isInstanceOf[FixComponentDef])

  private def pad(i:Int) = " "*i

  /**
    * Generate the full list of all the fields for the class
    */
  private def generateCtorParams(padding:String) :String = {
    if (msgDef.subElements.isEmpty) ""
    else "("+
      msgDef.subElements.zipWithIndex.map{
        case (subElement:FixNodeDef, i) => addParam(subElement,padding)}.mkString(",\n"+padding)+ ")"
  }

  /**
    * Generates the parameter line for the ctor - either as a field, or as an Option on the field
    */
  private def addParam(subElement:FixNodeDef, padding:String ) =  subElement match {
    case fldDef: FixFieldDef =>  generateFieldCtorSection(fldDef)
    case groupDef: FixGroupDef => generateGroupCtorSection(groupDef, padding)
    case componentDef: FixComponentDef => generateComponentCtorSection(componentDef)
  }

  private def generateFieldCtorSection(f:FixFieldDef):String = {
    // This is horrible - from Fix44 to Fix5 they change IOIid to IOIID, so I try here to
    // get the single value, which will work for everything.
    val generatedClassName = SfCodeGeneratorMessage.getFieldClassName(f, fixVersionName, fieldByUpperNameAndSpecName)
    s"${SfCodeGeneratorMessage.paramName (generatedClassName)}:" +
      s"${if (f.required) "" else "Option["}${generatedClassName}${if (f.required) "" else "]=None"}"
  }

  private def generateComponentCtorSection(f:FixComponentDef):String = {
    val componentClassName = SfCodeGeneratorMessage.getComponentClassName(f.name)
    s"${SfCodeGeneratorMessage.paramName (componentClassName)}:" +
      s"${if (f.required) "" else "Option["}$componentClassName${if (f.required) "" else "]=None"}"
  }

  /**
    * Groups have a field which is the count, followed by a collection of the repeating groups
    */
  private def generateGroupCtorSection(g:FixGroupDef, padding:String):String = {
    val groupClassName = g.generatedClassName
    val fieldClassName = SfCodeGeneratorMessage.getFieldClassName(g, fixVersionName, fieldByUpperNameAndSpecName)

    s"${SfCodeGeneratorMessage.paramName (fieldClassName)}:"+
    s"${if (g.required) "" else "Option["}$fieldClassName${if (g.required) "" else "]=None"},\n"+padding+
    s"${SfCodeGeneratorMessage.paramName(groupClassName+"s")}: ${if (g.required) "" else "Option["}List[$groupClassName]${if (g.required) "" else "]=None"}"
  }

  def generateObject :String= {
    s"""object $generatedClassName extends $decoderSuperClass {
       |$generateMsgTypeConstant
       |$generateFieldCheckMethods $generateFirstFieldForGroupsAndComponents $generateDecoder
       |}""".stripMargin
  }

  private def generateMsgTypeConstant: String = {
    msgDef match {
      case m:FixMessageDef =>
        superClassParams match {
          case Some(params)=>
            s"""  val MsgType=$params
               |  val MsgName="${msgDef.name}"
             """.stripMargin
          case None =>""
        }
      case _ => "" // only messages get the constands
    }
  }

  private def generateToMsgBodyStr = {
    // optional flds can map like this
    //   f1.map(_.fixStr).getOrElse("")
    generateRepeatingGroupCountChecks+
    s"""\n  override lazy val fixStr : String = appendFixStr().toString
       |  override def appendFixStr(b:StringBuilder = new StringBuilder): StringBuilder = format(formatForFix, b)
       |
       |  override def toString():String = appendStringBuilder().toString()
       |  def appendStringBuilder(b:StringBuilder = new StringBuilder) : StringBuilder = format(formatForToString, b)
       |
       |  def format( fmt: ((StringBuilder,SfFixRenderable)=>Unit), b:StringBuilder = new StringBuilder()): StringBuilder = {
       |    ${generateFormatForFields()}
       |    b
       |  }
       |""".stripMargin
  }

  private def generateFormatForFields() = {
    val pad = "\n    "
    if (msgDef.subElements.isEmpty) "\"\""
    else ""+
      msgDef.subElements.zipWithIndex.map{
        case (subElement:FixNodeDef, i) => addToMsgBodyParam(subElement, pad)}.mkString(pad)
  }


  private def addToMsgBodyParam(subElement:FixNodeDef, pad:String ) =  subElement match {
    case groupDef: FixGroupDef =>
      // There is the count field, and then the array of repeating groups
      val fieldClassName = SfCodeGeneratorMessage.getFieldClassName(groupDef, fixVersionName, fieldByUpperNameAndSpecName)
      val groupFieldName = SfCodeGeneratorMessage.paramName(groupDef.generatedClassName+"s")

      // Since the lists are lists of options, then you have to read about the sugar for
      // Option which means you can use map and a PartialFunction. Good luck with that.
      if (groupDef.required) s"fmt(b,${SfCodeGeneratorMessage.paramName(fieldClassName)})"
      else s"""${SfCodeGeneratorMessage.paramName(fieldClassName)}.foreach(fmt(b,_))"""+
        s"""$pad$groupFieldName.getOrElse(List.empty).foreach(fmt(b,_))"""
    case fieldDef : FixFieldDef=>
      // option.map is clever....
      val fieldClassName = SfCodeGeneratorMessage.getFieldClassName(fieldDef, fixVersionName, fieldByUpperNameAndSpecName)
      if (fieldDef.required) s"fmt(b,${SfCodeGeneratorMessage.paramName(fieldClassName)})"
      else s"""${SfCodeGeneratorMessage.paramName(fieldClassName)}.foreach(fmt(b,_))"""
    case componentDef : FixComponentDef=>
      // option.map is clever....
      val componentClassName = SfCodeGeneratorMessage.getComponentClassName(componentDef.name)
      if (componentDef.required) s"fmt(b,${SfCodeGeneratorMessage.paramName(componentClassName)})"
      else s"""${SfCodeGeneratorMessage.paramName(componentClassName)}.foreach(fmt(b,_))"""
  }

  private def generateRepeatingGroupCountChecks():String = {
    val pad = "  "
    if (msgDef.subElements.isEmpty) "\"\""
    else ""+
      msgDef.subElements.zipWithIndex.map{
        case (subElement:FixNodeDef, i) => addCheckGroupsCount(subElement, pad)}.mkString
  }
  private def addCheckGroupsCount(subElement:FixNodeDef, pad:String ) =  subElement match {
    case groupDef: FixGroupDef =>
      // There is the count field, and then the array of repeating groups
      val fieldClassName = SfCodeGeneratorMessage.getFieldClassName(groupDef, fixVersionName, fieldByUpperNameAndSpecName)
      val groupFieldName = SfCodeGeneratorMessage.paramName(groupDef.generatedClassName+"s")

      val countFieldName = SfCodeGeneratorMessage.paramName(fieldClassName)

      if (groupDef.required) {
        s"""${pad}if ($countFieldName.value != $groupFieldName.size)
           |${pad}  throw SfRepeatingGroupCountException($fieldClassName.TagId,$countFieldName.value, $groupFieldName.size)
           |"""
      } else {
        s"""${pad}if ($countFieldName.map(_.value).getOrElse(0) != $groupFieldName.map(_.size).getOrElse(0))
        |${pad}  throw SfRepeatingGroupCountException($fieldClassName.TagId,$countFieldName.map(_.value).getOrElse(0), ${groupFieldName}.map(_.size).getOrElse(0))
        |"""
      }
    case _=> ""
  }

  /**
    * Adds the isMandatoryField, isOptionalField and isFieldOf to the companion object
    */
  def generateFieldCheckMethods = {
    val mandFlds = msgDef.subElements.filter(_ match {
      case f: FixOptionalFieldDef => f.required
      case _ => true
    })
    val optionalFlds = msgDef.subElements.filter(_ match {
      case f: FixOptionalFieldDef => !f.required
      case _ => false
    })
    val groupsAndComponents = msgDef.subElements.filter(_ match {
      case f:FixGroupDef => true
      case f:FixComponentDef => true
      case _ => false
    })
    s"""${generateContentField("Mandatory",mandFlds, groupsAndComponents)}
       |
       |${generateContentField("Optional",optionalFlds, groupsAndComponents)}
       |
       |  override def isFieldOf(tagId:Int) : Boolean = isMandatoryField(tagId) || isOptionalField(tagId) ${
        {if (groupsAndComponents.nonEmpty) {" || " +
          groupsAndComponents.zipWithIndex.map{case (f, i)=>addTestFieldOf(f,i)}.mkString(" || ")
        } else ""}
    }
       |
       | ${generateIsRepeatingGroupTag()}
     """.stripMargin
  }

  private def addTestFieldOf(subElement:FixNodeDef, count:Int) = {
    s"${if (count%3==0) "\n    " else ""}"+
      s"${subElement match {
        case f: FixGroupDef => f.generatedClassName
        case c: FixComponentDef => c.generatedClassName
      }}" +
      ".isFieldOf(tagId)"
  }


  private def generateContentField(hashSetName:String, flds : Seq[FixNodeDef],
                                   groupsAndComponents:Seq[FixNodeDef]):String = {
    s"""  override val ${hashSetName}Fields = HashSet[Int](${
      flds.filter(!_.isInstanceOf[FixComponentDef]).zipWithIndex.map{
        case (subElement:FixNodeDef, i) => addMandOptField(subElement,i)}.mkString(", ")+ ")"
    }
    |
    |  override def is${hashSetName}Field(tagId:Int) : Boolean = {
    |    ${hashSetName}Fields.contains(tagId) ${generateSubContentIsPredicate(hashSetName,groupsAndComponents)}
    |  }""".stripMargin
  }

  private def generateSubContentIsPredicate(hashSetName:String,
                                            groupsAndComponents:Seq[FixNodeDef]):String = {
    if (groupsAndComponents.isEmpty) ""
    else {
      " || "+groupsAndComponents.zipWithIndex.map{case (n:FixNodeDef, i:Int) =>addIsPredicate(hashSetName, n,i)}.mkString(" || ")
    }
  }

  private def addIsPredicate(hashSetName:String, subElement:FixNodeDef, count:Int) = {
    s"${if (count%4==0) "\n    " else ""}"+
    s"${subElement match {
      case f: FixGroupDef => f.generatedClassName
      case c: FixComponentDef => c.generatedClassName
    }}" +
      s".is${hashSetName}Field(tagId)"
  }

  private def addMandOptField(subElement:FixNodeDef, fieldNum:Int ) = {
      s"${if (fieldNum%5==0) "\n    " else ""}" +
      s"${subElement match {
        case f: FixFieldDef => SfCodeGeneratorMessage.getFieldClassName(f, fixVersionName, fieldByUpperNameAndSpecName)
        case f: FixGroupDef => SfCodeGeneratorMessage.getFieldClassName(f, fixVersionName, fieldByUpperNameAndSpecName)
      }}" +
      ".TagId"
  }
  private def generateIsRepeatingGroupTag() = {
    s"""  override lazy val RepeatingGroupsTags = HashSet[Int](${
      msgDef.subElements.filter(_.isInstanceOf[FixGroupDef]).zipWithIndex.map {
        case (groupDef: FixGroupDef, i:Int) => addMandOptField(groupDef, i)
      }.mkString(", ")
    })
        |  """.stripMargin
}

  private def generateFirstFieldForGroupsAndComponents :String = {
    generateFirstField
  }

  /**
    * Groups need a function to determine if this tag is the first field of the group, as this is the
    * delimeter for the last group.  Stupid protocol.
    */
  private def generateFirstField :String = {
    "\n  override def isFirstField(tagId:Int) : Boolean = " + {
      msgDef.subElements(0) match {
        case f: FixFieldDef => "tagId==" + SfCodeGeneratorMessage.getFieldClassName(f, fixVersionName, fieldByUpperNameAndSpecName) + ".TagId"
        case g: FixGroupDef => g.generatedClassName + ".isFirstField(tagId)"
        case c: FixComponentDef => c.generatedClassName + ".isFirstField(tagId)"
      }
    }
  }

  private def generateDecoder : String = {
    new SfCodeGeneratorMessageDecoder(fixVersionName,generatedClassName, msgDef, fieldByUpperNameAndSpecName).generateDecode()
  }


}
