package Week2_08072024.Wed

import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {

  "add" should "add numbers" in {
    val nums = new TwoNumbers(1, 2) // new instance
    assert(nums.add == 3)
  }

  "subtract" should "subtract y from x" in {
    val nums = new TwoNumbers(2, 1) // new instance
    assert(nums.subtract == 1)
  }

  "multiply" should "return the product of x and y" in {
    val nums = new TwoNumbers(2, 4) // new instance
    assert(nums.multiply == 8)
  }

  "divide" should "divide x by y and return result" in {
    val nums = new TwoNumbers(8, 2) // new instance
    assert(nums.divide == 4)
  }

  "isAMultiple" should "return true or false if x is divisible by y" in {
    val nums = new TwoNumbers(8, 2) // new instance
    assert(nums.isAMultiple() == true)
  }





}
