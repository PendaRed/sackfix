package org.sackfix.codegen

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixGroupDefSpec extends FlatSpec {

  behavior of "FixGroupDefSpec"

  it should "toString" in {
    val node = new FixGroupDef("name", false, "generatedClassName")
    node.addSubElement(new FixNodeDef("subName1", "subGeneratedClassName1"))
    node.addSubElement(new FixNodeDef("subName2", "subGeneratedClassName2"))

    assert(node.toString == "Group name req=(false) [subName1,subName2]")

    assert(node.generatedClassName == "generatedClassName")

  }

}
