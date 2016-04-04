import scala.util.Random

/**
*  Colours are loading from config file
*  @param size The length of the code
*/
class CodeImpl(size: Integer) extends Code {
  val colours = ConfigIO.validColoursVector
  val code = Array.fill[Colour](size){colours(Random.nextInt(colours.length - 1))} // generate the code

  override def getCode = code

  override def toString = code.mkString

}
