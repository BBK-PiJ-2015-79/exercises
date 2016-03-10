/**
  * Created by chris on 10/03/2016.
  */
class InputValidator {
  def isValidGuessString(inputString: String, codeSize: Int) : Boolean = {
    inputString.toCharArray.forall(c => c.isLetter) && inputString.length == codeSize
  }
}
