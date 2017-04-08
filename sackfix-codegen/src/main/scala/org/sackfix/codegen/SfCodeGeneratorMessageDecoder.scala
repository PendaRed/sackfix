package org.sackfix.codegen

/**
  * The decoder function for each message takes a list of tuples, extracts fields from it,
  * if the field is a sub-group then it creates a list of subgroups
  * For each component within the message,see if there are fields that belong in the component, and
  * if so, create the component.
  * Created by Jonathan during 2016.
  */
class SfCodeGeneratorMessageDecoder(val fixVersionName:String,
                                    val generatedClassName:String, val msgDef: FixNodeDef,
                                    val fieldByUpperNameAndSpecName: scala.collection.mutable.Map[String, FixFieldDetail]) {
  def generateDecode(): String = {

    msgDef match {
      case c: FixComponentDetail => generateDecoder("", "",generatedClassName)
      case g: FixGroupDef => generateGroupDecoder
      case g: FixFieldDef => ""// never happen
      case _ => generateDecoder("override ", "MandatoryFields.isEmpty || ", "SfFixMessageBody")  // This is a message, so generate the message decoder
    }
  }

  private def generateDecoder(overrideStr:String , extraMandNotEmpty:String, nameOfReturnedClass:String) : String = {

    s"""
       |
       |  ${overrideStr}def decode(flds: Seq[Tuple2[Int, Any]], startPos:Int = 0):Option[$nameOfReturnedClass] = {
       |    val (pos, myFields, nextTagPosLookup) = extractMyFieldsAndPopulatePositions(false, flds, startPos)
       |    validateMandatoryFieldsPresent(myFields)
       |
       |    if (${extraMandNotEmpty}myFields.nonEmpty) {
       |      Some($generatedClassName${generateCtorParams("        ")})
       |    } else None
       |  }
       |
    """.stripMargin
  }

  private def generateGroupDecoder : String = {
    s"""
       |
       |  // Group version, startPos is the index to the first element of the first repeating group
       |  @tailrec
       |  def decode(flds: Seq[Tuple2[Int, Any]], startPos:Int = 0, groups:ArrayBuffer[$generatedClassName]=ArrayBuffer.empty[$generatedClassName]):Option[List[$generatedClassName]] = {
       |    decodeSingle(flds, startPos) match {
       |      case (pos: Int, None) => if (groups.nonEmpty) Some(groups.toList) else None
       |      case (pos: Int, grp: Some[$generatedClassName]) => decode(flds, pos, groups += grp.get)
       |    }
       |  }
       |
       |  /**
       |    * @param flds For groups in Fix ordering is VITAL.
       |    * @param startPos This index into the ordered fields. It HAS to contain the first field of the group
       |    * @return A Tuple2 holding the next position to read from the fields, and the newly created group
       |    */
       |  def decodeSingle(flds: Seq[Tuple2[Int, Any]], startPos:Int):Tuple2[Int,Option[$generatedClassName]] = {
       |    if (!isFirstField(flds(startPos)._1)) (startPos, None)
       |    else {
       |      val (pos, myFields, nextTagPosLookup) = extractMyFieldsAndPopulatePositions(true, flds, startPos)
       |      validateMandatoryFieldsPresent(myFields)
       |
       |      if (myFields.nonEmpty) {
       |        (pos,Some($generatedClassName${generateCtorParams("          ")}))
       |      } else (startPos, None)
       |    }
       |  }
    """.stripMargin
  }

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
    val generatedClassName = SfCodeGeneratorMessage.getFieldClassName(f, fixVersionName, fieldByUpperNameAndSpecName)
    if (f.required) {
      s"$generatedClassName.decode(myFields.get($generatedClassName.TagId)).get"
    } else {
      s"myFields.get($generatedClassName.TagId).flatMap(f=>$generatedClassName.decode(f))"
    }
  }

  private def generateComponentCtorSection(f:FixComponentDef):String = {
    val componentClassName = SfCodeGeneratorMessage.getComponentClassName(f.name)

    s"$componentClassName.decode(flds, startPos)${if (f.required) ".get" else ""}"
  }

  /**
    * Groups have a field which is the count, followed by a collection of the repeating groups
    */
  private def generateGroupCtorSection(g:FixGroupDef, padding:String):String = {
    val groupClassName = g.generatedClassName
    val fieldClassName = SfCodeGeneratorMessage.getFieldClassName(g, fixVersionName, fieldByUpperNameAndSpecName)

    //s"$fieldClassName.decode(myFields.get($tagStr))${if (g.required) ".get" else ""},\n$padding" +
    val tagStr = s"$fieldClassName.TagId"
    s"${
      if (g.required) s"$fieldClassName.decode(myFields.get($tagStr)).get"
      else s"myFields.get($tagStr).flatMap(f=>$fieldClassName.decode(f))"
    },\n$padding"+
    s"if (nextTagPosLookup.contains($tagStr)) $groupClassName.decode(flds, nextTagPosLookup($tagStr))${if (g.required) ".get" else ""} else ${if (g.required) "List.empty" else "None"}"
  }

}
