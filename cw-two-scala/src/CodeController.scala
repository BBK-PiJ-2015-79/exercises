class CodeController(val code:Code) {




  //TODO check guess and give feedback
  def getFeedback(guess: Guess) = {
    val numBlackPegs = guess.coloursGuessed.zip(code.getCode).count(t => t._1 == t._2)
    val guessMap = guess.coloursGuessed.groupBy(identity).mapValues(_.size)
    val codeMap = code.getCode.groupBy(identity).mapValues(_.size)
    val numWhitePegs = guessMap.filterKeys(t => codeMap.contains(t)).map {
      case(k,v) => k -> (if(v < codeMap.get(k).get) v else codeMap.getOrElse(k, 0))
    }.foldLeft(0)(_ + _._2) - numBlackPegs

    new Feedback(Vector.fill(numBlackPegs)(Black()) ++ Vector.fill(numWhitePegs)(White()))
  }


}
