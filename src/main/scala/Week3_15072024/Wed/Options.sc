trait Pizza {
  val size: Int
  val crust: Option[String]
}

object PersonalPizza extends Pizza {
  override val size: Int = 7
  override val crust: Option[String] = None
}


object smallClassic extends Pizza {
  override val size: Int = 9
  override val crust: Option[String] = Some("classic")
}

object smallItalian extends Pizza {
  override val size: Int = 9
  override val crust: Option[String] = Some("Italian")
}

val pizzaOrder: Pizza = new Pizza {
  override val size: Int = 9
  override val crust: Option[String] = Some("Italian")
}

def whatCrust(pizza: Pizza): String = {
  pizza.crust match {
    case Some("classic") => "has classic crust"
    case Some("Italian") => "has Italian crust"
    case Some(x) => s"$x is not a valid crust type"
    case None => "Default crust - classic"
  }
}

whatCrust(pizzaOrder)

// .get
// bad practice -
val getCrust:String = pizzaOrder.crust.get

// .getOrElse
// allows for default to be given
val getOrElseCrust: String = pizzaOrder.crust.getOrElse("classic") // classic is default

case class ChocolateBar(name:String, filling: Option[String] = None)

val snickers: ChocolateBar = new ChocolateBar(name="snickers")

val dairyMilk: ChocolateBar = new ChocolateBar("dairy milk hazelnut", Some("hazelnut"))

dairyMilk.filling

