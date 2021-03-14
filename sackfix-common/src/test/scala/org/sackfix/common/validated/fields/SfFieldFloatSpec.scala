package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfFieldFloatSpec extends AnyFlatSpec {
  behavior of "SfFieldFloat"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldFloat(155, 1.23f)
    val fld2 = new SfFieldFloat(155, 1.23f)
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new SfFieldFloat(155, 1.00001f)
    val fld3 = new SfFieldFloat(155, 1.00002f)
    assert(fld1 != fld3)
  }
  it should "handle hashcodes and fixStr" in {
    val fld1 = new SfFieldFloat(155, "3.1415".toFloat)
    val fld2 = new SfFieldFloat(155, "3.1415".toFloat)
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "155=3.1415\u0001" == fld1.fixStr)
    val fld3 = new SfFieldFloat(155, 1.1234567f)
    assert( "155=1.1234567\u0001" == fld3.fixStr)
  }
  it should "not properly handly doubles" in {
    val fld1 = new SfFieldFloat(155, 1.12345678f)
    assert( "155=1.1234568\u0001" == fld1.fixStr)
  }
}
