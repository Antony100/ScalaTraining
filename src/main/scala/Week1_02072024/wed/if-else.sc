val weather: String = "cold"
val season: String = "winter"

if (weather == "cold" && season == "winter") {
  println(s"it is $weather weather" + "!")
} else {
  println("Don't take a coat")
}

// else if
if (weather == "cold") {
  println("take a coat")
} else if (weather == "rain") {
  println("take umbrella")
} else {
  println("take nothing")
}

// Task 1
val grade: Int = 91

if (grade <= 49) {
  println("F")
} else if (grade < 60) {
  println("E")
} else if (grade < 70) {
  println("D")
} else if (grade < 80) {
  println("C")
} else if (grade < 90) {
  println("B")
} else if (grade >= 90) {
  println("A")
} else {
  println("No grade given")
}

// Task 2
val personAge: Int = 14

if (personAge >= 4 && personAge < 8) {
  println("U")
} else if (personAge >= 8 && personAge < 12) {
  println("PG")
} else if (personAge >= 12 && personAge < 15) {
  println("12A")
} else if (personAge >= 15 && personAge < 18) {
  println("15")
} else if (personAge >= 18) {
  println("18")
} else {
  println("U")
}