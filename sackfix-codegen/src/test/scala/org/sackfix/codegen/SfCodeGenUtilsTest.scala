package org.sackfix.codegen

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfCodeGenUtilsTest extends FlatSpec {

  behavior of "SfCodeGenUtils"

  it should "generate upper camel case for empty" in {
    assert("" == SfCodeGenUtils.makeUpperCamelCase(""))
  }
  it should "generate upper camel case for simple" in {
    assert("Simple" == SfCodeGenUtils.makeUpperCamelCase("SIMPLE"))
  }
  it should "generate upper camel case for constants" in {
    assert("IAmJonathan" == SfCodeGenUtils.makeUpperCamelCase("I_AM_JONATHAN"))
    assert("YouAreWonderingWhyYouBother" == SfCodeGenUtils.makeUpperCamelCase("YOU ARE_WONDERING_WHY YOU BOTHER"))
  }

  it should "makeLowerCamelCase" in {
    assert("thisIsCamelCase"== SfCodeGenUtils.makeLowerCamelCase("THIS_IS_CAMEL_CASE"))
  }

}
