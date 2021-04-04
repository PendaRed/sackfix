package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfFieldBooleanSpec extends AnyFlatSpec {
  behavior of "SfFieldBoolean"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldBoolean(43, true)
    val fld2 = new SfFieldBoolean(43, true)
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new SfFieldBoolean(43, true)
    val fld3 = new SfFieldBoolean(43, false)
    assert(fld1 != fld3)
  }
  it should "handle hashcodes and fixStr" in {
    val fld1 = new SfFieldBoolean(43, true)
    val fld2 = new SfFieldBoolean(43, true)
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "43=Y\u0001" == fld1.fixStr)
    val fld3 = new SfFieldBoolean(43, false)
    assert( "43=N\u0001" == fld3.fixStr)
  }
}
