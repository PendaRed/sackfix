package org.sackfix.common.message

/**
  * Created by Jonathan during 2016.
  */
object SfMissingFieldsException {
  def renderMsg(msg:String, missingTags:List[String]): String = {
    msg + s" (missing tags: ${missingTags.mkString(",")})"
  }
}
class SfMissingFieldsException(val desc: String,
                               val missingTags: List[String]) extends Exception(SfMissingFieldsException.renderMsg(desc, missingTags))

case class SfDuplicateTagIdException(tagId:Int) extends Exception(s"Duplicate tagId($tagId) in message")

case class SfRepeatingGroupCountException(tagId:Int, count:Int, actualCount:Int) extends Exception(s"Repeating group tagId($tagId) value ($count) != group actual size ($actualCount)")
