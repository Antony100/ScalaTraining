package Week3_15072024.Thu

object ForComp extends App {

  def retrieveNumbers: Seq[Int] = {
    for (numbers <- 1 to 10) yield numbers
  }
  println(retrieveNumbers)

  def squareNumbers: Seq[Int] = {
    for (numbers <- 1 to 10) yield numbers * numbers
  }
  println(squareNumbers)

  def ifGuardEvenNumbers: Seq[Int] = {
    for (numbers <- 1 to 10 if numbers % 2 == 0) yield numbers
  }
  println(ifGuardEvenNumbers)

  // use with case classes
  sealed trait Colour
  case object Blue extends Colour
  case object Green extends Colour
  case object Yellow extends Colour


  case class Pencil(colour: Colour, sharpened: Boolean)

  def getPencils: List[Pencil] = for {
    colour <- List(Blue, Green, Yellow)
    sharpened <- List(true, false)
  } yield Pencil(colour, sharpened)

  println(getPencils)

  def getTruePencils: List[Pencil] = for {
    colour <- List(Blue, Green, Yellow)
    sharpened <- List(true)
  } yield Pencil(colour, sharpened)

  println(getTruePencils)

  // task 1

  def changeToAllCapitals(names:List[String]) =  {
    for (name <- names) yield name.toUpperCase
  }

  println(changeToAllCapitals(List("bob", "alan")))

  // task 2
  def changeToTitleCase(names:List[String]) =  {
    for (name <- names) yield name.capitalize
  }
  println(changeToTitleCase(List("bob", "alan")))



}
