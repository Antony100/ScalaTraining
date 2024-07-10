package Week2_08072024.Wed


class fizzBuzz (num:Int) {

  def getFizzBuzz: String = {

    if (num % 3 == 0 && num % 5 ==0) {
      "FizzBuzz"
    } else if (num % 3 ==0) {
      "Fizz"
    } else if (num % 5 == 0)  {
      "Buzz"
    } else {
      "None"
    }
  }
}