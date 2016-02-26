
import org.junit._
import org.junit.Assert._

class ColourTest {
  var c1: Colour = _

  @Before
  def setUp() = {
    c1 = Blue()
  }

  @Test
  def testBlueIsBlue() = {
    assertTrue(c1.isInstanceOf[Blue])
  }

  @Test
  def testBlueIsNotGreen() = {
    assertFalse(c1.isInstanceOf[Green])
  }

  @Test
  def testColoursAreComparable() = {
    val c2 = Blue()
    val c3 = Green()
    assertTrue(c1 equals c2)
    assertFalse(c1 equals c3)
  }

}
