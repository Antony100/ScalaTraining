case class SuperHero(realName:String, heroName:String, weakness:String)

//apply method - keyword new not needed
val newSuperHero: SuperHero = SuperHero.apply("clark kent", "superman", "kryptonite")

// this works
val anotherHero: SuperHero = SuperHero("clark kent", "superman", "kryptonite")

newSuperHero == anotherHero

// copy method - enter what you want to update
val updateName = anotherHero.copy(realName = "Clark Lane")


// TASK

case class Dog(name:String, breed: String, age:Int)

val butch: Dog = Dog("Butch", "Bulldog", 3)
val hans: Dog = Dog("Hans", "German Shepherd", 4)
val lassie: Dog = Dog("Lassie", "Golden Retriever", 8)
val sam: Dog = Dog("Sam", "Sausage dog", 6)

sam.getClass

val listOfDogs:List[String] = List("butch", "hans", "lassie", "sam")

listOfDogs.getClass
case class Kennel(name:String, listOfDogs: List[String])

val kennel1: Kennel = Kennel(name = "kennel1", listOfDogs = listOfDogs)

val kennelNameChange = kennel1.copy(name = "kennel2")

kennelNameChange.name
kennelNameChange.listOfDogs

case class upgradedKennel(
                           name:String,
                           listOfDogs: List[String],
                           listOfCats: List[String],
                           listOfBirds: List[String],
                         )

case class Cat(name:String, breed: String, isScratchy:Boolean)
case class Bird(name:String, colour:String, wingspan:Double)

val tom: Cat = Cat("Tom", breed = "tabby", isScratchy = true)

val tweety: Bird = Bird("tweety", colour = "yellow", wingspan = 4.1)

val newKennel: upgradedKennel = upgradedKennel("superKennel", listOfDogs, List("tom"), List("tweety"))

newKennel.listOfCats
newKennel.listOfBirds



case class KennelwithMap(name:String, animals:Map[String, List[String]]) {

  def addAnimals(animalType:String, animalName:String): List[String] = {
    animals(animalType) :+ animalName
  }
}

val animalsMap: Map[String, List[String]] = Map(
  "dogs" -> listOfDogs,
  "cats" -> List("scratchy", "tom"),
  "birds" -> List("tweety"),
)

val animalParadise: KennelwithMap = KennelwithMap(name = "animalParadise", animals = animalsMap)

animalParadise.animals("dogs")
animalParadise.animals("cats")
animalParadise.addAnimals("cats", "bob")
animalParadise.animals("cats")
animalParadise.animals