import org.junit.{Before, Test}
import org.junit.Assert._

class FeedbackTest {
  val blackPeg = new Black
  val whitePeg = new White
  @Test
  def testEmptyFeedbackToString = {
    val emptyVector: Vector[FeedbackPeg] = Vector()
    val feedback = new Feedback(emptyVector)
    assertEquals("No pegs", feedback.toString)
  }

  @Test
  def testBlackFeedbackToString = {
    val blackVector = Vector(blackPeg, blackPeg)
    val feedback = new Feedback(blackVector)
    assertEquals("Black, Black", feedback.toString)
  }

  @Test
  def testWhiteFeedbackToString = {
    val whiteVector = Vector(whitePeg, whitePeg)
    val feedback = new Feedback(whiteVector)
    assertEquals("White, White", feedback.toString)
  }
  @Test
  def testBlackWhiteFeedbackToString = {
    val mixedVector = Vector(whitePeg, blackPeg)
    val feedback = new Feedback(mixedVector)
    assertEquals("White, Black", feedback.toString)
  }
}
