package Week4_22072024.Mon

import Week4_22072024.Mon.Recursion.Fruit.{Banana, Fruit}

import scala.annotation.tailrec

object Recursion extends App {

  // standard recursion
  def factorial(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
//        println(s"currently working on: $(n-1)")

      val finalResult = n * factorial(n -1)
//      println(s"final call of $(n)")
      finalResult
    }
  }
  println("\n Factorial method (4) - standard rec: ")
  println(factorial(4))




  // tail recursion
  def smartFactorial (n:Int): Int = {


    @tailrec
    def factorialHelper(x: Int, acc: Int): Int = {

      if (x <= 1) acc
      else {
//        println(s"current x:  $x")
//        println(s"current acc: $acc")
        factorialHelper(x - 1, x * acc) // acc holds running total

      }

    }
    factorialHelper(n, 1)
  }

  println("\n Factorial - tail rec (4): ")
  println(smartFactorial(4)) // won't crash with larger numbers


  // tail rec -> concatenate a string n times
  // without helper method
  def concatenateWords(aWord:String, n: Int, acc:String): String = {
    if (n <= 0) acc
    else {
      concatenateWords(aWord, n - 1, aWord + acc)
    }
  }
  println("\n tail rec concatenate words:")
  println(concatenateWords("hello ", 3, "WORLD"))


  // TASK

  val letters: List[String] = List("a", "b", "c")

  def lettersStandardRecursion(list:List[String]): Int = {
    if (list.isEmpty) {
      0
    } else {
      1 + lettersStandardRecursion(list.tail)
    }



  }
  println("lettersStandardRecursion: ", lettersStandardRecursion(letters))


//  def lettersTailRecursion(list:List[String]) : Int = {
//
//    @tailrec
//    def recursionHelper(list: List[String], acc: Int): Int = {
//      if (list.isEmpty) {
//        acc
//      } else {
//        acc + recursionHelper(list.tail)
//      }
//    }
//
//    recursionHelper(list, 1)
//  }

  // solution
  @tailrec
  def lettersTailRecursion(list: List[String], acc:Int): Int = {
    if (list.isEmpty) acc
    else {
      lettersTailRecursion(list.tail, acc + 1)
    }
  }

  println("\nletersTailRecursion", lettersTailRecursion(letters, 0))

  // with pattern matching

  def letterMatchRecursion(list:List[String]): Int = list match {
    case Nil => 0
    case ::(head, tail) => 1 + lettersStandardRecursion(list.tail)
  }

  // match for tail rec

  def letterMatchTailRecursion(list:List[String], acc:Int): Int = list match {
    case Nil => acc
    case ::(head, tail) => lettersTailRecursion(list.tail, acc + 1)
  }

  println("letterMatchTailRecursion", letterMatchTailRecursion(letters, 0))

  // recursion with enums

  object DayOfWeek extends Enumeration {
    type DayOfWeek = Value // allows day of week to be used as a type
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  def enumListToString(dayOfWeekEnums: List[DayOfWeek.Value]): String = {

    def enumListHelper(dayEnums: List[DayOfWeek.Value], acc:String): String = {
      dayEnums match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ", "
          enumListHelper(tail, acc + makeNiceToRead + head.toString)
      }
    }
    enumListHelper(dayOfWeekEnums, "")
  }

  println("\n enum to string method: " + enumListToString(List(DayOfWeek.Monday, DayOfWeek.Tuesday, DayOfWeek.Wednesday)))

  // recursion case objects

  sealed trait DayOfWeek
  case object Monday extends DayOfWeek
  case object Tuesday extends DayOfWeek
  case object Wednesday extends DayOfWeek
  case object Thursday extends DayOfWeek
  case object Friday extends DayOfWeek
  case object Saturday extends DayOfWeek
  case object Sunday extends DayOfWeek

  def caseObjectsToString(listDays: List[DayOfWeek]): String = {

    def helperMethod(remainingListOfDays: List[DayOfWeek], acc: String): String = {
      remainingListOfDays match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ", "
          helperMethod(tail, acc + makeNiceToRead + head.toString)
      }
    }
    helperMethod(listDays, "")
  }

  println("\n caseObjectToString: " + caseObjectsToString(List(Monday, Tuesday, Wednesday, Thursday)))

  // TASK 2

  object Fruit extends Enumeration {
    type Fruit = Value
    val Apple, Orange, Banana, Mango, Grape = Value

  }

  val fruitList: List[Fruit] = List(Fruit.Apple, Fruit.Orange, Fruit.Banana, Fruit.Apple, Fruit.Mango,
    Fruit.Apple, Fruit.Grape, Fruit.Banana)

//  def countFruit(fruits: List[Fruit], targetFruit: Fruit): Int = {
//
//    def helperFruit(remainingFruitList: List[Fruit], acc:Int): Int = {
//      remainingFruitList match {
//        case Nil => acc
//        case ::(head, tail) =>
//          val updatingAcc = if (head == targetFruit) acc + 1 else acc
//          helperFruit(tail, updatingAcc)
//      }
//      helperFruit(fruits, 0)
//    }
//  }



}


