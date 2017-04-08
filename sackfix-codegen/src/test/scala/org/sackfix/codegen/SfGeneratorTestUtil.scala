package org.sackfix.codegen

/**
  * Created by Jonathan during 2016.
  */
trait SfGeneratorTestUtil {
  def compareCode(expected:String, generated:String) = {
    expected.replaceAll("[\\r\\n]", "\n")

    val expectedLines = expected.split("""\n""").map(_.trim).filter(_.length>0)
    val generatedLines = generated.replaceAll("[\\r\\n]", "\n").split("""\n""").map(_.trim).filter(_.length>0)

    expectedLines.zip(generatedLines).zipWithIndex.foreach( {
      case ((expected:String, generated:String), lineNum:Int) =>
        val detail = f"""$lineNum%3d: $expected
             |!= : $generated
           """.stripMargin
        assert(expected==generated, s" - Line $lineNum)\n$detail")
    })
  }
}
