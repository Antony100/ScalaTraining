// MVP
val watermelons: Int = 2
val hasBag: Boolean = true
val convertedValue: Double = 1.397

if (watermelons <= 3) {
  println(s"Doesn't need a bag for $watermelons watermelon(s)")
} else if (watermelons <= 5) {
  println(s"needs a bag for $watermelons watermelons")
} else {
  println(s"can't carry $watermelons watermelons")
}

if (watermelons <= 3) {
  println(s"Doesn't need a bag for $watermelons watermelon(s)")
} else if (watermelons <= 5 && hasBag) {
  println(s"has a bag, is able to take $watermelons watermelons")
} else if (watermelons <= 5 && !hasBag) {
  println(s"No bag, unable to take $watermelons watermelons")
} else {
  println(s"can't carry $watermelons watermelons")
}

// without else if
if ((watermelons <= 5 && hasBag) || (watermelons <= 3)) {
  println("John is able to take the watermelons")
} else {
  println("john can't take the water melons")
}

if ((watermelons <= 5 && hasBag) || (watermelons <= 3)) {
  println(f"The cost is ${watermelons * convertedValue}%.2f")
} else {
  println("john can't take the water melons")
}

// Extension

// https://docs.scala-lang.org/tour/operators.html order of precedence

(true || false && false)
((true || false) && false)
(false && false)
(false && true)
(1 < 48 & 7 != 10 | 19 + 10 == 21)

// Research

// doesn't work
//if (watermelons <= 3) {
//  val outcome: String = "Watermelons delivered"
//} else if (watermelons <= 5) {
//  val outcome: String = "watermelons not delivered"
//} else {
//  println("error")
//}

val outcome: String =
  if (watermelons <= 3) {
    "watermelons delivered"
  } else if (watermelons <= 5) {
    "watermelons not delivered"
  } else {
    "error"
  }

println(outcome)

val num1: Int = 40
val num2: Int = 20

val numOutcome: String =
  if (num1 > num2) {
    "yes"
  } else {
    "no"
  }

val altOutcome: String = if (num1 > num2) "yes" else "no"

