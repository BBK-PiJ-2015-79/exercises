import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

/**
  * Code take from the 'Scala for Java Programmers' tutorial
  * available here:
  *
  * http://docs.scala-lang.org/tutorials/scala-for-java-programmers.html
  */
object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}