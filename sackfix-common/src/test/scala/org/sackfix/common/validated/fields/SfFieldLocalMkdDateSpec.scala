package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

import java.time.LocalDate

/**
  * Created by Jonathan during 2016.
  */
class SfFieldLocalMkdDateSpec extends AnyFlatSpec {
  behavior of "SfFieldLocalMktDate"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldLocalMktDate(193, LocalDate.of(1948,4,28))
    val fld2 = new SfFieldLocalMktDate(193, LocalDate.of(1948,4,28))
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new SfFieldLocalMktDate(193, LocalDate.of(1948,4,28))
    val fld3 = new SfFieldLocalMktDate(193, LocalDate.of(1892,1,3))
    assert(fld1 != fld3)
  }
  it should "handle hashcodes and fixStr" in {
    val fld1 = new  SfFieldLocalMktDate(193, LocalDate.of(1948,4,28))
    val fld2 = new SfFieldLocalMktDate(193, LocalDate.of(1948,4,28))
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "193=19480428\u0001" == fld1.fixStr)
    val fld3 = new SfFieldLocalMktDate(193, LocalDate.of(1892,1,3))
    assert( "193=18920103\u0001" == fld3.fixStr)
  }
}
