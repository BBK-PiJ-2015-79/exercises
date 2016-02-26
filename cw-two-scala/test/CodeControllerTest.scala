import org.junit.{Test, Before}
import org.junit.Assert._
/**
  * Created by chris on 26/02/2016.
  */
class CodeControllerTest {

  var cc: CodeController =_

  @Before
  def setUp() = {
    cc = new CodeController
  }

  @Test
  def testCodeIsNotNull() ={
    assertNotNull(cc.code)
  }


}
