import scala.util.Random

class Code(size: Integer) {
  val colours = Vector[Colour](Blue(), Green(), Yellow(), Red())
  val code = Array.fill[Colour](size){colours(Random.nextInt(colours.length - 1))} // generate the code

  def getCode = code

  override def toString = code.mkString

}
