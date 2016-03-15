

val ar = new Array[(Guess, Feedback)](4)
println(ar)
val tup = ("Ho", "There")
println(tup)
println(tup._1 + tup._2)
println("."*4)
val OrderOfColours = "BGOPRYACDEFHIJKLMNQSTUVWXZ"
val cf = new ColourFactory
val myColours = Array.tabulate[Colour](6)(i=>cf.getInstance(OrderOfColours.charAt(i).toString)).toVector
myColours(0).equals(Blue())
Vector(Blue(), Green()).sameElements(Array(Blue(), Green()).toVector)
Vector(Blue(), Green()).sameElements(Array(Blue(), Green()))
Vector(Blue(), Green()).sameElements(Array(Green(), Blue()))
Vector(Blue(), Green()).corresponds(Array(Blue(), Green()).toVector){_ == _}
val guessString = "CBGB"
val coloursGuessed = (for{c <- guessString} yield cf.getInstance(c.toString)).toVector

