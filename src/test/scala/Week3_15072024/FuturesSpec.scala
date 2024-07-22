package Week3_15072024

import Week3_15072024.Fri.Futures._
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.matchers.should.Matchers
import org.scalatest.time.{Millis, Seconds, Span}
import org.scalatest.wordspec.AnyWordSpec

class FuturesSpec extends AnyWordSpec with Matchers with ScalaFutures{

  implicit val defaultWaitTime: PatienceConfig = PatienceConfig(timeout = Span(3, Seconds), interval = Span(500, Millis))

  "addition method" should {
    "add two ints" in {
      addition(1, 2) shouldEqual 3
    }
  }

  "additionInTheFuture" should {
    "eventually return the correct sum" in {
      whenReady(additionInFuture) {
      result => result shouldEqual 3
    }}

  }



}
