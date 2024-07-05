// parent class
class Animal(val name:String, val age:Int)

// base classes
class Mammal (name:String , age: Int, val furColour: String) extends Animal(name, age){
  val hasTail:Boolean = false

}
class Bird (name:String , age: Int, val featherColour: String, val beakLength: Double) extends Animal(name, age)

class Insect(name:String, age:Int) extends Animal(name, age){
  val pollinates: Boolean = false
}

// traits
trait limbs {
  val numOfLimbs: Int
  val limbsMissing: Int
}

trait canFly {
  val canFly: Boolean = true
}

trait wingSpan {
  val wingSpan: Double
}


// animals
class Warthog(name:String, age:Int, furColour:String) extends Mammal(name, age,furColour){
  val hasTusks: Boolean = true
}

class owl(name:String , age: Int, featherColour: String, beakLength: Double) extends Bird(name, age, featherColour, beakLength) with canFly  with wingSpan {
  override val wingSpan: Double = 15.5
  val hootsPerNight: Int = 0
}

class Dragonfly(name: String, age:Int) extends Insect(name, age) with limbs with canFly with wingSpan {
  override val numOfLimbs: Int = 6
  override val limbsMissing: Int = 0
  override val wingSpan: Double = 0.3
  val wingPairs: Int = 2

}


// animal instances
val pumba: Warthog = new Warthog("Pumba", 3, "brown") {
  override val hasTail: Boolean = true
}
pumba.hasTail

val hooty: owl = new owl(name = "Hooty", age = 5, featherColour = "silver", beakLength = 3.2){
  override val hootsPerNight: Int = 89
}

hooty.name
hooty.age
hooty.canFly
hooty.wingSpan


val darren: Dragonfly = new Dragonfly("Darren", 1)

// colour is different depending on class?
darren.wingPairs
darren.pollinates
darren.numOfLimbs
darren.canFly
darren.name
