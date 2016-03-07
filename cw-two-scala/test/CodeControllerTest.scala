import org.junit.{Test, Before}
import org.junit.Assert._
/**
  * Created by chris on 26/02/2016.
  */
class CodeControllerTest {

  var cc: CodeController =_
  var mc: CodeController = _

  @Before
  def setUp() = {
    cc = new CodeController(new CodeImpl(4))
  }

  @Test
  def testCodeIsNotNull() ={
    assertNotNull(cc.code)
  }

  @Test
  def testGetFeedbackReturnsEmpty() = {
    mc = new CodeController(new MockCode(Array(Red(), Red(), Red(), Red())))
    val feedback = mc.getFeedback(new Guess(Vector(Green(), Green(), Green(), Green())))
    assertTrue(feedback.pegs.isEmpty)
  }

  @Test
  def testGetFeedbackReturnsOneBlack() = {
    mc = new CodeController(new MockCode(Array(Red(), Red(), Red(), Red())))
    val feedback = mc.getFeedback(new Guess(Vector(Green(), Red(), Green(), Green())))
    assertEquals("Black", feedback.toString)
  }

  @Test
  def testGetFeedbackReturnsOneWhite() = {
    mc = new CodeController(new MockCode(Array(Red(), Blue(), Red(), Red())))
    val feedback = mc.getFeedback(new Guess(Vector(Green(), Red(), Green(), Green())))
    assertEquals("White", feedback.toString)
  }

  @Test
  def testGetFeedbackReturnsOneBlackOneWhite() = {
    mc = new CodeController(new MockCode(Array(Red(), Blue(), Red(), Red())))
    val feedback = mc.getFeedback(new Guess(Vector(Red(), Red(), Green(), Green())))
    assertEquals("Black, White", feedback.toString)
  }

  @Test
  def testGetFeedbackReturnsOneBlackThreeWhites() = {
    mc = new CodeController(new MockCode(Array(Red(), Blue(), Red(), Red(), Green())))
    val feedback = mc.getFeedback(new Guess(Vector(Red(), Red(), Green(), Green(), Blue())))
    assertEquals("Black, White, White, White", feedback.toString)
  }

  @Test
  def testGetFeedbackReturnsAllBlacks() = {
    mc = new CodeController(new MockCode(Array(Red(), Blue(), Red(), Red())))
    val feedback = mc.getFeedback(new Guess(Vector(Red(), Blue(), Red(), Red())))
    assertEquals("Black, Black, Black, Black", feedback.toString)
  }

  @Test
  def checkGuessTooSmallRejected() = {
    assertFalse(cc.validateGuess(new Guess(Vector(Red(), Green(), Blue()))))
  }

  @Test
  def checkGuessTooLargeRejected() = {
    assertFalse(cc.validateGuess(new Guess(Vector(Red(), Green(), Blue(), Green(), Blue()))))
  }

  @Test
  def checkRightSizeGuessAccepted() = {
    assertTrue(cc.validateGuess(new Guess(Vector(Green(), Blue(), Green(), Blue()))))
  }
}
