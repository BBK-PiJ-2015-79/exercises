import org.junit.{Before, Test}
import org.junit.Assert._

class InputValidatorTest {
  var validator: InputValidator = _

  @Before
  def setup = {
    validator = new InputValidator
  }

  @Test
  def testInputValidationTooLong(): Unit = {
    assertFalse(validator.isValidGuessString("ABCDE", 4))
  }

  @Test
  def testInputValidationTooShort(): Unit = {
    assertFalse(validator.isValidGuessString("ABC", 4))
  }

  @Test
  def testInputValidationNonAlphaChars(): Unit = {
    assertFalse(validator.isValidGuessString("A$BC", 4))
  }

  @Test
  def testInputValidationValidString(): Unit = {
    assertTrue(validator.isValidGuessString("CABC", 4))
  }
}
