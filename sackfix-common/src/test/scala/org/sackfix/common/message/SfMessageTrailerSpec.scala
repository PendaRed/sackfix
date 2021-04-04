package org.sackfix.common.message

import org.sackfix.field.CheckSumField
import org.scalatest.flatspec.AnyFlatSpec


/**
  * Created by Jonathan during November 2016.
  */
class SfMessageTrailerSpec extends AnyFlatSpec {
  behavior of "SfMessageTrailer"

  it should "pad checksums" in {
    assert("001"==SfMessageTrailer.padCheckSum(1))
    assert("021"==SfMessageTrailer.padCheckSum(21))
    assert("321"==SfMessageTrailer.padCheckSum(321))
  }

  it should "create a checkSum field" in {
    // could just do new CheckSumFielld("009"), but this tests more
    assert(CheckSumField.decode(Some("009")).get == SfMessageTrailer.createCheckSumField(9))
  }
}
