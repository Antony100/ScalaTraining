val weather: String = "Cold"

// else if
if (weather == "cold") {
  println("take a coat")
} else if (weather == "rain") {
  println("take umbrella")
} else {
  println("take nothing")
}

// match a val
weather.toLowerCase() match {
  case "cold" => println("take a coat")
  case "rain" => println("take umbrella")
  case _ => println(s"$weather is not valid")
}

// match an Int
val numOfWatermelons: Int = -1

numOfWatermelons match {
  case x if x <= 0 => println("must be more than zero") // if guard - conditional be careful of ordering
  case 1 | 2 | 3 => println("John can carry with no bag")
  case 4 | 5 => println("John needs a bag")
  case _ => println(s"$numOfWatermelons is invalid")
}

// matching objects
sealed trait Temperature
object Cold extends Temperature
object Hot extends Temperature
object Mild extends Temperature

val weather: Temperature = Cold
weather match {
  case Cold => "Take a coat"
  case Hot => "take suncream"
  case Mild => "Light jacket"
  case _ => "not valid"
}

// match with classes
abstract class Notification // cannot be instantiated, must be extended

case class Email(sender:String, title: String, body: String) extends Notification

case class SMS(caller:String, message:String) extends Notification

case class VoiceRecording(contactName:String, link:String) extends Notification

val notification: Notification = SMS("Mum", "are you home?")

notification match {
  case Email(sender, title, body) => "Email from " + sender + "Title: " + title
  case SMS(caller, message) if caller == "Mum" => "SMS from " + caller + " Dont ignore"
  case SMS(caller, message) => "SMS from " + caller
  case VoiceRecording(contactName, link) => "recording from " + contactName + "With link: " + link
  case _ => "not valid"
}

// TASK 1
val pizzaFlavour = "Spicy"

pizzaFlavour.toLowerCase match {
  case "spicy" => "Mexican"
  case "sweet" => "Hawaiian"
  case "fresh" => "Margherita"
  case _ => "flavour not recognised"
}

val pizzaSize = 7

pizzaSize match {
  case 7 => "Personal"
  case 9 => "Small"
  case 11 => "Medium"
  case 14 => "Large"
  case _ => "invalid pizza choice"
}

case class Pizza (price: Double, stuffedCrust: Boolean)

val pizza: Pizza = Pizza(5.99, stuffedCrust = false)
