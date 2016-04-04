/**
*  A Vector containing the colours guessed based on the 
*  user's input String
*/
class Guess(guessString: String) {
  private val cf = new ColourFactory
  val coloursGuessed = (for{c <- guessString} yield cf.getInstance(c.toString)).toVector
  override def toString = coloursGuessed.mkString("")
}
