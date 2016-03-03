
import org.junit._
import org.junit.Assert._

class CodeTest {
  val code = new Code(4)

  @Test
  def testToString = {
    assertTrue(code.toString.length == 4)
  }
}
