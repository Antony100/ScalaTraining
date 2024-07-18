package Week3_15072024

import Week3_15072024.Thu.AfternoonTask._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class AfternoonTaskSpec extends AnyWordSpec with Matchers {

  "calculateDepositRequired" should {
    "return the deposit required" when {
      "when given the house price and the percentage required" in {
        val result = calculateDepositRequired(10000, 10)
        result shouldBe 1000
      }
    }
  }

  "calculateMortgageAttainable" should {
    "return the mortgage amount attainable" when {
      "when given the person's salary and the given multiplier" in {
        val result = calculateMortgageAttainable(40000, 2)
        result == 80000
      }
    }
  }

  "hasDepositAmount" should {
    "return a Right" when {
      "when the deposit is higher than the desired percentage of the value of the house" in {
        val result = hasDepositAmount(90000, 900000, 10)
        result shouldBe Right(true)
      }
    }
    "return a Left" when {
      "when the deposit is lower than the desired percentage of the value of the house" in {
        val result = hasDepositAmount(90000, 900000, 20)
        result shouldBe Left("deposit is not enough")
      }

    }

  }

  "checkCreditScore" should {
    "return a Right" when {
      "when the credit score is higher than the qualifying credit score" in {
        val result = checkCreditScore(100, 99)
        result shouldBe Right(true)
      }
    }
    "return a Left" when {
      "when the credit score is lower than the qualifying score" in {
        val result = checkCreditScore(100, 101)
        result shouldBe Left("credit score too low")
      }

    }

  }

  "canAffordMortgage" should {
    "return a Right" when {
      "when the attainable mortgage is equal to or higher than the house price" in {
        val result = canAffordMortgage(200000, 50000, 4)
        result shouldBe Right(true)
      }
    }
    "return a Left" when {
      "when the attainable mortgage is lower than the house price" in {
        val result = canAffordMortgage(200000, 20000, 4)
        result shouldBe Left("house is unaffordable")
      }

    }

  }
}
