// s
val name: String = "Antony"
println(s"My name is $name")

val number: Int = 7

print(s"$number x $number = ${number*number}")

// f

val pi: Double = 3.14156

println(f"pi to 2 decimal places is $pi%.2f")
println(f"pi to 4 decimal places is $pi%.4f")

printf("%s", name)

// raw
println("hello \n world")
println(raw"hello \n world") // shows the n, doesn't execute special character

// Task

val person1: String = "John"
val person2: String = "Alan"
println(s"$person1 is older than $person2")

val johnAge: Double = 50.56
val alanAge: Double = 45.33
println(f"$person1 is ${johnAge - alanAge}%.1f years older than $person2")

println(raw"\n\n\n\n\nsameline\n\n")

val height: Double = 1.6

println(s"$person1 is $height m tall")