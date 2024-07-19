package Week3_15072024.Thu

import java.time.LocalDate

object Either extends App {

  def isEven(x: Int): Either[String, String] = {
    if (x % 2 == 0) Right(s"$x is even") else Left(s"$x is odd")
  }

  println(isEven(4))
  println(isEven(5))

  // make custom error
  class NewError(val errorCode: Int, val errorMessage: String) extends Exception
  case object IsOddError extends NewError(400, "bad request in isOdd method")

  def isOdd(x: Int): Either[NewError, String] = {
    if (x % 2 != 0) Right(s"$x is odd") else Left(IsOddError)
  }

  println(isOdd(7))
  println(isOdd(6))

  // TRY CATCH

  def plusOne(x:String): Either[String, Int] = {
    try {
      Right(x.toInt)
    } catch {
      case e: Exception => Left(s"Failed due to $e") // wildcard for try catch
    }
  }
  println(plusOne("1")) // Right
  println(plusOne("one")) // Left - catch

  // functions directly
  plusOne("3").map(num => num + 1)
//  plusOne("I will fail").map(num => num + 1) // hits left, will stop

  // pattern match
  def plusOneMatch(): Unit =
    plusOne("one") match {
      case Left(e) => println(s"Left: $e") // comes first
      case Right(x) => println(s"Right: $x")
    }

  println(plusOneMatch())

  // For comps with Eithers

  case class User(username: String, password: String, dateOfBirth: LocalDate)

  case class ValidatedUser(username: String, password: String, dateOfBirth: LocalDate)

  //validate username, password, age
  // combine all 3 and validate user

  def validateUsername(username:String): Either[String, String] = {
    if (username.length < 12) Left("username must be at least 12 chars")
    else Right(username)
  }

  def validatePassword(password:String): Either[String, String] = {
    if (password.toUpperCase() == password || password.toLowerCase() == password) Left("needs upper and lower case") else
      Right(password)
  }

  def validateAge(dateOfBirth: LocalDate): Either[String, LocalDate] = {
    if (dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left("user must be 18") else Right(dateOfBirth)
  }

  def validateUser(user:User): Either[String, ValidatedUser] = {
    for {
      username <- validateUsername(user.username)
      password <- validatePassword(user.password)
      dateOfBirth <- validateAge(user.dateOfBirth)
      createValidatedUser = ValidatedUser(username, password, dateOfBirth)
    } yield createValidatedUser // yield case class if all methods hit right
  }

 val usernameBad = User("Ant", "Password", LocalDate.of(1994,4,30))
 val passwordBad = User("Antonyangelosdfsd", "password", LocalDate.of(1994,4,30))
 val dobbad = User("Antaslfkjldsfjsdf", "Password", LocalDate.of(2024,4,30))
 val goodUser = User("Antasfiojsdoifj", "Password", LocalDate.of(1994,4,30))

  println(validateUser(usernameBad))
  println(validateUser(passwordBad))
  println(validateUser(dobbad))
  println(validateUser(goodUser))
}
