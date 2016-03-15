class CodeController(val code:Code) {

  /**
    * checks if guess is right length and valid colour
    * @param guess the user's guess
    * @return boolean is valid guess
    */
  def validateGuess(guess: Guess) = {
    val validColours = ConfigIO.validColoursVector
    guess.coloursGuessed.forall(c => validColours.contains(c)) && guess.coloursGuessed.length == code.getCode.length
  }

  /**
    * creates a a Feedback based on guess
    * @param guess the user's guess
    * @return Feedback
    */
  def getFeedback(guess: Guess) = {
    val numBlackPegs = guess.coloursGuessed.zip(code.getCode).count(t => t._1 == t._2)
    val guessMap = guess.coloursGuessed.groupBy(identity).mapValues(_.size)
    val codeMap = code.getCode.groupBy(identity).mapValues(_.length)
    val numWhitePegs = guessMap.filterKeys(t => codeMap.contains(t)).map {
      case(k,v) => k -> (if(v < codeMap.get(k).get) v else codeMap.getOrElse(k, 0))
    }.foldLeft(0)(_ + _._2) - numBlackPegs

    new Feedback(Vector.fill(numBlackPegs)(Black()) ++ Vector.fill(numWhitePegs)(White()))
  }

  /**
    * checks if guess matches code
    * @param guess the user's guess
    * @return boolean is winning guess
    */
  def isWinningGuess(guess: Guess) = {
    //guess.coloursGuessed.zip(code.getCode).forall()
    guess.coloursGuessed.sameElements(code.getCode)
  }


}
