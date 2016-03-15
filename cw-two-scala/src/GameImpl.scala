
class GameImpl(easy: Boolean = false) extends Game {
  /**
    * Run a one or more games of mastermind, until the player
    * quits.
    */
  val showCode = easy
  override def runGames: Unit = {
    var playGame = true
    val ui = new TextUI

    ui.greet()

    while(playGame) {
      var codeGuessed: Boolean = false
      var numberOfGuessesLeft = ConfigIO.numberOfGuesses

      val code = new CodeImpl(ConfigIO.codeSize)
      val cc = new CodeController(code)
      val guessHistory = new Array[(Guess, Feedback)](ConfigIO.numberOfGuesses)

      while(!codeGuessed && numberOfGuessesLeft > 0){
        if(showCode) ui.displayCode(code)
        ui.promptForGuess(numberOfGuessesLeft)

        val guess = new Guess(ui.getUserInput())
        if(cc.validateGuess(guess)) {
          //valid guess, do stuff!
          guessHistory(guessHistory.length - numberOfGuessesLeft) = (guess, cc.getFeedback(guess))
          ui.showFeedback(guessHistory)
          codeGuessed = cc.isWinningGuess(guess)
          numberOfGuessesLeft -= 1
        }
      }

      if(codeGuessed) ui.displayWinningMessage()
      else ui.displayLosingMessage()
      playGame = ui.playAgain()
    }

  }

}

object GameImpl {
  def apply(easy: Boolean) = {
    new GameImpl(easy)
  }
}
