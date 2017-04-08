package org.sackfix.codegen

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Jonathan during 2016.
  *
  * A header lists all the fields by name, with a boolean saying if they are required or not.
  * A footer does the same
  */
class SfFixDefinitions( header:FixNodeDef, trailer: FixNodeDef, messages: ArrayBuffer[FixNodeDef]) {

}

class FixNodeDef(val name:String, val generatedClassName:String) {
  val subElements = new ArrayBuffer[FixNodeDef]

  def addSubElement(subElement : FixNodeDef) : Unit = {
    subElements += subElement
  }

  override def toString =  name
}
class FixOptionalFieldDef(name:String, val required:Boolean, generatedClassName:String) extends FixNodeDef(name, generatedClassName) {
  override def toString =  s"$name req=($required)"
}

class FixGroupDef(name:String, required:Boolean, generatedClassName:String) extends FixOptionalFieldDef(name, required, generatedClassName) {
  override def toString = s"Group ${super.toString} [${subElements.mkString(",")}]"
}

class FixFieldDef(name:String, required:Boolean) extends FixOptionalFieldDef(name, required, SfCodeGeneratorMessage.getFieldClassName(name)) {
  override def toString =  s"Fld ${super.toString}"
}

/**
  * <component name="InstrumentLeg" required="N"/>
  */
class FixComponentDef(name:String, required:Boolean) extends FixOptionalFieldDef(name, required, SfCodeGeneratorMessage.getComponentClassName(name)) {
  override def toString =  s"Component ${super.toString}"
}

/**
  * <components>
  *   <component name="Instrument"/>
  */
class FixComponentDetail(name:String) extends FixNodeDef(name,SfCodeGeneratorMessage.getComponentClassName(name)) {
  override def toString =  {
    s"Component $name [${subElements.mkString(",")}]"
  }
}

/**
  * <fields>
  *   <field number="1" name="Account" type="STRING"/>
  *   <field number="4" name="AdvSide" type="CHAR">
  *     <value enum="B" description="BUY"/>
  *   </field>
  */
class FixValueDetail(val enumValue:String, val desc:String) extends FixNodeDef(enumValue, "") {
  override def toString =  {
    s"Value $enumValue $desc"
  }
}

class FixFieldDetail(val number:String, name:String, val fieldType:String, val allowOtherValues:Boolean = false) extends FixNodeDef(name, SfCodeGeneratorMessage.getFieldClassName(name)) {
  def getEnumDescription(enumVal:String):String = {
    val description = subElements.filter(_.isInstanceOf[FixValueDetail]).
      map(_.asInstanceOf[FixValueDetail]).filter(_.enumValue==enumVal).map( _.desc).mkString(",")
    enumVal+ ( if (description.length>0) " = "+description else "")
  }
  override def toString =  {
    s"Field $number $name $fieldType [${subElements.mkString(",")}]"
  }
}

/**
  * <message name="Heartbeat" msgtype="0" msgcat="admin">
  */
class FixMessageDef( name:String, val msgType:String, val msgCat:String) extends FixNodeDef(name, SfCodeGeneratorMessage.getMessageClassName(name)) {
  override def toString = {
    s"$name msgType=$msgType msgCat=$msgCat [${subElements.mkString(",")}]"
  }
}

