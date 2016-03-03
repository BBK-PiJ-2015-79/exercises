package companion

class Bloke(val firstName: String = "Bertram", val secondName: String = "Wooster") {
  def greet = s"What ho, what ho, what ho! $firstName $secondName here!"
}

object Bloke {
  def apply(secondName: String = "Wooster") = new Bloke(secondName = secondName)
}

object Test extends App {
  val b1 = Bloke("Carruthers")
  println(b1.greet)
  val b2 = Bloke("Smith")
  println(b2.greet)
  val b3 = Bloke()
  println(b3.greet)
}