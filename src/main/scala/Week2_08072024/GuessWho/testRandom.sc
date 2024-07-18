import scala.util.Random

val random = new Random

val peopleList = List(
  "james",
  "dave",
  "harry"
)

val reply = peopleList(
  random.nextInt(peopleList.length)
)

val people: Map = Map(

)