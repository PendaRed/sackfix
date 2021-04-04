package org.sackfix.common.validated.fields

import org.sackfix.common.message.SfMissingFieldsException
import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.immutable.HashSet
import scala.collection.mutable

/**
  * Created by Jonathan during 2016.
  */
class  SfMandatoryFieldCheckSpec extends AnyFlatSpec {
  behavior of "SfMandatoryFieldCheck"

  it should "Correctly determine missing mandatory fields" in {
    try {
      MockMessage.validateMandatoryFieldsPresent(mutable.ListMap((1, "mand1")))
      fail("It should have failed with missing mandatory fields 2 and 3")
    } catch {
      case ex : SfMissingFieldsException =>
        println(ex.toString)
        assert("Mandatory fields missing (missing tags: AdvId(2),AdvRefID(3))" == ex.getMessage)
    }
  }

  it should "Extract fields and groups from a message" in {
    val (pos, myFields, posLookup) = MockMessage.extractMyFieldsAndPopulatePositions(true,
      List((-5, "NoInMsg"),(1, "Mand"),(55, "NoInMsg"), (5, "Grp"), (6, "Grp"), (2, "Mand"), (3, "Mand"), (18, "NotInMsg") ),0)

    assert(pos==8)
    // Drops the unknown fields
    assert(myFields.equals(mutable.ListMap(3 -> "Mand", 6 -> "Grp", 1 -> "Mand", 5 -> "Grp", 2 -> "Mand")))
    // Maps the repeating groups to the next position
    assert(posLookup.equals(Map(5 -> 4, 6 -> 5)))
  }

  it should "Extract fields from a message without checkfirst" in {
    val (pos, myFields, posLookup) = MockMessage.extractMyFieldsAndPopulatePositions(false,
      List((-5, "NoInMsg"),(1, "Mand"),(55, "NoInMsg"), (5, "Grp"), (6, "Grp"), (2, "Mand"), (3, "Mand"), (18, "NotInMsg") ),0)

    assert(pos==8)
    // Drops the unknown fields
    assert(myFields.equals(mutable.ListMap(3 -> "Mand", 6 -> "Grp", 1 -> "Mand", 5 -> "Grp", 2 -> "Mand")))
    // Maps the repeating groups to the next position
    assert(posLookup.equals(Map(5 -> 4, 6 -> 5)))
  }

  it should "Correctly find missing mand fields" in {
    assert(intercept[SfMissingFieldsException] {
      val v = MockMessage.validateMandatoryFieldsPresent(mutable.ListMap(1 -> "D", 10 -> "X"))
    }.getMessage == "Mandatory fields missing (missing tags: AdvId(2),AdvRefID(3))")
  }

  object MockMessage extends SfFixDecoder {
    override lazy val MandatoryFields = HashSet[Int](1, 2, 3)
    override lazy val OptionalFields = HashSet[Int](4, 5, 6, 7)
    override lazy val RepeatingGroupsTags = HashSet[Int](5,6)

    override def isOptionalField(tagId: Int): Boolean = OptionalFields.contains(tagId)

    override def isMandatoryField(tagId: Int): Boolean = MandatoryFields.contains(tagId)

    override def isFieldOf(tagId: Int): Boolean = isMandatoryField(tagId) || isOptionalField(tagId)
  }
}


