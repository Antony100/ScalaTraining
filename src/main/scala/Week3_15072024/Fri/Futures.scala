package Week3_15072024.Fri

// import for future. global = lazy val
import java.util.concurrent.TimeUnit
import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration.{Duration, FiniteDuration}

object Futures extends App{

  def addition(x:Int, y:Int): Int = {
    Thread.sleep(1000)
    x + y
  }

  def additionInFuture: Future[Int] = Future {
    addition(1, 2)
  }

  val waitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS)
  println(Await.result(additionInFuture, waitTime))

}
