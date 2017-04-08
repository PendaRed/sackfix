package org.sackfix.codegen

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixFieldDefSpec extends FlatSpec {

  behavior of "FixFieldDefSpec"

  it should "toString" in {
    val node = new FixFieldDef("name", true)

    assert(node.toString == "Fld name req=(true)")
  }

}
