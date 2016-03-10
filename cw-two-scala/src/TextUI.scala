import scala.io.StdIn._

class TextUI {
  //TODO handle variable number of colours/guesses
  def greet() = {
    println("""Welcome to Mastermind.

This is a text version of the classic board game Mastermind.
The computer will think of a secret code.
The code consists of 4 colored pegs.
The pegs may be one of six colors: blue, green , orange, purple, red, or yellow.
A color may appear more than once in the code.

You try to guess what colored pegs are in the code and what order they are in
After making a guess the result will be displayed.
A result consists of a black peg for each peg you have exactly correct (color and position) in your guess.
For each peg in the guess that is the correct color, but is out of position, you get a white peg.

Only the first letter of the color is displayed. B for Blue, R for Red, and so forth.
When entering guesses you only need to enter the first character of the color as a capital letter.

You have 12 to guess the answer or you lose the game.

Generating secret code ....
The secret code is YRBY
You have 12 guesses left.

What is your next guess?
Type in the characters for your guess and press enter.
Enter guess: OOOO""")
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
  def getGuess() = {
    val guessString = readLine()
    guessString
  }
  def showFeedback(guessHistory : Array[(Guess, Feedback)], size: Int) = {
    guessHistory.foreach(t => {
      if(t == null) {
        // print null feedback
        println("." * size)
      }
      else {
        // print
        println(t._1 + " Result: " + t._2)
      }
    })
  }

}
