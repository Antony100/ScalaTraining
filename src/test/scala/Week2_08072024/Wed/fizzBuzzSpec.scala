package Week2_08072024.Wed

import org.scalatest.FlatSpec

class fizzBuzzSpec extends FlatSpec {

  "fizzBuzz" should "return Fizz when number is divisible by 3" in {
    val num = new fizzBuzz(3)
    assert(num.getFizzBuzz == "Fizz")
  }

  "fizzBuzz" should "return Buzz when number is divisible by 5" in {
    val num = new fizzBuzz(5)
    assert(num.getFizzBuzz == "Buzz")
  }

  "fizzBuzz" should "return FizzBuzz when number is divisible by 3 and 5" in {
    val num = new fizzBuzz(15)
    assert(num.getFizzBuzz == "FizzBuzz")
  }
}
