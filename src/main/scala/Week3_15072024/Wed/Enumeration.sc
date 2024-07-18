object Weekday extends Enumeration {
  val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
}
Weekday.Friday.toString

// alternative way
//useful for acronyms/long names
object BetterWeekday extends Enumeration {
  val Monday = Value("Mon")
  val Tuesday = Value("Tue")
  val Wednesday = Value("Wed")
  val Thursday = Value("Thu")
  val Friday = Value("Fri")
  val Saturday = Value("Sat")
  val Sunday = Value("Sun")
}

BetterWeekday.Friday // returns fri

def exhaustiveMatch(weekday: BetterWeekday.Value): String = {
  weekday match {
    case BetterWeekday.Monday => "Mon"
    case BetterWeekday.Tuesday => "Tue"
    case BetterWeekday.Wednesday => "Wed"
    case BetterWeekday.Thursday => "Thu"
    case BetterWeekday.Friday => "Fri"
    case BetterWeekday.Saturday => "Sat"
    case BetterWeekday.Sunday => "Sun"
  }
}

// Sealed case objects
sealed trait Weekday
case object Monday extends Weekday
case object Tuesday extends Weekday
case object Wednesday extends Weekday
case object Thursday extends Weekday
case object Friday extends Weekday
case object Saturday extends Weekday
case object Sunday extends Weekday

// must be exhaustive, will see compilation warning if not
def caseObjectMatch(weekday1: Weekday): String = {
  weekday1 match {
    case Monday => "yay its monday"
    case Tuesday => "tuessss"
    case Wednesday => "wow wed"
    case Thursday => "thurs"
    case Friday => "fr"
    case Saturday => "sat"
    case Sunday => "sunday"
  }
}

abstract class Error(name: String, errorCode: Int)

case object WeekdayNotFound extends Error("Weekday not found", 404)

// TASK

object PrimaryColours extends Enumeration {
  val blue = Value("BLUE")
  val red = Value("RED")
  val yellow = Value("YELLOW")
}

PrimaryColours.blue
PrimaryColours.values

sealed trait PrimaryColours
case object Blue extends PrimaryColours
case object Red extends PrimaryColours
case object Yellow extends PrimaryColours

