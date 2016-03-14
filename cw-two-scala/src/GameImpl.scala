
class GameImpl extends GameAbstractImpl{
  /**
    * Run a one or more games of mastermind, until the player
    * quits.
    */
  override def runGames: Unit = {
    var codeGuessed: Boolean = false
    var numberOfGuessesLeft = ConfigIO.numberOfGuesses
    val ui = new TextUI
    val code = new CodeImpl(ConfigIO.codeSize)
    val cc = new CodeController(code)
    val guessHistory = new Array[(Guess, Feedback)](ConfigIO.numberOfGuesses)

    ui.greet()

    while(!codeGuessed && numberOfGuessesLeft > 0){
      if(getShowCode) ui.displayCode(code)
      ui.promptForGuess(numberOfGuessesLeft)
      //val guess:Guess = ui.getGuess()
      //codeGuessed = cc.isWinningGuess(guess)
      numberOfGuessesLeft -= 1
    }
  }
}
