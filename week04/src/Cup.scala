class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    else if(percentFull < 0) {
      percentFull = 0
    }
    percentFull // Return this value
  }
  def get(): Int = {
    percentFull
  }
  def set(newPercent: Int): Unit = {
    percentFull = newPercent
  }
}
