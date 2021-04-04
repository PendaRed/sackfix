package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixComponentDefSpec extends AnyFlatSpec {

  behavior of "FixComponentDefSpec"

  it should "toString" in {
    val node = new FixComponentDef("Component", false)

    assert(node.toString == "Component Component req=(false)")
  }

}
