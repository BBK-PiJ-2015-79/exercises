import org.junit._
import org.junit.Assert._


class ColourFactoryTest {

  var cf: ColourFactory = _

  @Before
  def setUp(): Unit ={
    cf = new ColourFactory
  }

  @Test
  def testGetInstanceReturnsNull(): Unit ={
    assertNull(cf.getInstance("1"))
  }

  @Test
  def testGetInstanceReturnsRed(): Unit ={
    assertEquals(Red(), cf.getInstance("R"))
  }


}
