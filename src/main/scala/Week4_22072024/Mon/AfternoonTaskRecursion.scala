package Week4_22072024.Mon

import Week4_22072024.Mon.AfternoonTaskRecursion.EuroTeams.{Albania, EuroTeams}

object AfternoonTaskRecursion extends App {

  // TASK 1
  object EuroTeams extends Enumeration {
    type EuroTeams = Value
    val Albania, Austria, Belgium, Croatia, CzechRepublic, Denmark, England, France, Georgia, Germany = Value

  }

  val teamsList: List[EuroTeams.Value] = EuroTeams.values.toList

  println(teamsList)

  def countTeams(teams: List[EuroTeams]): String = {

    def teamDisplayHelper(remainingTeamList: List[EuroTeams], acc: String): String = {
      remainingTeamList match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ", "
          teamDisplayHelper(tail, acc + makeNiceToRead + head.toString)
      }

    }

    teamDisplayHelper(teams, "")
  }

  println("team display helper: " + countTeams(teamsList))


  // TASK 2
  sealed class EuroTeamsCaseObject(name: String)

  object EuroTeamsCaseObject {
    case object Albania extends EuroTeamsCaseObject("Albania")

    case object Austria extends EuroTeamsCaseObject("Austria")

    case object Belgium extends EuroTeamsCaseObject("Belgium")

    case object Croatia extends EuroTeamsCaseObject("Croatia")

    case object CzechRepublic extends EuroTeamsCaseObject("Czech Republic")

    case object Denmark extends EuroTeamsCaseObject("Denmark")

    case object England extends EuroTeamsCaseObject("England")

    case object France extends EuroTeamsCaseObject("France")

    case object Georgia extends EuroTeamsCaseObject("Georgia")

    case object Germany extends EuroTeamsCaseObject("Germany")
  }

  val euroTeamsCaseObjectList: List[String] = List(EuroTeamsCaseObject.toString)



  def countTeamsCaseObject(teams: List[EuroTeamsCaseObject]): String = {

    def teamDisplayHelper(remainingTeamList: List[EuroTeamsCaseObject], acc: String): String = {
      remainingTeamList match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ", "
          teamDisplayHelper(tail, acc + makeNiceToRead + head.toString)
      }

    }

    teamDisplayHelper(teams, "")
  }

  println("countTeamCaseObject" + countTeamsCaseObject(List(EuroTeamsCaseObject.Albania)))

  // TASK 3
  val numbers: List[Int] = List.range(1, 21)

//  def isEven(numberList:List[Int], givenIndex: Int): Either[String, Boolean] = {
//
//    def isEvenHelper(currentIndex: Int, acc:Int): Either[String, Boolean] = {
//      currentIndex match {
//
//      }
//    }
//
//  }


  // TASK 4
  def cumulativeAddition (n:Int): Int = {


    def additionHelper(x: Int, acc: Int): Int = {

      if (x <= 1) acc
      else {
        additionHelper(x - 1, x + acc)
      }
    }
  additionHelper(n, 1)
}

  println("cumulativeAddition: " + cumulativeAddition(6))


}

