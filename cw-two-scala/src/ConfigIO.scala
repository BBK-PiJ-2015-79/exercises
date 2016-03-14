import com.typesafe.config.ConfigFactory

object ConfigIO {

  val cf = ConfigFactory.load()
  val codeSize = cf.getInt("mastermind.codeSize")
  val numberOfValidColours = cf.getInt("mastermind.numberOfValidColours")
  val orderOfColours = cf.getString("mastermind.orderOfColours")
  val validColoursVector = generateValidColoursVector()

  private def generateValidColoursVector(): Vector[Colour] ={
    val cf = new ColourFactory
      Array.tabulate[Colour](numberOfValidColours)(i=>cf.getInstance(orderOfColours.charAt(i).toString)).toVector
  }
}
