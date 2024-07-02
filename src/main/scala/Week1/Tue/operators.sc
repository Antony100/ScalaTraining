// Arithmetic
val a: Int = 10
val b: Int = 5
val c : Int = 3

val addAll = a + b + c
val subtractAll = a - b - c
val divide = a / b
val modulo = a % c // remainder 1
val multiply = a * b * c

// Relational
a == b // false
a == a // true
a != b // true
a < b // false
a > b // true
a >= a // true
a <= a // true

// Logical
// combine booleans

val and =  true && true
val or = true || false
val not = !false

// task 1
//A && B
val lAND1 = true && true
val lAND2 = true && false
val lAND3 = false && true
val lAND4 = false && false

// A or B
val lOR1 = true || true
val lOR2 = true || false
val lOR3 = false || true
val lOR4 = false || false

// Not
val lNot1 = !true
val lNot2 = !false

// task 2
4 + 3 * 55 < 300
96 / 12 >= 8
"hamster" < "hippo" // comparing alphabetically
8 % 2 == 0
156/ 8 < 20 && 54 < 20 && 54 / 4 < 14