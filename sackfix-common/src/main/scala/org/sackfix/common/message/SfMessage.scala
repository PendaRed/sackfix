package org.sackfix.common.message

import org.sackfix.common.validated.fields.SfFixField
import org.sackfix.common.validated.fields.SfFixMessageBody

/**
  * Created by Jonathan during 2016.
  *
  * You create the header, and the body and pass both to me.
  * When you render to a fix str I calculate the body length and the checksome.  You
  * do not worry about that.  Given that the header and trailer are immutable
  * then the checksome and body are only in the generated fix string.
  * If you want to extract them yourselves see the helper functions in the header and trailer.
  *
  * @param fixExtensions is a pot for any tags which do not fit into the rest of the message.
  *                      Typically everyone adds thier own tags to fix, so this is the bare minimum I
  *                      can do to support this kind of offensive behaviour.
  */
class SfMessage(val header: SfMessageHeader, val body: SfFixMessageBody,
                val trailer: SfMessageTrailer = SfMessageTrailer(None, None, None),
                val fixExtensions: List[Tuple2[Int, String]] = List.empty[Tuple2[Int, String]]) {

  def fixStr = {
    val newBodyStr = new StringBuilder(body.fixStr).append(renderFixExtensions(SfFixField.SOH_STR))
    val interim = new StringBuilder().append(header.fixStr(newBodyStr)).append(newBodyStr)

    interim.append(trailer.fixStr(interim)).toString
  }

  override def toString = {
    // recalculate checksum and body length by generating the fix str
    fixStr

    val b = new StringBuilder(header.toString)
    b.append(body.toString).append(renderFixExtensions(",")).append(trailer.toString)
    b.toString
  }

  /**
    * Look at any exchange spec and they add their own tags.
    *
    * @return
    */
  private def renderFixExtensions(delim: String): String = {
    if (fixExtensions.nonEmpty) {
      fixExtensions.map((fldValue: Tuple2[Int, String]) => fldValue match {
        case (tagId: Int, value: String) => s"${tagId.toString}=$value"
      }).mkString(delim) + delim
    } else ""
  }
}

