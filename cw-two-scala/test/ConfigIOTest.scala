import org.junit._
import org.junit.Assert._
class ConfigIOTest {

  @Test
  def testGetValidColoursVector(): Unit ={
    val expectedVector = Vector[Colour](Red(), Orange(), Yellow(), Blue(), Green(), Purple())
    assertEquals(expectedVector, ConfigIO.validColoursVector)
  }
}
