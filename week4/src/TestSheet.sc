// Expressions
val aVal = 17
val sky = "Partly cloudy"
val temp = 62
val exp1 = if(sky == "Sunny" && temp > 80) true  else false
val exp2 = if((sky == "Partly cloudy" || sky == "Sunny")
                  && temp > 80) true else false
val exp3 = if((sky == "Partly cloudy" || sky == "Sunny")
  && (temp > 80 || temp < 20)) true else false
var fTemp = 90
var cTemp = (fTemp - 32) * (6.0 / 9.0) //type inference?
var fTempCheck = (cTemp * (9.0 / 6.0)) + 32
assert(fTemp == fTempCheck) //type inference

// methods
def getSquare(someInt: Integer): Integer = {
  someInt * someInt
}
val a = getSquare(3)
assert(a == 9)
val b = getSquare(6)
assert(b == 36)
val c = getSquare(5)
assert(c == 25)
def isArg1GreaterThanArg2(arg1: Double, arg2: Double): Boolean = {
  arg1 > arg2
}
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2 == true)
def manyTimesString(baseString: String, reps: Integer): String = {
  if(reps == 0) {
    ""
  }
  else {
    baseString + manyTimesString(baseString, reps - 1)
  }
}
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "Your message here")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Your message here")
def manyTimesString2(baseString: String, reps: Integer): String = {
  var returnString = ""
  for( i <- 0 to reps ) {
    returnString += baseString
  }
  returnString
}
val m3 = manyTimesString2("abc", 3)
assert("abcabcabc" == m1, "Your message here")
val m4 = manyTimesString2("123", 2)
assert("123123" == m2, "Your message here")

//Classes and Objects
var r1 = new Range(1, 10, 1)
println(r1.step)

var r2 = new Range(1, 10, 2)
println(r2.step)
var s1 = "Sally"
var s2 = "Sally"
println(
if(s1.equals(s2)) {
  "s1 and s2 are equal"
} else {
  "s1 and s2 are not equal"
})

//Creating Classes

var hippo = new Hippo()
var lion = new Lion()
var tiger = new Tiger()
var monkey = new Monkey()
var giraffe = new Giraffe()
var hippo2 = new Hippo()
var giraffe2 = new Giraffe()
var giraffe3 = new Giraffe()
//These come out as ClassName@MemAddress
// different instances have different memory addresses

// Methods inside clases

val sailboat = new Sailboat
val sb1 = sailboat.raise()
assert(sb1 == "Sails raised", "Expected Sails raised, Got " + sb1)
val sb2 = sailboat.lower()
assert(sb2 == "Sails lowered", "Expected Sails lowered, Got " + sb2)
val motorboat = new Motorboat
val mb1 = motorboat.on()
assert(mb1 == "Motor on", "Expected Motor on, Got " + mb1)
val mb2 = motorboat.off()
assert(mb2 == "Motor off", "Expected Motor off, Got " + mb2)

val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
val sailboat2 = new Sailboat
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

// Fields in classes

