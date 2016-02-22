package namdefargs

/**
  * Created by chris on 21/02/2016.
  */
class Planet(description: String, name: String, moons: Int = 1) {
  def hasMoon() = moons > 0
}
