// parent class
class Animal(val name:String, val age:Int, val speciesName: String, val conservationStatus: String,
             val avgLifespanRange: String, val numOfYoungRange: String)


// base classes
class Mammal (name:String, age: Int, speciesName: String, conservationStatus: String, avgLifespanRange: String,
              numOfYoungRange: String, val furColour: String)
  extends Animal(name, age, speciesName, conservationStatus, avgLifespanRange, numOfYoungRange ){
  val hasTail:Boolean = false

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
class Warthog(name:String, age:Int, speciesName: String, conservationStatus: String, avgLifespanRange: String,
              numOfYoungRange: String, furColour:String)
  extends Mammal(name, age, speciesName, conservationStatus, avgLifespanRange, numOfYoungRange, furColour){
  val hasTusks: Boolean = true
}

val pumba: Warthog = new Warthog("pumba",4, "big warthog", "safe", "4 years", "3-4", "brown")

pumba.conservationStatus