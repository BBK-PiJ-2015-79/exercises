/**
  * Created by chris on 26/01/2016.
  */
class Sailboat {
  def raise(): String = {
    "Sails raised"
  }
  def lower(): String = {
    "Sails lowered"
  }
  def signal(): String = {
    (new Flare).light()
  }
}
