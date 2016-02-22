import com.atomicscala.AtomicTest._
def squareThem(someNumbers: Int*) =
  //someNumbers.map(x => x * x).reduce((x1,x2) => x1 + x2) // awesomely, you can replace this with:
  someNumbers.map(x => x * x).sum
squareThem(2, 4)
squareThem(3, 3)
squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21
