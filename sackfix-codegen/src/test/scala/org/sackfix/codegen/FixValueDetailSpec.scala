package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixValueDetailSpec extends AnyFlatSpec {

  behavior of "FixValueDetail"

  it should "toString" in {
    val v = new FixValueDetail("value", "desc")

    assert(v.toString == "Value value desc")
  }
}
