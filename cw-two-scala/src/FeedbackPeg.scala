sealed trait FeedbackPeg{
  override def toString = {
    getClass.getName
  }
}
case class Black() extends FeedbackPeg
case class White() extends FeedbackPeg

