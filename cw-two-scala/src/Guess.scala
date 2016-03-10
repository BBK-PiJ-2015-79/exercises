class Guess(val coloursGuessed: Vector[Colour]) {
  override def toString = coloursGuessed.mkString("")
}
