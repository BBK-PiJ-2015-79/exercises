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
    //mc = new CodeController(new MockCode(4))
  }

  @Test
  def testCodeIsNotNull() ={
    assertNotNull(cc.code)
  }


}
