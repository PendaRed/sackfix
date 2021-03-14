package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfFieldIntSpec extends AnyFlatSpec {
  behavior of "SfFieldInt"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldInt(157, 1)
    val fld2 = new SfFieldInt(157, 1)
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new SfFieldInt(157, 1000000)
    val fld3 = new SfFieldInt(157, 1000001)
    assert(fld1 != fld3)
  }
  it should "handle hashcodes and fixStr" in {
    val fld1 = new SfFieldInt(157, 12345678)
    val fld2 = new SfFieldInt(157, 12345678)
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "157=12345678\u0001" == fld1.fixStr)
    val fld3 = new SfFieldInt(157, 23456781)
    assert( "157=23456781\u0001" == fld3.fixStr)
  }
}
