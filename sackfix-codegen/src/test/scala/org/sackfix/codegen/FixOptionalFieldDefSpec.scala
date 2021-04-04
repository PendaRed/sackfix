package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixOptionalFieldDefSpec extends AnyFlatSpec {

  behavior of "FixOptionalFieldDefSpec"

  it should "toString" in {
    val fld = new FixOptionalFieldDef("name", true, "generatedClassName")

    assert(fld.toString == "name req=(true)")
  }

}
