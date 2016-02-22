val v1 = Vector("Tea", "Coffee", "Milk")
val v2 = Vector("Biscuit", "Cake", "Sandwich")

(v1 ++ v2).foreach(s => println(s))
v1 ++: v2
def multipleParams(params: String*) = params.foreach(p => println(p))
multipleParams("Hello", "Ooh", "There\'s more!")

def whatAreMParams(params: String*) = println(params)

whatAreMParams("Hi", "There")

val someList = List("What\'s", "Up")
//whatAreMParams(someList) // nope, can't do this.

whatAreMParams()


