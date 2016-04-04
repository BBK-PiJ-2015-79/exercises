import com.typesafe.config.ConfigFactory

/**
*  ConfigIO loads values from application.conf using Typsafe
*  generateValidColoursVector method generates a Vector of valid colours
*  based on config value of number of valid colours
*/
object ConfigIO {

  val cf = ConfigFactory.load()
  val codeSize = cf.getInt("mastermind.codeSize")
  val numberOfValidColours = cf.getInt("mastermind.numberOfValidColours")
  val orderOfColours = cf.getString("mastermind.orderOfColours")
  val validColoursVector = generateValidColoursVector()
  val numberOfGuesses = cf.getInt("mastermind.numberOfGuesses")

  private def generateValidColoursVector(): Vector[Colour] ={
    val cf = new ColourFactory
      Array.tabulate[Colour](numberOfValidColours)(i=>cf.getInstance(orderOfColours.charAt(i).toString)).toVector
  }
}
