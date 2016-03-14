

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