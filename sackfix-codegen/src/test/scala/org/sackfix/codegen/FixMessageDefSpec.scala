package org.sackfix.codegen

import org.scalatest.flatspec.AnyFlatSpec

/**
  * Created by Jonathan during 2016.
  */
class FixMessageDefSpec extends AnyFlatSpec {

  behavior of "FixMessageDef"

  it should "toString" in {
    val m = new FixMessageDef("nm", "0", "admin")
    m.addSubElement(new FixFieldDef("fld1", true))
    m.addSubElement(new FixFieldDef("fld2", false))
    assert(m.toString == "nm msgType=0 msgCat=admin [Fld fld1 req=(true),Fld fld2 req=(false)]")
  }

}
