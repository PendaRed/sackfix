package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixNodeDefSpec extends AnyFlatSpec {

  behavior of "FixNodeDefSpec"

  it should "addSubElement" in {
    val node = new FixNodeDef("name", "generatedClassName")
    node.addSubElement(new FixNodeDef("subName1", "subGeneratedClassName2"))
    node.addSubElement(new FixNodeDef("subName1", "subGeneratedClassName2"))

    assert(node.subElements.size==2)
  }

}
