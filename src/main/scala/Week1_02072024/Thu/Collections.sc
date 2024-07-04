// seq
val seq1: Seq[Int] = Seq(1, 2, 3)

//list
val list1: List[Int] = List(4, 5, 6)

// Map
// key value pairs (dictionary): key -> value
val map1: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3
)
// index seq
val getSeqfirst: Int = seq1(0) // index 0
val getSeqDataFirstHead: Int = seq1.head // index 0

// get everything except index 0
val getSeqTail = seq1.tail // List(2, 3)

// index List
val getListFirst: Int = list1(1)
val getListDataFirstHead: Int = list1.head // index 0
val getListTail = list1.tail

//Map values
val getMapData = map1("one")

// working with collections
val tripleSeq: Seq[Int] = seq1.map {
  number => number * 3
}

val tripleList: List[Int] = list1.map {
  number => number * 3
}

val tripleMap: Map[String, Int] = map1.map{
  case (key, value) => (key, value * 3)
}

val changeKey: Map[String, Int] = map1.map {
  case (key, value) => (key + "s", value)
}

//val changeKeyandValue

// filter
val filteredSeq: Seq[Int] = seq1.filter {
  number => number > 1
}

val filteredList: List[Int] = list1.filter {
  number => number > 5
}

filteredSeq == filteredList // the same (filtered seq converts to a list as its more efficient, list is a sequence)

// tuple = [String, Int]
val filteredMap: Map[String, Int] = {
  map1.filter(number => number._2 > 1)
}

println(list1)
val filterNotList: List[Int] = {
  list1.filterNot(number => number >= 5)
}

// exists
// return boolean value, check if something exists

val itemExistsInList: Boolean = list1.exists{
  number => number > 2
}

val itemExistsInSeq: Boolean = seq1.exists{
  number => number > 2
}

val itemExistsInMap: Boolean = map1.exists{
  number => number._2 > 2
}

// Contains
// check for 1 param
val containsSeq: Boolean = seq1.contains(2)
val containsList: Boolean = list1.contains(2)

val containsMap: Boolean = map1.contains("two")

// Task 1
val cohort: Seq[String] = Seq("Ant", "April", "Arei", "Bilal", "Jamie",
  "Joe", "Muhammad", "Roshan", "Spencer", "Tayamul", "Tom")

val colourMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green",
)

colourMap(2)
colourMap.filter(_._2 == "green").map(_._1)

// val addOneToKey: Map
val nums: Seq[Int] = Seq(10, 20, 30)

// add 1 to all numbers in collection
nums.map(number => number + 1
)

// remove evens
val numsWithEvens: List[Int] = List(1, 5, 7, 8, 10)
numsWithEvens.filterNot(number => number % 2 == 0)

val randomWord: Seq[String] = Seq("radishes are delicious")

val checkR: Boolean = randomWord.exists(
  letter => letter == 'r'
)


// sets cannot have duplicates, can be mutable and immutable (by default, immutable)

// Arrays
// sequences more common, Arrays are too powerful
val array1: Array[Int] = Array(2, 4, 6)
val plusTwo: Array[Int] = array1.map{
  number => number + 2
}

// appending to val + seq
val y: Seq[Int] = Seq(3, 4, 5)
val a = y :+ 6
val b = 2 +: y
println(y) // y stays the same





