package companion

class Stuff {
  def saythings = "Things"
  override def toString = "this is stuff, what more do you want?"
}

object Stuff {
  def apply() = new Stuff
}

object Test2 extends App {
  val s1 = Stuff()
  println(s1.toString)
  println(s1.saythings)
}