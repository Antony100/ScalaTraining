// functions

//anonymous function
(number:Int) => number + 1

// named
val addition = (number:Int) => number + 1

//method (also a function)
def  addition = (number:Int) => number + 1

//Override method
// mutable
def  addition = (number:Int) => number + 10

// Example method
def makeCupOfTea(numOfSugars:Int): String = {
  s"You have made a tea with $numOfSugars spoons of sugar"
}

makeCupOfTea(3)

// VAT method
val vat:Double = 1.4
def priceWithVAT(price:Double): Double = {
  price * vat
}

priceWithVAT(5.00)

// methods within a class
class Number(number:Int){

  def addition(differentNumber:Int): Int = {
    number + differentNumber
  }
}

val newNumberClass = new Number(10)

val classAddition = newNumberClass.addition(5)

// task 1
def getBigVal(input1:Int, input2: Int): String = {
  if (input1 > input2) {
    "first"
} else if (input2 > input1){
    "second"
  } else if(input1 == input2) {
    "same"
  } else {
    "error"
  }
}
getBigVal(5, 5)

def nameLength(firstName:String, secondName:String): Int = {
  if (firstName.length > secondName.length) {
    firstName.length
  }
  else if (secondName.length > firstName.length) {
    secondName.length
  }
  else if (firstName.length == secondName.length) {
    0
  } else {
    404
  }
}

//val nameResult Int = nameLength("tom", "hiddleston")

// pure function
val sentence: String = ""
def append(sentence:String, word:String): String = {
  sentence + "" + word.trim
}

val a = append(sentence, "Hello")
val b = append(sentence, "Hello")

//impure
var sentence2: String = ""
def appendImpure(word:String): String = {
  sentence2 = sentence2 + " " + word.trim
  sentence2.trim
}

val c = appendImpure("Hello")
val d = appendImpure("Hello")