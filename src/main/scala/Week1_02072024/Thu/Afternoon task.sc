import scala.collection.View.FlatMap

val numbers: List[Int] = List(1, 2, 3, 4, 5)
val colours: Seq[String] = Seq("red", "yellow", "blue")

val numbersTripled: List[Int] = numbers.map {
  number => number * 3
}

val coloursNoBlue: Seq[String] = colours.filterNot(
  colour => colour == "blue"
)

val hasOrange: Boolean = colours.contains("orange")

val oddsAndEvens: List[Boolean] = numbers.map(
  number => number % 2 != 0
)

val davidsPets: Map[String, String] = Map(
  "Rover" -> "dog",
  "Lassie" -> "dog",
  "Scratchy" -> "cat",
  "Roosterpher" -> "rooster",
  "Cowvin" -> "cow"
)

davidsPets("Rover")

val davidsDogs: Map[String, String] = davidsPets.filter(
  pet => pet._2 == "dog"
)
davidsDogs.keys.toList

// EXTENSION
//val newSeq: Seq[Int] = ()

val newSeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9)
val seqTo9 = 1 to 9 // range (subclass of sequence)
seqTo9.getClass

// keep numbers less than 7
// keep numbers that are less than 3 and odd

val filteredSeq1: Seq[Int] = newSeq.filter(
  numbers => numbers % 3 != 0
)

val filteredSeq2: Seq[Int] = filteredSeq1.filter(
  numbers => numbers != 4 && numbers != 8
)

numbers(3)

val firstTail = numbers.tail
val secondTail = firstTail.tail
val thirdTail = secondTail.tail
val thirdElement = thirdTail.head

// RESEARCH




/*
SOURCES:
https://www.scala-lang.org/api/2.12.x/scala/collection/Seq.html

ISSUES:
thinking pythonic? looking into for loops with conditional, map suffices

QUESTIONS: No dupe keys?
 */
