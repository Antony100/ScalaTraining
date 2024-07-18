package Week3_15072024

import Week3_15072024.Thu.Either._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class EitherSpec extends AnyWordSpec with Matchers {

  "isOdd" should {
    "return a Right" when {
      "when number is odd" in {
        val result = isOdd(3)
        result shouldBe Right("3 is odd")
      }
      "when number is odd and large" in {
        val result = isOdd(100001)
        result shouldBe Right("100001 is odd")
      }
    }
    "return a Left" when {
      "the number is even" in {
        val result = isOdd(2)
        result shouldBe Left(IsOddError)
      }

    }

  }
}
