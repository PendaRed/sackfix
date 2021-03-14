package org.sackfix.common.validated.fields

import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.immutable.HashSet


/**
  * Created by Jonathan during 2017.
  */
class SfFixDecoderLatencySpec extends AnyFlatSpec{
  behavior of "SfFixDecoder"

  it should "measure latency" in {
    val flds: Seq[Tuple2[Int, Any]] = Seq((1,"xxx"),
      (19,"xxx"),
      (3,"xxx"),
      (17,"xxx"),
      (5,"xxx"),
      (14,"xxx"),
      (7,"xxx"),
      (12,"xxx"),
      (9,"xxx"),
      (11,"xxx"),
      (10,"xxx"),
      (13,"xxx"),
      (8,"xxx"),
      (15,"xxx"),
      (6,"xxx"),
      (16,"xxx"),
      (4,"xxx"),
      (18,"xxx"),
      (2,"xxx"),
      (20,"xxx"),
      (200,"xxx"),
      (210,"xxx"),
      (211,"xxx"),
      (212,"xxx"),
      (110,"xxx"),
      (113,"xxx"),
      (108,"xxx"),
      (115,"xxx"),
      (106,"xxx"),
      (116,"xxx"),
      (104,"xxx"),
      (118,"xxx"),
      (102,"xxx"),
      (120,"xxx")
    )

    var startTime = System.nanoTime()
    val max = 200000
    for (i <- 0 to max+100) {
      if (i==100) startTime = System.nanoTime()
      val (posBeyondMe, myFields, nextTagPosLookup) = MockMessage.extractMyFieldsAndPopulatePositions(true, flds, 0)
    }
    val dur = System.nanoTime() - startTime
    println(s"Duration ${(dur/max)/1000} microseconds per call")
    println(s"$dur nano seconds for $max calls")
  }

  object MockMessage extends SfFixDecoder {
    override lazy val MandatoryFields = HashSet[Int](1, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    override lazy val OptionalFields = HashSet[Int](101, 102, 103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120)
    override lazy val RepeatingGroupsTags = HashSet[Int](200,201)

    override def isOptionalField(tagId: Int): Boolean = OptionalFields.contains(tagId)

    override def isMandatoryField(tagId: Int): Boolean = MandatoryFields.contains(tagId)

    override def isFieldOf(tagId: Int): Boolean = isMandatoryField(tagId) || isOptionalField(tagId)
  }
}
