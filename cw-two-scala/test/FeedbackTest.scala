import org.junit.{Before, Test}
import org.junit.Assert._

class FeedbackTest {
  val blackPeg = new Black
  val whitePeg = new White
  @Test
  def testEmptyFeedbackToString = {
    val emptyArray: Vector[FeedbackPeg] = Vector()
    val feedback = new Feedback(emptyArray)
    assertEquals("No pegs", feedback.toString)
  }


  @Test
  def testBlackFeedbackToString = {
    val blackArray = Vector(blackPeg, blackPeg)
    val feedback = new Feedback(blackArray)
    assertEquals("Black, Black", feedback.toString)
  }
  /*
  @Test
  def testWhiteFeedbackToString = {
    val emptyArray: Array[FeedbackPeg] = Array.empty
    val feedback = new Feedback(emptyArray)
    assertEquals("No pegs", feedback.toString)
  }

  @Test
  def testBlackWhiteFeedbackToString = {
    val emptyArray: Array[FeedbackPeg] = Array.empty
    val feedback = new Feedback(emptyArray)
    assertEquals("No pegs", feedback.toString)
  }
  */
}
