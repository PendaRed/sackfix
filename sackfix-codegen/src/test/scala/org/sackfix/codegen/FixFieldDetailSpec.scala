package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixFieldDetailSpec extends AnyFlatSpec {

  behavior of "FixFieldDetail"

  it should "getEnumDescription" in {
    val f = new FixFieldDetail("1", "nm", "String", false)
    f.addSubElement(new FixValueDetail("1", "SomeFixEnumVal1"))
    f.addSubElement(new FixValueDetail("2", "AnotherFixEnumVal2"))
    assert(f.getEnumDescription("1")=="1 = SomeFixEnumVal1")
    assert(f.getEnumDescription("2")=="2 = AnotherFixEnumVal2")
    assert(f.getEnumDescription("3")=="3")
  }

  it should "toString" in {
    val f = new FixFieldDetail("1", "nm", "String", false)
    f.addSubElement(new FixValueDetail("1", "SomeFixEnumVal1"))
    f.addSubElement(new FixValueDetail("2", "AnotherFixEnumVal2"))
    assert(f.toString=="Field 1 nm String [Value 1 SomeFixEnumVal1,Value 2 AnotherFixEnumVal2]")
  }

}
