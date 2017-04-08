package org.sackfix.codegen

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixOptionalFieldDefSpec extends FlatSpec {

  behavior of "FixOptionalFieldDefSpec"

  it should "toString" in {
    val fld = new FixOptionalFieldDef("name", true, "generatedClassName")

    assert(fld.toString == "name req=(true)")
  }

}
