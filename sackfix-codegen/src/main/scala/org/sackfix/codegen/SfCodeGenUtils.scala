package org.sackfix.codegen

/**
  * Created by Jonathan during 2016.
  */
object SfCodeGenUtils {

  /**
    * Utility which turns a string "I_AM_AN_EXAMPLE" into "IAmAnExample", work delims are _ or " "
    */
  def makeUpperCamelCase(valueName: String): String = {
    makeCamelCase(valueName, firstCharUpper = true)
  }
  /**
    * Utility which turns a string "I_AM_AN_EXAMPLE" into "iAmAnExample", work delims are _ or " "
    */
  def makeLowerCamelCase(valueName: String): String = {
    makeCamelCase(valueName, firstCharUpper = false)
  }

  private def makeCamelCase(v:String, firstCharUpper:Boolean) = {
    v.toCharArray.foldLeft(firstCharUpper, "") {
      case ((nextUpper: Boolean, newStr: String), ch: Char) =>
        (ch == '_' || ch == ' ', newStr + {
          if (nextUpper) ch.toUpper
          else if (ch == '_' || ch == ' ') ""
          else ch.toLower
        })
    }._2
  }
}
