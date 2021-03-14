package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfFieldCharSpec extends AnyFlatSpec {
  behavior of "SfFieldChar"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldChar(54, 'A')
    val fld2 = new SfFieldChar(54, 'A')
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new SfFieldChar(54, 'B')
    val fld3 = new SfFieldChar(54, 'b')
    assert(fld1 != fld3)
  }
  it should "handle hashcodes and fixStr" in {
    val fld1 = new SfFieldChar(54, '6')
    val fld2 = new SfFieldChar(54, '6')
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "54=6\u0001" == fld1.fixStr)
    val fld3 = new SfFieldChar(54, 'N')
    assert( "54=N\u0001" == fld3.fixStr)
  }
}
