import scala.util.Random

/**
  * Created by chris on 26/02/2016.
  */
class CodeController {

  val SIZE_OF_CODE = 4
  val colours = Vector[Colour](Blue(), Green(), Yellow(), Red())
  val code = Array.fill[Colour](SIZE_OF_CODE){colours(Random.nextInt(SIZE_OF_CODE))} // generate the code



}
