// WITH PARENTHESES

// construct with no defined params
class park1

//with defined params (doesn't mean default)
// var/val not needed but best practice
class Park2(val rollercoaster:Boolean, val largestLoop:Double)
new Park2(rollercoaster = true, largestLoop = 4.5)

object Disney extends Park2(rollercoaster = false, largestLoop = 4.65)

//use if not giving defaults
abstract class Park3(val rollercoaster:Boolean, val loop:Double)

// new Park3() // doesn't work

// CONSTRUCTING WITH DEFAULT
class Park4(val coaster:Boolean = true, val loop:Double = 4.7)
new Park4(coaster = false)

// WITH CURLY BRACES

// no defined params
class Park5{}
new Park5

// constructed with defined params (not default) - DOESNT WORK
// make abstract or add defaults

//class Park6{
//  val coaster:Boolean
//  val loop: Double
//}

// construct with default
// must include val/var
class Park7 {
  val coaster:Boolean = true
  val loop: Double = 8.5
}
//override
new Park7{
  override val coaster: Boolean = false
}

// extending
object LegoLand extends Park7
LegoLand.loop

object LegoLand2 extends Park7 {
  override val loop: Double = 10.5
}

// How abstract works in both situations

// with curlys
abstract class Park8 {
  val coaster:Boolean
  val loop: Double
}
// bit more flexibility to instantiate
new Park8 {
  override val coaster: Boolean = false
  override val loop: Double = 8.75
}
// extending - must give value to every param, even if it has default params
object HydePark extends Park8 {
  override val coaster: Boolean = true
  override val loop: Double = 4.33
}

// DOESNT WORK, CAN'T INSTANTIATE WITH PARENTHASES

abstract class Park9(val coaster: Boolean, val loop:Double)
//new park9()

// works if we extend
object AnotherNewPark extends Park9(coaster = true, loop = 2.1
)

/** what is accessible? lose access to params of abstract class without val/var in round brackets
 */
AnotherNewPark.coaster

// rounds and curlys
class Park10 (val coaster:Boolean) {
  val loop: Double = 7.5
}

new Park10(coaster = true)

// TRAITS

// without defaults - works but not useful
//trait CandyFloss {
//  val hasCandyFloss: Boolean
//}

trait CandyFloss {
  val hasCandyFloss: true
}



