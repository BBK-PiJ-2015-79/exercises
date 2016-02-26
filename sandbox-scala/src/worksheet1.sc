// Derek Banas video
10 + 3 * 5 / 2
10.0 + 3.0 * 5.0 / 2.0
var age = 18
val canVote = if(age >= 18) "Yes" else "No"
println("Ooh")

true || false

val aString = "I am the very model of a modern major general"
aString.filter(_ == 'a')
aString.filter(_ == 'a').isEmpty
aString.filter(_ == 'z')
aString.filter(_ == 'z').isEmpty
aString.map(c => (c.toUpper))

val lst = List(1,2,3)

var raleigh = new Bike
//raleigh.engine = "Pedal Power" // can't reassign to val
//raleigh.make = "Raleigh" // can't reassign to val

val bertie = new Chap("Bertie Wooster")
bertie.name


private def updateMap(someMap: Map[String, Int], someString: String):Map[String, Int] = {
  if(someMap.keySet.contains(someString)) Map((someString, someMap.get(someString).get + 1)) ++ someMap.filter(t => t._1 != someString)
  else someMap ++ Map((someString, 1))
}

val m1 = Map("Cheese" -> 1)
m1
updateMap(m1, "Bacon")

val sentence = "I am a mole and I live in a hole"
sentence.filter(_.isLetter)
sentence.filter(_.isLetter).map(_.isUpper).reduce((c1,c2) => c1 && c2)
"HEY DUDES".filter(_.isLetter).map(_.isUpper).reduce((c1,c2) => c1 && c2)

//sentence.split(" ").toSet.foreach(c => c) yield (c, sentence.split(" ").count(d => d == c))


(for(c: String <- sentence.split(" ").toSet) yield (c, sentence.split(" ").count(d => d == c))).toMap



