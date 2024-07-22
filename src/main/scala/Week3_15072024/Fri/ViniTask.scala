package Week3_15072024.Fri

object ViniTask extends App {

  case class Name(value: String)

  object Name {
    def nameOrError(maybeName: String): Either[InvalidNameError, Name] =
      maybeName match {
        case name if name.exists(_.isDigit) => Left(InvalidNameError("Not a valid name"))
        case _ => Right(Name(maybeName))
      }
  }

  case class Postcode(value: String)

  object Postcode {
    def postcodeOrError(maybePostcode: String): Either[InvalidPostcodeError, Postcode] =
      maybePostcode.contains(" ") match {
        case true => Left(InvalidPostcodeError("Invalid postcode"))
        case false => Right(Postcode(maybePostcode))
      }
  }

  case class Letter(name: Name, postcode: Postcode)

  object Letter {
    def letterOrError(maybeName: String, maybePostcode: String): Either[GenericPostageError, Letter] =
      for {
        name <- Name.nameOrError(maybeName)
        postCode <- Postcode.postcodeOrError(maybePostcode)
      } yield {
        Letter(name, postCode)
      }
  }

  trait GenericPostageError {
    def message: String
  }

  case class InvalidNameError(message: String) extends GenericPostageError

  case class InvalidPostcodeError(message: String) extends GenericPostageError


  val validName = Name.nameOrError("Alan Apples")
  val invalidName = Name.nameOrError("Alan Apples123")

  val validPostcode = Postcode.postcodeOrError("12345")
  val invalidPostcode = Postcode.postcodeOrError("12 345")

  val letterWithANumberInName: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Alan Apples1", maybePostcode = "12, 345")

  val letterWithAnInvalidPostcode: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Alan apples", maybePostcode = "12345")

  val letterAllInvalid: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Alan apples1", maybePostcode = "12345")

  println(letterWithANumberInName, letterWithAnInvalidPostcode, letterAllInvalid)
}