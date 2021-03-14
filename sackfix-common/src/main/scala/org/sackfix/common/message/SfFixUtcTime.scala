package org.sackfix.common.message

import java.time.{LocalDateTime, ZoneId, ZonedDateTime}

/**
  * Helper function to always give the current UTC time stamp as required for FIX time fields
  * (52: Sending time, 60: Transaction time etc.) in the LocalDateTime format already implemented.
  * @author Dave Tucker Sept 2018
  */
object SfFixUtcTime {
  def now: LocalDateTime = ZonedDateTime.now.withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime
}