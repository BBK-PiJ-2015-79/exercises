/**
  * Some procedural style stuff done in Scala
  * Created by chris on 15/02/2016.
  */
object ScalaTest {
  def main(args: Array[String]): Unit = {
    var i = 0

    //Plain old while loop
    while(i <= 10) {
      println(i + ": While")
      i += 1
    }

    println("Final value after while loop is: " + i)

    i = 0
    do {
      println(i + ": do-while")
      i += 1
    } while(i < 20)

    println("Final value after do-while loop is: " + i)

    i=0
    for(i <- 8 to 12) {
      println(i + ": for-loop")
    }

    println("Final value after for-loop is: " + i)
    println("Notice that the last 'i' is in a different scope to the for-loop!")

    //another kind of for-loop
    val word = "SUPERCALLIFRAGILISTICEXPIALEDOCIOUS"

    for(i <- 0 until word.length) {
      println(word(i))
    }

    val aList = List(1,2,3,4,5)

    for(i <- aList) {
      println("List item: " + i)
    }

    // I find this syntax a little weird
    var evenList = for { i <- 1 to 20
      if(i % 2)  == 0
    } yield i

    for(i <- evenList)
      println(i)

    // does it work with a val?
    val evenValList = for { i <- 1 until 20
                            if(i%2) == 0
    } yield i

    for(i <- evenValList)
      println(i)

    // yes it does!

    //YET MORE LOOPY GOODNESS! OMFG!

    for(i <- 0 until 9; j <- 0 until 9) {
      println(i + ", " + j)
    }

    //no need for a nested loop. sweet.

    val meatList = List("Beef", "Fish", "Pork")
    val partList = List("Finger", "Shoulder", "Flank")

    for(meat <- meatList; part <- partList) {
      println(meat + " " + part)
    }


  }

}
