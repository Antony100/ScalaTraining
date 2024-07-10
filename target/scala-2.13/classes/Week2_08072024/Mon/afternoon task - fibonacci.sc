val fibs: LazyList[Int] = 0 #:: fibs.scanLeft(1)(_ + _)

fibs.take(10).toList

val fibsTask: LazyList[Int] = 3 #:: fibs.scanLeft(4)(_ + _)

fibsTask.take(10).toList

//var fibsImpure: List[Int] = {
//  var result:LazyList[Int] = 0 #:: fibs.scanLeft(1)(_ + _)
//  result.toList
//}
//
//
//fibsImpure.take(2).toList
//fibsImpure


def fibsMethod(n:Int): List[Int] = {
  val result: LazyList[Int] = 0 #:: fibs.scanLeft(1)(_ + _).take(n)
  result.toList
}
fibsMethod(3)


// EXTENSION

val seq1: Seq[Int] = Seq(3, 4, 7, 11, 18)
seq1.mkString(",")

import scala.io.StdIn.readLine


println("Hello")
val name = readLine()
println(s"hello, $name")


/** SOURCES
 https://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-scanleft-example/

  INFIX: https://docs.scala-lang.org/style/method-invocation.html
 */
