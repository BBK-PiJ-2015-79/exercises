class Feedback(pegs: Vector[FeedbackPeg]) {
  override def toString = {
    if(pegs.isEmpty) {
      "No pegs"
    }
    else {
      pegs.mkString(", ")
    }
  }
}
