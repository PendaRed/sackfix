package org.sackfix.common.message

import org.sackfix.common.validated.fields.SfFixMessageBody
import org.scalatest.FlatSpec

/**
  * Created by Jonathan during 2016.
  */
class SfMessageSpec extends FlatSpec {
  val SOH = 1.toChar

  behavior of "SfMessage"

  it should "render fix extensions and calc body including it" in {

    val headerFields: List[(Int, Any)] = List((8, "FIX.4.2"), (9, "194"), (35, "D"), (49, "BLP"),
      (56, "SCHB"), (34, 1), (50, "30737"), (97, "Y"), (52, "20000809-20:20:50"))

    val randomBespokeFields: List[(Int, String)] = List((3044, "MakeUpByAnExchange"), (3045, "HFTCheat"))

    val header: Option[SfMessageHeader] = SfMessageHeader.decode(headerFields)
    val body = new SfFixMessageBody("1") {
      override lazy val fixStr = s"11=90001008${SOH}1=10030003${SOH}21=2${SOH}55=TESTA${SOH}54=1${SOH}38=4000${SOH}" +
        s"40=2${SOH}59=0${SOH}44=30${SOH}47=I${SOH}60=20000809-18:20:32${SOH}"
    }
    // No trailer, new message - let calc the checksum
    val msg1 = new SfMessage(header.get, body, fixExtensions=randomBespokeFields)
    val msg2 = new SfMessage(header.get, body)
//    println(msg1.fixStr)
//    println(msg2.fixStr)
    val expected = s"8=FIX.4.2${SOH}9=194${SOH}35=D${SOH}49=BLP${SOH}56=SCHB${SOH}34=1${SOH}50=30737${SOH}97=Y${SOH}52=20000809-20:20:50.000${SOH}11=90001008${SOH}1=10030003${SOH}21=2${SOH}55=TESTA${SOH}54=1${SOH}38=4000${SOH}40=2${SOH}59=0${SOH}44=30${SOH}47=I${SOH}60=20000809-18:20:32${SOH}3044=MakeUpByAnExchange${SOH}3045=HFTCheat${SOH}10=122${SOH}"
    assert(msg1.fixStr == expected)
  }
    //    BeginStringField.TagId
    //    BodyLengthField.TagId
    //    MsgTypeField.TagId
    //    ApplVerIDField.TagId
    //    ApplExtIDField.TagId
    //    CstmApplVerIDField.TagId
    //    SenderCompIDField.TagId
    //    TargetCompIDField.TagId
    //    OnBehalfOfCompIDField.TagId
    //    DeliverToCompIDField.TagId
    //    SecureDataLenField.TagId
    //    SecureDataField.TagId
    //    MsgSeqNumField.TagId
    //    SenderSubIDField.TagId
    //    SenderLocationIDField.TagId
    //    TargetSubIDField.TagId
    //    TargetLocationIDField.TagId
    //    OnBehalfOfSubIDField.TagId
    //    OnBehalfOfLocationIDField.TagId
    //    DeliverToSubIDField.TagId
    //    DeliverToLocationIDField.TagId
    //    PossDupFlagField.TagId
    //    PossResendField.TagId
    //    SendingTimeField.TagId
    //    OrigSendingTimeField.TagId
    //    XmlDataLenField.TagId
    //    XmlDataField.TagId
    //    MessageEncodingField.TagId
    //    LastMsgSeqNumProcessedField.TagId
    //    NoHopsField.TagId
    //    NoHopsField.TagId
}
