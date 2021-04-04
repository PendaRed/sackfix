package org.sackfix.codegen

import java.io.File
import scala.collection.mutable.ArrayBuffer
import scala.xml.{Node, NodeSeq, XML}

/**
  * Created by Jonathan during 2016.
  */
object SfFixDictionaryReader {
}

class SfFixDictionaryReader {
  val fieldMap = scala.collection.mutable.Map[String, FixFieldDetail]()
  val messages = new ArrayBuffer[FixMessageDef]
  val components = new ArrayBuffer[FixComponentDetail]
  val fields = new ArrayBuffer[FixFieldDetail]
  val groups = scala.collection.mutable.Map.empty[String, FixGroupDef]
  val headerObj = new FixNodeDef("header", "HeaderComponent")
  val trailerObj = new FixNodeDef("trailer", "TrailerComponent")

  /**
    * Read the quickfix4j fix definitions
    */
  def read(filePath: String): Unit = {
    val f: File = new File(filePath)

    val root = {
      if (f.exists()) XML.loadFile(filePath)
      else {
        val is = getClass.getResourceAsStream(filePath)
        if (is == null) {
          throw new RuntimeException(s"Could not find input file [$filePath] so aborting. (maybe add resources to the runtime classpath)")
        }
        XML.load(is)
      }
    }

    buildDictionary(root)
  }

  /**
    * Decode common attributes and then look for the sub elements and add them as children
    */
  def generateFixElement(classNamePrefix: String, fixElement: Node): FixNodeDef = {
    val elementType = fixElement.label
    val name = (fixElement \ "@name").text
    val required = (fixElement \ "@required").text match {
      case "y" | "Y" => true
      case _ => false
    }
    val elementObj = elementType.toLowerCase match {
      case "field" => new FixFieldDef(name, required)
      case "group" =>
        val grp = new FixGroupDef(name, required, SfCodeGeneratorMessage.getGroupClassName("", name))
        // replace any previous one with the new one....
        groups(name) = grp
        grp
      case "component" => new FixComponentDef(name, required)
    }
    elementObj.subElements ++= fixElement.child.filter("#PCDATA" != _.label).map({ childElem: Node => generateFixElement(elementObj.generatedClassName, childElem) })

    elementObj
  }


  /**
    * Starting from the root element <fix> scan all the sub elements and build up the dictionary I can use for
    * code generation.
    */
  def buildDictionary(fixElem: NodeSeq): Unit = {


    (fixElem \ "header").map { header =>
      headerObj.subElements ++= header.child.filter("#PCDATA" != _.label).map({ childElem: Node => generateFixElement("HeaderComponent", childElem) })
    }
    (fixElem \ "trailer").map { trailer =>
      trailerObj.subElements ++= trailer.child.filter("#PCDATA" != _.label).map({ childElem: Node => generateFixElement("TrailerComponent", childElem) })
    }

    messages ++=
      (fixElem \ "messages" \ "message").map { message =>
        // <message name="Heartbeat" msgtype="0" msgcat="admin">
        val messageObj = new FixMessageDef((message \ "@name").text, (message \ "@msgtype").text,
          (message \ "@msgcat").text)

        messageObj.subElements ++= message.child.filter("#PCDATA" != _.label).map({ childElem: Node => generateFixElement(messageObj.generatedClassName, childElem) })

        messageObj
      }
    components ++= (fixElem \ "components" \ "component").map { component =>
      // <message name="Heartbeat" msgtype="0" msgcat="admin">
      val componentObj = new FixComponentDetail((component \ "@name").text)

      componentObj.subElements ++= component.child.filter("#PCDATA" != _.label).map({ childElem: Node => generateFixElement(componentObj.generatedClassName, childElem) })
      componentObj
    }
    //    <field number="945" name="CollInquiryStatus" type="INT">
    //      <value enum="0" description="ACCEPTED"/>
    //      <value enum="1" description="ACCEPTED_WITH_WARNINGS"/>
    //      <value enum="2" description="COMPLETED"/>
    //      <value enum="3" description="COMPLETED_WITH_WARNINGS"/>
    //      <value enum="4" description="REJECTED"/>
    //    </field>
    fields ++= (fixElem \ "fields" \ "field").map { field =>
      // <message name="Heartbeat" msgtype="0" msgcat="admin">

      val attr = (field \ "@allowOtherValues").text
      // Note to avoid conflict with reserved words like yield, all fields have Field postfixed.
      val fieldObj = new FixFieldDetail((field \ "@number").text, (field \ "@name").text, (field \ "@type").text,
        attr != null && attr == "true")


      fieldObj.subElements ++= (field \ "value").map { value: Node =>
        new FixValueDetail((value \ "@enum").text, (value \ "@description").text)
      }

      fieldObj
    }

    // create a map of the fields
    fields.foreach(fieldDetail => fieldMap(fieldDetail.number) = fieldDetail)
    //    val uniques = fields.map(_.fieldType).toSet
    //    val orders = TreeSet[String]() ++ uniques
    //    println(orders.mkString("\n"))

    //    println(headerObj)
    //    println(trailerObj)
    //    println(messages.mkString("\n"))
    //    println(components.mkString("\n"))
    //    println(fields.mkString("\n"))
  }
}