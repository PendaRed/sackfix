package org.sackfix.common.message

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfMissingFieldsExceptionSpec extends FlatSpec {
  behavior of "SfMissingFieldsException"

  it should "generate the correct String" in {
    val ex = new SfMissingFieldsException("Test1", List("1","2","3"))
    assert(ex.getMessage == "Test1 (missing tags: 1,2,3)")
  }
}
