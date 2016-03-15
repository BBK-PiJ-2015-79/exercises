import scala.io.StdIn._

class TextUI {
  //TODO handle variable number of colours/guesses
  def greet() = {
    val validColourString = ConfigIO.validColoursVector.map(_.toLongString).reduce((c1,c2) => c1 + ", " + c2)
    println(s"""Welcome to Mastermind.

This is a text version of the classic board game Mastermind.
The computer will think of a secret code.
The code consists of ${ConfigIO.codeSize} colored pegs.
The pegs may be one of ${ConfigIO.numberOfValidColours} colors: ${validColourString}.
A color may appear more than once in the code.

You try to guess what colored pegs are in the code and what order they are in
After making a guess the result will be displayed.
A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.
For each peg in the guess that is the correct color, but is out of position, you get a white peg.

Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.
When entering guesses you only need to enter the first character of the color as a capital letter.

Generating secret code ....
""")
  }

  def displayCode(code: Code) = {
    println("The secret code is " + code.toString)
  }

  def promptForGuess(guessesLeft: Int) = {
    println(s"""You have $guessesLeft guesses left.
What is your next guess?
Type in the characters for your guess and press enter.
Enter guess: """)
  }
  def getUserInput() = {
    val userInput = readLine()
    userInput.trim.toUpperCase //allow lower case input as valid
  }
  def showFeedback(guessHistory : Array[(Guess, Feedback)]) = {
    guessHistory.foreach(t => {
      if(t == null) {
        // print null feedback
        println("." * ConfigIO.codeSize)
      }
      else {
        // print
        println(t._1 + " Result: " + t._2)
      }
    })
  }

  def displayWinningMessage() ={
    print("""You solved the puzzle! Good job.
Enter Y for another game or anything else to quit: """)
  }

  def displayLosingMessage() ={
    print("""You did not solve the puzzle. Too bad.
Enter Y for another game or anything else to quit: """)
  }

  def playAgain() = {
    val playAgain = getUserInput()
    if(playAgain == "Y") {
      true
    }
    else {
      false
    }
  }
}
