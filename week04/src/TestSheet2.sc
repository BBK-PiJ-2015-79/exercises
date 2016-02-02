import com.atomicscala.AtomicTest._
//Cups
val cup = new Cup
cup.add(45) is 45
cup.add(-15) is 30
cup.add(-50) is -20
val cup2 = new Cup
cup2.add(45) is 45
cup2.add(-55) is 0
cup2.add(10) is 10
cup2.add(-9) is 1
cup2.add(-2) is 0
cup.percentFull = 65 // apparently you can do this...
println(cup.percentFull)
val cup3 = new Cup
cup3.set(56)
cup3.get() is 56
//Vectors
//import scala.collection.immutable._
val v0 = Vector(2,2)
val v1: scala.collection.immutable.Vector[Int] = Vector(1,2)
val v2 = Vector[String]("What", "Up")
v2.last
v2.head
val v3 = Vector[String]("Birds", "Eye", "Potato", "Waffles")
v3.length
val myVector1 = Vector[Int](1, 2, 3, 4, 5, 6)
val myVector2 = Vector[Int](1, 2, 3, 4, 5, 6)
myVector1 is myVector2
println(myVector1)
println(myVector2)
val mixedVector = Vector[Vector[Int]](myVector1, myVector2)
mixedVector.head
var sent = ""
for(word <- v3) {
  println(word)
  sent = sent.concat(word.concat(" "))
}
println(sent)


/*/
for(word <- v3.filter())
  println(word)
*/

