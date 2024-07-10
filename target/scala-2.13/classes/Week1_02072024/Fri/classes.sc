// first way - unimplemented members

// like python every instantiation will need these 2 parameters
class ThemeParkEmptyParams(val hasRollerCoasters: Boolean, val diameterOfLargestLoop: Double)

// second way - implement members (curly braces)
// give default params
// everything in curly braces belongs to classes (members)
class ThemeParkDefaultParams{
  val hasRollerCoasters: Boolean = true
  val diameterOfLargestLoop: Double = 30.24
}

// mixture
class ThemeParkBoth(val diameterOfLargestLoop: Double){
  val hasRollerCoasters: Boolean = true
}

// instantiate, use classes to make objects

//val mercatorPark: ThemeParkEmptyParams = new ThemeParkEmptyParams(true, 7.95)
val mercatorPark: ThemeParkEmptyParams = new ThemeParkEmptyParams(hasRollerCoasters = true, diameterOfLargestLoop = 7.95)

mercatorPark.hasRollerCoasters

// default params
val disneyWorld: ThemeParkDefaultParams = new ThemeParkDefaultParams()
disneyWorld.diameterOfLargestLoop

// more likely to see no vals in i.e. age
class Hamster(age:Int, val colour: String)

val orange: String = "Orange"
val BooTheHamster: Hamster = new Hamster(1, orange)
BooTheHamster.colour

// Objects without classes
// used when we only need one of something
object DavidsDogs {
  val Loki: String = "Loki"
  val Lassie: String = "Lassie"
  val Rover: String = "Rover"
  val Oscar: String = "Oscar"
}

DavidsDogs.Lassie

// Inheritance
// override existing param

class Bakken extends ThemeParkDefaultParams{
  override val diameterOfLargestLoop: Double = 20.15
  val oldestThemePark: Boolean = true
}

class disneyParis extends ThemeParkEmptyParams(hasRollerCoasters = true, diameterOfLargestLoop = 100) {
  val oldestThemePark: Boolean = false
}

// task 1
class Family(val surname:String, val father:String, val mother:String) {
  val children: Int = 0
}

val smithFamily:Family = new Family("Smith", "Bob", "Karen") {
  override val children: Int = 1
}
smithFamily.surname

// traits
trait Mascot {
  val nameOfMainCharacter: String
}

trait OversizedFood {
  val hugeTurkeyLeg: Boolean
}

class DisneyWorld extends ThemeParkDefaultParams with Mascot with OversizedFood {
  override val nameOfMainCharacter: String = "Mickey"
  override val hugeTurkeyLeg: Boolean = true
}

val d:DisneyWorld = new DisneyWorld()