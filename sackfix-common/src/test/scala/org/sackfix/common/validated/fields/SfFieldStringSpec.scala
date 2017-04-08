package org.sackfix.common.validated.fields

import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfFieldStringSpec extends FlatSpec {
  behavior of "SfFieldString"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldString(8, "FIX.4.4")
    val fld2 = new SfFieldString(8, "FIX.4.4")
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new SfFieldString(8, "FIX.4.4")
    val fld3 = new SfFieldString(8, "FIX.4.2")
    assert(fld1 != fld3)
  }
  it should "handle hashcodes and fixStr" in {
    val fld1 = new SfFieldString(8, "FIX.4.4")
    val fld2 = new SfFieldString(8, "FIX.4.4")
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "8=FIX.4.4\u0001" == fld1.fixStr)
    val fld3 = new SfFieldString(8, "FIX.4.2")
    assert( "8=FIX.4.2\u0001" == fld3.fixStr)
  }
}
