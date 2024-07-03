// MVP

3 + 4 * 57 < 300 // true
144 / 12 >= 12 // true

val cat: String = "cat"
val dog: String  = "dog"
cat < dog // true

val rabbit: String = "Rabbit"
val hamster: String = "Hamster"
rabbit < hamster // false

17 % 2 != 0 // true

75 / 9 < 30 && 89 / 6 < 20 // true

/**
 2. What is the difference between a string
 (e.g. "I love scala already") and a print line
 (e.g. println ("| love scala already") )?

 ANSWER: A string is an immutable piece of data, println allows you to output data
 to terminal
**/

// Extension
val upperString: String = "STRING"
val lowerString: String = "string"
upperString == lowerString // false, character case matters
upperString.toLowerCase == lowerString // true

val ten: String = "10"
ten.toInt.getClass // int
val eleven: String = "eleven"

// doesn't work
//eleven.toInt

11.toString.getClass // string

upperString.toLowerCase // string
lowerString.capitalize // String

// Research

//this won't work, using reserved word/keyword
// val new: String  = "new"

