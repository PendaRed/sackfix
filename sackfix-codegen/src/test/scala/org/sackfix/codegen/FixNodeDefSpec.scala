package org.sackfix.codegen

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixNodeDefSpec extends FlatSpec {

  behavior of "FixNodeDefSpec"

  it should "addSubElement" in {
    val node = new FixNodeDef("name", "generatedClassName")
    node.addSubElement(new FixNodeDef("subName1", "subGeneratedClassName2"))
    node.addSubElement(new FixNodeDef("subName1", "subGeneratedClassName2"))

    assert(node.subElements.size==2)
  }

}
