/**
*  Feedback pegs that represents whether a guess was correct
*  Black pegs represent a correct guess in the correct position
*  White pegs represent a correct guess in the incorrect position
*/
sealed trait FeedbackPeg{
  override def toString = {
    getClass.getName
  }
}
case class Black() extends FeedbackPeg
case class White() extends FeedbackPeg

