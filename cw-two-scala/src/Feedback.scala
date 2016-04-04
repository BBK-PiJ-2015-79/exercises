/**
*  A class to hold thevector of feedback pegs
*/
class Feedback(val pegs: Vector[FeedbackPeg]) {
  override def toString = {
    if(pegs.isEmpty) {
      "No pegs"
    }
    else {
      pegs.mkString(", ")
    }
  }
}
