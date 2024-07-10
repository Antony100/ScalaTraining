/** 1) MAIN DIFFERENCES BETWEEN A CLASS AND CASE CLASS
 * Case class:
 * Good for modelling immutable data, has extra methods such as,apply/ unapply,hashcode,equals, copy,mtoString
 *
 * allows us a more concise way of defining classes
 * */

/**--------------------*/

/** 2) ERROR OR NO?
  a) OK    b)OK    c)OK    d)OK
  e) OK    f)ERROR g)OK

 */
case class Person(name: String, age: Int, nationality: String, isStudent:Boolean)

val firstPerson = new Person ("Carlos", 23, "Spanish", true)
val secondPerson = Person("Carlos", 23, "Spanish", isStudent = true)
val thirdPerson = Person("Chloe", 25, "British", isStudent = false)

class Animal (name: String, colour: String, pet: Boolean)
//val cat = Animal("cat", "black", true) // ERROR
val dog = new Animal ("dog", "white", true)

/**--------------------*/

/** 3) COMBINATIONS, TRUE OR FALSE*/

/**
 * chocolateMuffin, anotherChocolateMuffin, oneMoreChocolateMuffin are the same
 * */

case class Muffin(flavour: String, price: Double, storeBoughtFrom:String)

val chocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")
val blueberryMuffin = Muffin ("blueberry", 3.50, "Mercator Bakery")
val anotherChocolateMuffin = Muffin("chocolate", 3.50, "Mercator Bakery")

chocolateMuffin == blueberryMuffin
chocolateMuffin == anotherChocolateMuffin
