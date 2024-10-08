package Week4_22072024


import Week4_22072024.Mon.Recursion
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class RecursionSpec extends AnyWordSpec with Matchers{

  "concatenateWords" should {

    "return the acc if n is negative" in {
      val methodCall = Recursion.concatenateWords("hello", -1, "")
      val expectedResult = ""
      methodCall shouldEqual expectedResult
    }

    "returns the acc if n is 0" in {

      Recursion.concatenateWords("hello", 0, "") shouldBe ""
    }

    "returns a concatenated string of 'hello' 3 times is in 3" in {

      Recursion.concatenateWords("hello ", 3, "") shouldEqual "hello hello hello "
    }

    "concatenate an empty string" in {
      Recursion.concatenateWords("", 3, "") shouldEqual ""

    }

    "concatenate words when the acc isn't empty" in {
      Recursion.concatenateWords("hello ", 3, "appendMe") shouldEqual "hello hello hello appendMe"
    }
  }

}
