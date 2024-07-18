// TASK 1

val country  = "   England"

country.toLowerCase.trim match {
  case "england" => "London"
  case "france" => "Paris"
  case "spain" => "Madrid"
  case _ => "Country not recognised"
}

// TASK 2

case class InitialPerson(fullName: String,
                  dateOfBirth: String,
                  occupation: Option[String],
                  lastCountryLived: String,
                  dateOfDeath: Option[String],
                 )


case class Person(fullName: String,
                  dateOfBirth: String,
                  occupation: Option[String],
                  lastCountryLived: String,
                  dateOfDeath: Option[String],
                  age: Option[Int],
                  starSign: StarSign,
                  ageAtDeath: Option[String],
                 )

trait StarSign

case object Aries extends StarSign
case object Taurus extends StarSign
case object Gemini extends StarSign
case object Cancer extends StarSign
case object Leo extends StarSign
case object Virgo extends StarSign
case object Libra extends StarSign
case object Scorpio extends StarSign
case object Sagittarius extends StarSign
case object Capricorn extends StarSign
case object Aquarius extends StarSign
case object Pisces extends StarSign













