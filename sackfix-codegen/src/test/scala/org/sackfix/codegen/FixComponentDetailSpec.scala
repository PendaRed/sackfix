package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixComponentDetailSpec extends AnyFlatSpec {

  behavior of "FixComponentDetailSpec"

  it should "toString" in {
    val node = new FixComponentDetail("Component")
    node.addSubElement(new FixFieldDef("fld1", false))
    node.addSubElement(new FixFieldDef("fld2", true))

    assert(node.toString == "Component Component [Fld fld1 req=(false),Fld fld2 req=(true)]")

    assert(node.generatedClassName == "ComponentComponent")
  }

}
