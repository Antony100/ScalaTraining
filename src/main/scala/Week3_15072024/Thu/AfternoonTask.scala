package Week3_15072024.Thu

import Week3_15072024.Thu.Either.ValidatedUser

import scala.util.Either

object AfternoonTask extends App {

  // salary = £45,000
  // deposit = £20,000
  // flat price = £280,000
  // credit score = 577

  class AssessmentError(val errorMessage: String) extends Exception
  case object CalculateError extends AssessmentError(errorMessage = "couldn't calculate with given parameters")



  def calculateDepositRequired(housePrice:Int, percentageRequired:Int): Int = {
    (housePrice / 100) * percentageRequired
  }

  def calculateMortgageAttainable(annualSalary:Int, requiredMortgageMultiplier: Int):Int = {
    annualSalary * requiredMortgageMultiplier
  }

  def hasDepositAmount(deposit:Int, housePrice:Int, percentageRequired: Int): Either[String, Boolean] = {
    val calculatedDepositForProperty = calculateDepositRequired(housePrice, percentageRequired)
    if (calculatedDepositForProperty > deposit) Left("deposit is not enough") else Right(true)
  }


  def checkCreditScore(creditScore: Int, qualifyingCreditScore:Int): Either[String, Boolean] = {
    if (creditScore >= qualifyingCreditScore) Right(true) else Left("credit score too low")
  }


  def canAffordMortgage(housePrice:Int,annualSalary:Int, requiredMortgageMultiplier: Int): Either[String, Boolean] = {
    val attainableMortgage = (calculateMortgageAttainable(annualSalary, requiredMortgageMultiplier))
    if (housePrice > attainableMortgage) Left("house is unaffordable") else Right(true)
  }

  case class MortgageApplication(annualSalary: Int,deposit: Int, housePrice: Int, creditScore: Int)

  case class ValidatedMortgageApplication(annualSalary: Int, deposit: Int, housePrice: Int, creditScore: Int)

  def assessMortgageApplication(
                                 application: MortgageApplication,
                                 requiredMortgageMultiplier: Int,
                                 qualifyingCreditScore: Int,
                                 percentageRequired: Int
                               ): Either[String, ValidatedMortgageApplication] = {
    for {
      hasDeposit <- hasDepositAmount(application.deposit, application.housePrice, percentageRequired)
      checkCreditScore <- checkCreditScore(application.creditScore, qualifyingCreditScore)
      canAffordMortgage <- canAffordMortgage(application.housePrice, application.annualSalary, requiredMortgageMultiplier)
    } yield ValidatedMortgageApplication(
      application.annualSalary,
      application.deposit,
      application.housePrice,
      application.creditScore
    )
  }

  val SamanthaApplication = MortgageApplication(
    annualSalary = 45000,
    deposit = 20000,
    housePrice = 280000,
    creditScore = 577
  )

  val result = assessMortgageApplication(
    SamanthaApplication,
    requiredMortgageMultiplier = 4,
    qualifyingCreditScore = 600,
    percentageRequired = 10
  )

  println(result)

}


