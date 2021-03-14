package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

import java.time.LocalDate

/**
  * Created by Jonathan during 2016.
  */
class SfFieldMonthYearSpec extends AnyFlatSpec {
  behavior of "SfFieldMonthYear"

  it should "handle ctor, equals" in {
    val fld1 = new SfFieldMonthYear(200, LocalDate.of(1948,4,28))
    val fld2 = new SfFieldMonthYear(200, LocalDate.of(1948,4,28))
    assert(fld1 == fld2)
  }
  it should "handle not equals" in {
    val fld1 = new  SfFieldMonthYear(200, LocalDate.of(1948,4,28))
    val fld3 = new SfFieldMonthYear(200, LocalDate.of(1892,1,3))
    assert(fld1 != fld3)
  }

  // Fix MonthYear is crap - should use YearMonth class - but some of the supported formats include
  // days and weeks.
  it should "handle hashcodes and fixStr" in {
    val fld1 = new SfFieldMonthYear(200, LocalDate.of(1948,4,28))
    val fld2 = new  SfFieldMonthYear(200, LocalDate.of(1948,4,28))
    assert(fld1.hashCode() == fld2.hashCode())

    assert( "200=194804\u0001" == fld1.fixStr)
    val fld3 = new SfFieldMonthYear(200, LocalDate.of(1892,1,3))
    assert( "200=189201\u0001" == fld3.fixStr)
  }
}
